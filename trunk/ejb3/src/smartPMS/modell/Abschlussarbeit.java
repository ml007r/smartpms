package smartPMS.modell;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * Created by IntelliJ IDEA.
 * User: MG
 * Date: 26.05.2008
 * Time: 13:25:07
 * To change this template use File | Settings | File Templates.
 */
@Entity
@Table(name = "ABSCHLUSSARBEIT")
public class Abschlussarbeit implements Serializable {

    private long id;

    public enum AbschlussarbeitTyp {
        DIPLOM, BACHELOR, MASTER
    }

    private AbschlussarbeitTyp typ;

    private String thema;

    private String beschreibung;

    private Date abgabetermin;

    private double note;

    private double ects = 30.0;

    // TODO Dozent -> Professor
    private Dozent professor;

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
    public Abschlussarbeit(AbschlussarbeitTyp typ, String thema, String beschreibung, Date abgabetermin, double note, double ects) {
        this.typ = typ;
        this.thema = thema;
        this.beschreibung = beschreibung;
        this.abgabetermin = abgabetermin;
        this.note = note;
        this.ects = ects;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "abschlussarbeitId")
    @SequenceGenerator(name = "abschlussarbeitId", sequenceName = "SEQ_ABSCHLUSSARBEIT_ID", allocationSize = 1)
    @Column(name = "ID", precision = 10, scale = 0)
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Enumerated(EnumType.ORDINAL)
    @Column(name = "TYP", precision = 1, scale = 0, nullable = false)
    public AbschlussarbeitTyp getTyp() {
        return typ;
    }

    public void setTyp(AbschlussarbeitTyp typ) {
        this.typ = typ;
    }

    @Column(name = "THEMA", length = 150, nullable = false)
    public String getThema() {
        return thema;
    }

    public void setThema(String thema) {
        this.thema = thema;
    }

    @Column(name = "BESCHREIBUNG", length = 255, nullable = false)
    public String getBeschreibung() {
        return beschreibung;
    }

    public void setBeschreibung(String beschreibung) {
        this.beschreibung = beschreibung;
    }

    @Temporal(TemporalType.DATE)
    @Column(name = "ABGABETERMIN")
    public Date getAbgabetermin() {
        return abgabetermin;
    }

    public void setAbgabetermin(Date abgabetermin) {
        this.abgabetermin = abgabetermin;
    }

    @Column(name = "NOTE", precision = 1, scale = 1)
    public double getNote() {
        return note;
    }

    public void setNote(double note) {
        this.note = note;
    }

    @Column(name = "ECTS", precision = 2, scale = 1)
    public double getEcts() {
        return ects;
    }

    public void setEcts(double ects) {
        this.ects = ects;
    }

    @ManyToOne()
    public Dozent getProfessor() {
        return professor;
    }

    public void setProfessor(Dozent professor) {
        this.professor = professor;
    }

    @ManyToOne()
    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }
}
