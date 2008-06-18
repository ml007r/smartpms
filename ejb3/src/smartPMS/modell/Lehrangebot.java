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

    private Collection<Dokument> dokumente;

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

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "lehrangebot")
    public Collection<Dokument> getDokumente() {
        return dokumente;
    }

    public void setDokumente(Collection<Dokument> dokumente) {
        this.dokumente = dokumente;
    }

    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Lehrangebot)) return false;

        Lehrangebot that = (Lehrangebot) o;

        if (id != that.id) return false;
        if (bezeichnung != null ? !bezeichnung.equals(that.bezeichnung) : that.bezeichnung != null) return false;
        if (dokumente != null ? !dokumente.equals(that.dokumente) : that.dokumente != null) return false;
        if (dozent != null ? !dozent.equals(that.dozent) : that.dozent != null) return false;
        if (klausuren != null ? !klausuren.equals(that.klausuren) : that.klausuren != null) return false;
        if (nummer != null ? !nummer.equals(that.nummer) : that.nummer != null) return false;
        if (termine != null ? !termine.equals(that.termine) : that.termine != null) return false;

        return true;
    }

    public int hashCode() {
        int result;
        result = (int) (id ^ (id >>> 32));
        result = 31 * result + (nummer != null ? nummer.hashCode() : 0);
        result = 31 * result + (bezeichnung != null ? bezeichnung.hashCode() : 0);
        result = 31 * result + (dozent != null ? dozent.hashCode() : 0);
        result = 31 * result + (klausuren != null ? klausuren.hashCode() : 0);
        result = 31 * result + (termine != null ? termine.hashCode() : 0);
        result = 31 * result + (dokumente != null ? dokumente.hashCode() : 0);
        return result;
    }
}
