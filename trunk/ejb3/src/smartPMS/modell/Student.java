package smartPMS.modell;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Date;

/**
 * Created by IntelliJ IDEA.
 * User: tbs
 * Date: 26.05.2008
 * Time: 11:55:24
 * To change this template use File | Settings | File Templates.
 */
@Entity
@Table(name = "student")
@DiscriminatorValue("S")
public class Student extends Person {

    private long matrikelnummer;

    private String studiengang;

    private int semester;

    /**
     *
     */
    protected Student() {
    }

    /**
     * @param anrede
     * @param vorname
     * @param nachname
     * @param matrikelnummer
     * @param studiengang
     */
    public Student(String anrede, String vorname, String nachname, long matrikelnummer, String studiengang) {
        super(anrede, vorname, nachname);
        this.matrikelnummer = matrikelnummer;
        this.studiengang = studiengang;
    }

    /**
     * @param anrede
     * @param vorname
     * @param nachname
     * @param anschrift1
     * @param anschrift2
     * @param postleitzahl
     * @param wohnort
     * @param telefon
     * @param telefax
     * @param mobiltelefon
     * @param email
     * @param geburtsdatum
     * @param matrikelnummer
     * @param studiengang
     */
    public Student(String anrede, String vorname, String nachname, String anschrift1, String anschrift2, String postleitzahl, String wohnort, String telefon, String telefax, String mobiltelefon, String email, Date geburtsdatum, long matrikelnummer, String studiengang) {
        super(anrede, vorname, nachname, anschrift1, anschrift2, postleitzahl, wohnort, telefon, telefax, mobiltelefon, email, geburtsdatum);
        this.matrikelnummer = matrikelnummer;
        this.studiengang = studiengang;
    }

    @Column(name = "matrikelnummer", precision = 10, scale = 0)
    public long getMatrikelnummer() {
        return matrikelnummer;
    }

    public void setMatrikelnummer(long matrikelnummer) {
        this.matrikelnummer = matrikelnummer;
    }

    @Column(name = "studiengang", length = 100, nullable = false)
    public String getStudiengang() {
        return studiengang;
    }

    public void setStudiengang(String studiengang) {
        this.studiengang = studiengang;
    }

    @Column(name = "semester", precision = 2, scale = 0)
    public int getSemester() {
        return semester;
    }

    public void setSemester(int semester) {
        this.semester = semester;
    }
}
