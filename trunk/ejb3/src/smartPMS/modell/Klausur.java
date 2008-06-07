package smartPMS.modell;

import javax.persistence.*;
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

    private Date beginn;

    private Date ende;

    private double ects = 5.0;

    private double mindestEcts = 0.0;

    private Lehrangebot lehrangebot;

    //private Collection<Teilnahme> teilnahmen;

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
    @Column(name = "id", precision = 10, scale = 0)
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "beginn")
    public Date getBeginn() {
        return beginn;
    }

    public void setBeginn(Date beginn) {
        this.beginn = beginn;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "ende")
    public Date getEnde() {
        return ende;
    }

    public void setEnde(Date ende) {
        this.ende = ende;
    }

    @Column(name = "ects", precision = 2, scale = 1)
    public double getEcts() {
        return ects;
    }

    public void setEcts(double ects) {
        this.ects = ects;
    }

    @ManyToOne
    public Lehrangebot getLehrangebot() {
        return lehrangebot;
    }

    public void setLehrangebot(Lehrangebot lehrangebot) {
        this.lehrangebot = lehrangebot;
    }

//    @OneToMany(cascade = CascadeType.ALL, mappedBy = "klausur")
//    public Collection<Teilnahme> getTeilnahmen() {
//        return teilnahmen;
//    }
//
//    public void setTeilnahmen(Collection<Teilnahme> teilnahmen) {
//        this.teilnahmen = teilnahmen;
//    }
}
