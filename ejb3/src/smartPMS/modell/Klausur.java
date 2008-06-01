package smartPMS.modell;

import javax.persistence.*;
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
@Table(name = "Klausur")
public class Klausur {

    private long id;

    private Date datum;

    private Date beginn;

    private Date ende;

    private double ects = 5.0;

    //

    private Lehrangebot lehrangebot;

    private Collection<Teilnahme> teilnahmen;

    /**
     *
     */
    protected Klausur() {
    }


    /**
     * @param datum
     * @param beginn
     * @param ende
     * @param ects
     */
    public Klausur(Date datum, Date beginn, Date ende, double ects) {
        this.datum = datum;
        this.beginn = beginn;
        this.ende = ende;
        this.ects = ects;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_klausur_id")
    @SequenceGenerator(name = "seq_klausur_id", sequenceName = "seq_klausur_id", allocationSize = 1)
    @Column(name = "id", precision = 10, scale = 0)
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Temporal(TemporalType.DATE)
    @Column(name = "datum")
    public Date getDatum() {
        return datum;
    }

    public void setDatum(Date datum) {
        this.datum = datum;
    }

    @Temporal(TemporalType.TIME)
    @Column(name = "beginn")
    public Date getBeginn() {
        return beginn;
    }

    public void setBeginn(Date beginn) {
        this.beginn = beginn;
    }

    @Temporal(TemporalType.TIME)
    @Column(name = "ende")
    public Date getEnde() {
        return ende;
    }

    public void setEnde(Date ende) {
        this.ende = ende;
    }

    @Column(name = "ects", precision = 1, scale = 1)
    public double getEcts() {
        return ects;
    }

    public void setEcts(double ects) {
        this.ects = ects;
    }

    public Lehrangebot getLehrangebot() {
        return lehrangebot;
    }

    public void setLehrangebot(Lehrangebot lehrangebot) {
        this.lehrangebot = lehrangebot;
    }

    public Collection<Teilnahme> getTeilnahmen() {
        return teilnahmen;
    }

    public void setTeilnahmen(Collection<Teilnahme> teilnahmen) {
        this.teilnahmen = teilnahmen;
    }
}
