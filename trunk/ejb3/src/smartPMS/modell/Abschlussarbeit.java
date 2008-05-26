package smartPMS.modell;

import javax.persistence.Entity;
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

    private String typ;
    private String thema;
    private String beschreibung;
    private Date abgabetermin;
    private double note;
    private double ects = 30.0;


    protected Abschlussarbeit() {

    }

    /**
     *
     * @param typ
     * @param thema
     * @param beschreibung
     * @param abgabetermin
     * @param note
     * @param ects
     */
    public Abschlussarbeit(String typ, String thema, String beschreibung, Date abgabetermin, double note, double ects) {
        this.typ = typ;
        this.thema = thema;
        this.beschreibung = beschreibung;
        this.abgabetermin = abgabetermin;
        this.note = note;
        this.ects = ects;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTyp() {
        return typ;
    }

    public void setTyp(String typ) {
        this.typ = typ;
    }

    public String getThema() {
        return thema;
    }

    public void setThema(String thema) {
        this.thema = thema;
    }

    public String getBeschreibung() {
        return beschreibung;
    }

    public void setBeschreibung(String beschreibung) {
        this.beschreibung = beschreibung;
    }

    public Date getAbgabetermin() {
        return abgabetermin;
    }

    public void setAbgabetermin(Date abgabetermin) {
        this.abgabetermin = abgabetermin;
    }

    public double getNote() {
        return note;
    }

    public void setNote(double note) {
        this.note = note;
    }

    public double getEcts() {
        return ects;
    }

    public void setEcts(double ects) {
        this.ects = ects;
    }
}
