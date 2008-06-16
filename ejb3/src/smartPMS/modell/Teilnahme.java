package smartPMS.modell;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by IntelliJ IDEA.
 * User: tbs
 * Date: 31.05.2008
 * Time: 10:34:29
 * To change this template use File | Settings | File Templates.
 */
@Entity
@Table(name = "teilnahme")
public class Teilnahme implements Serializable {

    @EmbeddedId
    private TeilnahmePK primaryKey;

    private Student student;

    private Klausur klausur;

    private int versuch = 1;

    private double note;

    /**
     * Standardkonstruktor
     */
    protected Teilnahme() {
    }

    /**
     * Pflichtkonstruktor
     *
     * @param student
     * @param klausur
     */
    public Teilnahme(Student student, Klausur klausur) {
        this.student = student;
        this.klausur = klausur;
    }

    @ManyToOne
    @JoinColumn(name = "student", referencedColumnName = "id", insertable = false, updatable = false)
    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    @ManyToOne
    @JoinColumn(name = "klausur", referencedColumnName = "id", insertable = false, updatable = false)
    public Klausur getKlausur() {
        return klausur;
    }

    public void setKlausur(Klausur klausur) {
        this.klausur = klausur;
    }

    @Column(name = "versuch")
    public int getVersuch() {
        return versuch;
    }

    public void setVersuch(int versuch) {
        this.versuch = versuch;
    }

    @Column(name = "versuch", precision = 2, scale = 0)
    public double getNote() {
        return note;
    }

    public void setNote(double note) {
        this.note = note;
    }
}
