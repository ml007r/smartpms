package smartPMS.modell;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by IntelliJ IDEA.
 * User: MG
 * Date: 26.05.2008
 * Time: 13:47:33
 * To change this template use File | Settings | File Templates.
 */
@Entity
@Table(name = "termin")
public class Termin {

    public enum TYP {
        VORLESUNG, UEBUNG, PRAKTIKUM, TUTORIUM
    }

    ;

    private long id;

    @Enumerated(EnumType.ORDINAL)
    private TYP typ;

    private String raum;

    private int wochentag;

    private Date beginn;

    private Date ende;

    private Lehrangebot lehrangebot;

    /**
     *
     */
    protected Termin() {
    }

    /**
     * Pflichtkonstruktor
     *
     * @param typ
     * @param wochentag
     * @param beginn
     * @param ende
     * @param lehrangebot
     */
    public Termin(TYP typ, int wochentag, Date beginn, Date ende, Lehrangebot lehrangebot) {
        this.typ = typ;
        this.wochentag = wochentag;
        this.beginn = beginn;
        this.ende = ende;
        this.lehrangebot = lehrangebot;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "terminId")
    @SequenceGenerator(name = "terminId", sequenceName = "seq_termin_id", allocationSize = 1)
    @Column(name = "id", precision = 10, scale = 0)
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Column(name = "typ", precision = 1, scale = 0, nullable = false)
    public TYP getTyp() {
        return typ;
    }

    public void setTyp(TYP typ) {
        this.typ = typ;
    }

    @Column(name = "raum", length = 5)
    public String getRaum() {
        return raum;
    }

    public void setRaum(String raum) {
        this.raum = raum;
    }

    @Column(name = "wochentag", precision = 1, scale = 0)
    public int getWochentag() {
        return wochentag;
    }

    public void setWochentag(int wochentag) {
        this.wochentag = wochentag;
    }

    @Temporal(TemporalType.TIME)
    @Column(name = "beginn", nullable = false)
    public Date getBeginn() {
        return beginn;
    }

    public void setBeginn(Date beginn) {
        this.beginn = beginn;
    }

    @Temporal(TemporalType.TIME)
    @Column(name = "ende", nullable = false)
    public Date getEnde() {
        return ende;
    }

    public void setEnde(Date ende) {
        this.ende = ende;
    }

    @ManyToOne
    public Lehrangebot getLehrangebot() {
        return lehrangebot;
    }

    public void setLehrangebot(Lehrangebot lehrangebot) {
        this.lehrangebot = lehrangebot;
    }
}
