package smartPMS.modell;

import javax.persistence.*;
import java.util.Collection;

/**
 * Created by IntelliJ IDEA.
 * User: Marcel
 * Date: 26.05.2008
 * Time: 11:54:15
 * To change this template use File | Settings | File Templates.
 */
@Entity
@Table(name = "lehrangebot")
public class Lehrangebot {

    private long id;

    private String nummer;

    private String bezeichnung;

    private Dozent dozent;

    private Collection<Klausur> klausuren;

    private Collection<Termin> termine;

    protected Lehrangebot() {
    }

    /**
     * Standard & Vollständiger Konstruktor
     *
     * @param nummer
     * @param bezeichnung
     * @param dozent
     */
    public Lehrangebot(String nummer, String bezeichnung, Dozent dozent) {
        this.nummer = nummer;
        this.bezeichnung = bezeichnung;
        this.dozent = dozent;
    }


    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "lehrangebotId")
    @SequenceGenerator(name = "lehrangebotId", sequenceName = "seq_lehrangebot_id", allocationSize = 1)
    @Column(name = "id", precision = 10, scale = 0)
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Column(name = "nummer", length = 10, nullable = false)
    public String getNummer() {
        return nummer;
    }

    public void setNummer(String nummer) {
        this.nummer = nummer;
    }

    @Column(name = "bezeichnung", length = 100, nullable = false)
    public String getBezeichnung() {
        return bezeichnung;
    }

    public void setBezeichnung(String bezeichnung) {
        this.bezeichnung = bezeichnung;
    }

    @ManyToOne
    public Dozent getDozent() {
        return dozent;
    }

    public void setDozent(Dozent dozent) {
        this.dozent = dozent;
    }

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "lehrangebot")
    public Collection<Klausur> getKlausuren() {
        return klausuren;
    }

    public void setKlausuren(Collection<Klausur> klausuren) {
        this.klausuren = klausuren;
    }

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "lehrangebot")
    public Collection<Termin> getTermine() {
        return termine;
    }

    public void setTermine(Collection<Termin> termine) {
        this.termine = termine;
    }
}
