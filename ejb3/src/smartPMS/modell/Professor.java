package smartPMS.modell;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Date;

/**
 * Created by IntelliJ IDEA.
 * User: tbs
 * Date: 18.06.2008
 * Time: 18:42:36
 * To change this template use File | Settings | File Templates.
 */
@Entity
@Table(name = "PROFESSOR")
@DiscriminatorValue("P")
public class Professor extends Dozent {

    private String fachgebiet;

    private String passwort;

    protected Professor() {
    }

    public Professor(String anrede, String vorname, String nachname, String anschrift1, String anschrift2, String postleitzahl, String wohnort, String telefon, String telefax, String mobiltelefon, String email, Date geburtsdatum, String titel, String buero, String fachgebiet, String passwort) {
        super(anrede, vorname, nachname, anschrift1, anschrift2, postleitzahl, wohnort, telefon, telefax, mobiltelefon, email, geburtsdatum, titel, buero);
        this.fachgebiet = fachgebiet;
        this.passwort = passwort;
    }

    @Column(name = "FACHGEBIET", length = 100, nullable = false)
    public String getFachgebiet() {
        return fachgebiet;
    }

    public void setFachgebiet(String fachgebiet) {
        this.fachgebiet = fachgebiet;
    }

    @Column(name = "PASSWORT", length = 100, nullable = false)
    public String getPasswort() {
        return passwort;
    }

    public void setPasswort(String passwort) {
        this.passwort = passwort;
    }

    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Professor)) return false;
        if (!super.equals(o)) return false;

        Professor professor = (Professor) o;

        if (fachgebiet != null ? !fachgebiet.equals(professor.fachgebiet) : professor.fachgebiet != null) return false;

        return true;
    }

    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (fachgebiet != null ? fachgebiet.hashCode() : 0);
        return result;
    }
}
