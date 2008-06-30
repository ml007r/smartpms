package smartPMS.modell;

import javax.persistence.*;
import java.util.Collection;
import java.util.Date;

/**
 * Created by IntelliJ IDEA.
 * User: tbs
 * Date: 26.05.2008
 * Time: 11:58:49
 * To change this template use File | Settings | File Templates.
 */
@Entity
@Table(name = "DOZENT")
@DiscriminatorValue("D")
public class Dozent extends Person {

    private String titel;

    private String buero;

    private Collection<Lehrangebot> lehrangebot;

    protected Dozent() {
    }

    public Dozent(String anrede, String vorname, String nachname, String anschrift1, String anschrift2, String postleitzahl, String wohnort, String telefon, String telefax, String mobiltelefon, String email, Date geburtsdatum, String titel) {
        super(
                anrede, vorname, nachname, anschrift1, anschrift2, postleitzahl, wohnort, telefon, telefax,
                mobiltelefon, email, geburtsdatum
        );
        this.titel = titel;
    }

    public Dozent(String anrede, String vorname, String nachname, String anschrift1, String anschrift2, String postleitzahl, String wohnort, String telefon, String telefax, String mobiltelefon, String email, Date geburtsdatum, String titel, String buero) {
        super(
                anrede, vorname, nachname, anschrift1, anschrift2, postleitzahl, wohnort, telefon, telefax,
                mobiltelefon, email, geburtsdatum
        );
        this.titel = titel;
        this.buero = buero;
    }

    @Column(name = "TITEL", length = 20, nullable = false)
    public String getTitel() {
        return titel;
    }

    public void setTitel(String titel) {
        this.titel = titel;
    }

    @Column(name = "BUERO", length = 20, unique = true)
    public String getBuero() {
        return buero;
    }

    public void setBuero(String buero) {
        this.buero = buero;
    }

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "dozent")
    public Collection<Lehrangebot> getLehrangebot() {
        return lehrangebot;
    }

    public void setLehrangebot(Collection<Lehrangebot> lehrangebot) {
        this.lehrangebot = lehrangebot;
    }

    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Dozent)) return false;
        if (!super.equals(o)) return false;

        Dozent dozent = (Dozent) o;

        if (buero != null ? !buero.equals(dozent.buero) : dozent.buero != null) return false;
        if (lehrangebot != null ? !lehrangebot.equals(dozent.lehrangebot) : dozent.lehrangebot != null) return false;
        if (titel != null ? !titel.equals(dozent.titel) : dozent.titel != null) return false;

        return true;
    }

    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (titel != null ? titel.hashCode() : 0);
        result = 31 * result + (buero != null ? buero.hashCode() : 0);
        result = 31 * result + (lehrangebot != null ? lehrangebot.hashCode() : 0);
        return result;
    }
}
