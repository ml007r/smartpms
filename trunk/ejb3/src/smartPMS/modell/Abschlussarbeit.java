package smartPMS.modell;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by IntelliJ IDEA.
 * User: MG
 * Date: 26.05.2008
 * Time: 13:25:07
 * To change this template use File | Settings | File Templates.
 */
@Entity
public class Abschlussarbeit {

    private long id;

    public enum TYP_ABSCHLUSSARBEIT {
        DIPLOM, BACHELOR, MASTER
    }

    private TYP_ABSCHLUSSARBEIT typ;

    private String thema;

    private String beschreibung;

    private Date abgabetermin;

    private double note;

    private double ects = 30.0;

    private Professor professor;

    private Student student;

    /**
     *
     */
    protected Abschlussarbeit() {
    }

    /**
     * @param typ
     * @param thema
     * @param beschreibung
     * @param abgabetermin
     * @param note
     * @param ects
     */
    public Abschlussarbeit(TYP_ABSCHLUSSARBEIT typ, String thema, String beschreibung, Date abgabetermin, double note, double ects) {
        this.typ = typ;
        this.thema = thema;
        this.beschreibung = beschreibung;
        this.abgabetermin = abgabetermin;
        this.note = note;
        this.ects = ects;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_abschlussarbeit_id")
    @SequenceGenerator(name = "seq_abschlussarbeit_id", sequenceName = "seq_abschlussarbeit_id", allocationSize = 1)
    @Column(name = "id", precision = 10, scale = 0)
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Column(name = "typ", precision = 1, scale = 0, nullable = false)
    public TYP_ABSCHLUSSARBEIT getTyp() {
        return typ;
    }

    public void setTyp(TYP_ABSCHLUSSARBEIT typ) {
        this.typ = typ;
    }

    @Column(name = "thema", length = 150, nullable = false)
    public String getThema() {
        return thema;
    }

    public void setThema(String thema) {
        this.thema = thema;
    }

    @Column(name = "thema", length = 1000, nullable = false)
    public String getBeschreibung() {
        return beschreibung;
    }

    public void setBeschreibung(String beschreibung) {
        this.beschreibung = beschreibung;
    }

    @Temporal(TemporalType.DATE)
    @Column(name = "abgabetermin")
    public Date getAbgabetermin() {
        return abgabetermin;
    }

    public void setAbgabetermin(Date abgabetermin) {
        this.abgabetermin = abgabetermin;
    }

    @Column(name = "note", precision = 1, scale = 1)
    public double getNote() {
        return note;
    }

    public void setNote(double note) {
        this.note = note;
    }

    @Column(name = "ects", precision = 2, scale = 1)
    public double getEcts() {
        return ects;
    }

    public void setEcts(double ects) {
        this.ects = ects;
    }
}
