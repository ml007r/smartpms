package smartPMS.transfer;

import smartPMS.modell.Abschlussarbeit;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by IntelliJ IDEA.
 * User: tbs
 * Date: 14.06.2008
 * Time: 21:47:37
 * To change this template use File | Settings | File Templates.
 */
public class AbschlussarbeitVO implements Serializable {

    private long id;

    private Abschlussarbeit.AbschlussarbeitTyp typ;

    private String thema;

    private String beschreibung;

    private Date abgabetermin;

    private double note;

    private double ects = 30.0;

    private long professorId;

    private long studentId;

    public AbschlussarbeitVO() {
    }

    public AbschlussarbeitVO(long id, Abschlussarbeit.AbschlussarbeitTyp typ, String thema, String beschreibung, Date abgabetermin, double note, double ects, long professorId, long studentId) {
        this.id = id;
        this.typ = typ;
        this.thema = thema;
        this.beschreibung = beschreibung;
        this.abgabetermin = abgabetermin;
        this.note = note;
        this.ects = ects;
        this.professorId = professorId;
        this.studentId = studentId;
    }

    public AbschlussarbeitVO(Abschlussarbeit a) {
        this.id = a.getId();
        this.typ = a.getTyp();
        this.thema = a.getThema();
        this.beschreibung = a.getBeschreibung();
        this.abgabetermin = a.getAbgabetermin();
        this.note = a.getNote();
        this.ects = a.getEcts();
        this.professorId = a.getProfessor().getId();
        this.studentId = a.getStudent().getId();
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Abschlussarbeit.AbschlussarbeitTyp getTyp() {
        return typ;
    }

    public void setTyp(Abschlussarbeit.AbschlussarbeitTyp typ) {
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

    public long getProfessorId() {
        return professorId;
    }

    public void setProfessorId(long professorId) {
        this.professorId = professorId;
    }

    public long getStudentId() {
        return studentId;
    }

    public void setStudentId(long studentId) {
        this.studentId = studentId;
    }
}
