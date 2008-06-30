package smartPMS.modell;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Collection;
import java.util.Date;

/**
 * Created by IntelliJ IDEA.
 * User: MG
 * Date: 26.05.2008
 * Time: 13:05:16
 * To change this template use File | Settings | File Templates.
 */
@Entity
@Table(name = "KLAUSUR")
public class Klausur implements Serializable {

    private long id;

    private Date beginn;

    private Date ende;

    private double ects = 5.0;

    private double mindestEcts = 0.0;

    private Lehrangebot lehrangebot;

    private Collection<Teilnahme> teilnahmen;

    /**
     *
     */
    protected Klausur() {
    }


    /**
     * Mindestkonstruktor
     *
     * @param beginn
     * @param ende
     * @param lehrangebot
     */
    public Klausur(Date beginn, Date ende, Lehrangebot lehrangebot) {
        this.beginn = beginn;
        this.ende = ende;
        this.lehrangebot = lehrangebot;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "klausurId")
    @SequenceGenerator(name = "klausurId", sequenceName = "seq_klausur_id", allocationSize = 1)
    @Column(name = "ID", precision = 10, scale = 0)
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "BEGINN")
    public Date getBeginn() {
        return beginn;
    }

    public void setBeginn(Date beginn) {
        this.beginn = beginn;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "ENDE")
    public Date getEnde() {
        return ende;
    }

    public void setEnde(Date ende) {
        this.ende = ende;
    }

    @Column(name = "ECTS", precision = 2, scale = 1)
    public double getEcts() {
        return ects;
    }

    public void setEcts(double ects) {
        this.ects = ects;
    }

    @Column(name = "MINDEST_ECTS", precision = 2, scale = 1)
    public double getMindestEcts() {
        return mindestEcts;
    }

    public void setMindestEcts(double mindestEcts) {
        this.mindestEcts = mindestEcts;
    }

    @ManyToOne
    public Lehrangebot getLehrangebot() {
        return lehrangebot;
    }

    public void setLehrangebot(Lehrangebot lehrangebot) {
        this.lehrangebot = lehrangebot;
    }

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "klausur")
    public Collection<Teilnahme> getTeilnahmen() {
        return teilnahmen;
    }

    public void setTeilnahmen(Collection<Teilnahme> teilnahmen) {
        this.teilnahmen = teilnahmen;
    }


    // Wrapper für JSP Seiten
    @Transient
    public int getAnzahlTeilnahmen() {
        return teilnahmen.size();
    }
}
