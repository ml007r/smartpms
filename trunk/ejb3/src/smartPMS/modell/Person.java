package smartPMS.modell;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * Created by IntelliJ IDEA.
 * User: tbs
 * Date: 26.05.2008
 * Time: 11:46:03
 * To change this template use File | Settings | File Templates.
 */
@Entity
@Table(name = "PERSON")
@Inheritance(strategy = InheritanceType.JOINED)
@DiscriminatorColumn(name = "TYP")
public abstract class Person implements Serializable {

    private long id;

    public enum PersonType {
        STUDENT, HILFSKRAFT, DOZENT, PROFESSOR
    }

    // NameT

    private String anrede;

    private String vorname;

    private String nachname;

    // AdresseT

    private String anschrift1;

    private String anschrift2;

    private String postleitzahl;

    private String wohnort;

    // KontaktT

    private String telefon;

    private String telefax;

    private String mobiltelefon;

    private String email;

    //

    private Date geburtsdatum;

    protected Person() {
    }

    /**
     * Minimaler Konstruktor
     *
     * @param anrede
     * @param vorname
     * @param nachname
     */
    protected Person(String anrede, String vorname, String nachname) {
        this.anrede = anrede;
        this.vorname = vorname;
        this.nachname = nachname;
    }

    /**
     * Vollständiger Konstruktor
     *
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
     */
    protected Person(String anrede, String vorname, String nachname, String anschrift1, String anschrift2, String postleitzahl, String wohnort, String telefon, String telefax, String mobiltelefon, String email, Date geburtsdatum) {
        this.anrede = anrede;
        this.vorname = vorname;
        this.nachname = nachname;
        this.anschrift1 = anschrift1;
        this.anschrift2 = anschrift2;
        this.postleitzahl = postleitzahl;
        this.wohnort = wohnort;
        this.telefon = telefon;
        this.telefax = telefax;
        this.mobiltelefon = mobiltelefon;
        this.email = email;
        this.geburtsdatum = geburtsdatum;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "personId")
    @SequenceGenerator(name = "personId", sequenceName = "SEQ_PERSON_ID", allocationSize = 1)
    @Column(name = "ID", precision = 10, scale = 0)
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Column(name = "ANREDE", length = 4, nullable = false)
    public String getAnrede() {
        return anrede;
    }

    public void setAnrede(String anrede) {
        this.anrede = anrede;
    }

    @Column(name = "VORNAME", length = 50, nullable = false)
    public String getVorname() {
        return vorname;
    }

    public void setVorname(String vorname) {
        this.vorname = vorname;
    }

    @Column(name = "NACHNAME", length = 100, nullable = false)
    public String getNachname() {
        return nachname;
    }

    public void setNachname(String nachname) {
        this.nachname = nachname;
    }

    @Transient
    public String getName() {
        return vorname + " " + nachname;
    }

    @Column(name = "ANSCHRIFT1", length = 100)
    public String getAnschrift1() {
        return anschrift1;
    }

    public void setAnschrift1(String anschrift1) {
        this.anschrift1 = anschrift1;
    }

    @Column(name = "ANSCHRIFT2", length = 100)
    public String getAnschrift2() {
        return anschrift2;
    }

    public void setAnschrift2(String anschrift2) {
        this.anschrift2 = anschrift2;
    }

    @Column(name = "POSTLEITZAHL", length = 5)
    public String getPostleitzahl() {
        return postleitzahl;
    }

    public void setPostleitzahl(String postleitzahl) {
        this.postleitzahl = postleitzahl;
    }

    @Column(name = "WOHNORT", length = 100)
    public String getWohnort() {
        return wohnort;
    }

    public void setWohnort(String wohnort) {
        this.wohnort = wohnort;
    }

    @Column(name = "TELEFON", length = 20)
    public String getTelefon() {
        return telefon;
    }

    public void setTelefon(String telefon) {
        this.telefon = telefon;
    }

    @Column(name = "TELEFAX", length = 20)
    public String getTelefax() {
        return telefax;
    }

    public void setTelefax(String telefax) {
        this.telefax = telefax;
    }

    @Column(name = "MOBILTELEFON", length = 20)
    public String getMobiltelefon() {
        return mobiltelefon;
    }

    public void setMobiltelefon(String mobiltelefon) {
        this.mobiltelefon = mobiltelefon;
    }

    @Column(name = "EMAIL", length = 255)
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Temporal(TemporalType.DATE)
    @Column(name = "GEBURTSDATUM")
    public Date getGeburtsdatum() {
        return geburtsdatum;
    }

    public void setGeburtsdatum(Date geburtsdatum) {
        this.geburtsdatum = geburtsdatum;
    }

    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Person)) return false;

        Person person = (Person) o;

        if (id != person.id) return false;
        if (anrede != null ? !anrede.equals(person.anrede) : person.anrede != null) return false;
        if (anschrift1 != null ? !anschrift1.equals(person.anschrift1) : person.anschrift1 != null) return false;
        if (anschrift2 != null ? !anschrift2.equals(person.anschrift2) : person.anschrift2 != null) return false;
        if (email != null ? !email.equals(person.email) : person.email != null) return false;
        if (geburtsdatum != null ? !geburtsdatum.equals(person.geburtsdatum) : person.geburtsdatum != null)
            return false;
        if (mobiltelefon != null ? !mobiltelefon.equals(person.mobiltelefon) : person.mobiltelefon != null)
            return false;
        if (nachname != null ? !nachname.equals(person.nachname) : person.nachname != null) return false;
        if (postleitzahl != null ? !postleitzahl.equals(person.postleitzahl) : person.postleitzahl != null)
            return false;
        if (telefax != null ? !telefax.equals(person.telefax) : person.telefax != null) return false;
        if (telefon != null ? !telefon.equals(person.telefon) : person.telefon != null) return false;
        if (vorname != null ? !vorname.equals(person.vorname) : person.vorname != null) return false;
        if (wohnort != null ? !wohnort.equals(person.wohnort) : person.wohnort != null) return false;

        return true;
    }

    public int hashCode() {
        int result;
        result = (int) (id ^ (id >>> 32));
        result = 31 * result + (anrede != null ? anrede.hashCode() : 0);
        result = 31 * result + (vorname != null ? vorname.hashCode() : 0);
        result = 31 * result + (nachname != null ? nachname.hashCode() : 0);
        result = 31 * result + (anschrift1 != null ? anschrift1.hashCode() : 0);
        result = 31 * result + (anschrift2 != null ? anschrift2.hashCode() : 0);
        result = 31 * result + (postleitzahl != null ? postleitzahl.hashCode() : 0);
        result = 31 * result + (wohnort != null ? wohnort.hashCode() : 0);
        result = 31 * result + (telefon != null ? telefon.hashCode() : 0);
        result = 31 * result + (telefax != null ? telefax.hashCode() : 0);
        result = 31 * result + (mobiltelefon != null ? mobiltelefon.hashCode() : 0);
        result = 31 * result + (email != null ? email.hashCode() : 0);
        result = 31 * result + (geburtsdatum != null ? geburtsdatum.hashCode() : 0);
        return result;
    }
}
