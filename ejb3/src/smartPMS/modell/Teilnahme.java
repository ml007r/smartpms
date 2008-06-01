package smartPMS.modell;

import javax.persistence.Entity;

/**
 * Created by IntelliJ IDEA.
 * User: tbs
 * Date: 31.05.2008
 * Time: 10:34:29
 * To change this template use File | Settings | File Templates.
 */
@Entity
public class Teilnahme {

    private long id;

    private double note;

    private int versuch;

    // Assotiationen

    private Student student;

    private Klausur klausur;

    /**
     * Standardkonstruktor
     */
    protected Teilnahme() {
    }

    /**
     * Pflichtkonstruktor
     *
     * @param note
     * @param versuch
     * @param student
     * @param klausur
     */
    public Teilnahme(double note, int versuch, Student student, Klausur klausur) {
        this.note = note;
        this.versuch = versuch;
        this.student = student;
        this.klausur = klausur;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public double getNote() {
        return note;
    }

    public void setNote(double note) {
        this.note = note;
    }

    public int getVersuch() {
        return versuch;
    }

    public void setVersuch(int versuch) {
        this.versuch = versuch;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public Klausur getKlausur() {
        return klausur;
    }

    public void setKlausur(Klausur klausur) {
        this.klausur = klausur;
    }
}
