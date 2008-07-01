package smartPMS.modell;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * Created by IntelliJ IDEA.
 * User: MG
 * Date: 26.05.2008
 * Time: 13:47:33
 * To change this template use File | Settings | File Templates.
 */
@Entity
@Table(name = "TERMIN")
public class Termin implements Serializable {

    public enum TerminTyp {
        VORLESUNG, UEBUNG, PRAKTIKUM, TUTORIUM
    }

    private long id;

    @Enumerated(EnumType.ORDINAL)
    private TerminTyp typ;

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
    public Termin(TerminTyp typ, int wochentag, Date beginn, Date ende, Lehrangebot lehrangebot) {
        this.typ = typ;
        this.wochentag = wochentag;
        this.beginn = beginn;
        this.ende = ende;
        this.lehrangebot = lehrangebot;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "terminId")
    @SequenceGenerator(name = "terminId", sequenceName = "SEQ_TERMIN_ID", allocationSize = 1)
    @Column(name = "ID", precision = 10, scale = 0)
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Column(name = "TYP", precision = 1, scale = 0, nullable = false)
    public TerminTyp getTyp() {
        return typ;
    }

    public void setTyp(TerminTyp typ) {
        this.typ = typ;
    }

    @Column(name = "RAUM", length = 5)
    public String getRaum() {
        return raum;
    }

    public void setRaum(String raum) {
        this.raum = raum;
    }

    @Column(name = "WOCHENTAG", precision = 1, scale = 0)
    public int getWochentag() {
        return wochentag;
    }

    public void setWochentag(int wochentag) {
        this.wochentag = wochentag;
    }

    @Temporal(TemporalType.TIME)
    @Column(name = "BEGINN", nullable = false)
    public Date getBeginn() {
        return beginn;
    }

    public void setBeginn(Date beginn) {
        this.beginn = beginn;
    }

    @Temporal(TemporalType.TIME)
    @Column(name = "ENDE", nullable = false)
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

    @Transient
    public String getTypText() {
        switch (typ) {
            case PRAKTIKUM:
                return "Praktikum";
            case TUTORIUM:
                return "Tutorium";
            case UEBUNG:
                return "Übung";
            case VORLESUNG:
                return "Vorlesung";
        }
        return "";
    }

    @Transient
    public String getWochentagText() {
        switch (wochentag) {
            case 0:
                return "Montag";
            case 1:
                return "Dienstag";
            case 2:
                return "Mittwoch";
            case 3:
                return "Donnerstag";
            case 4:
                return "Freitag";
            case 5:
                return "Samstag";
            case 6:
                return "Sonntag";
        }
        return "";
    }
}
