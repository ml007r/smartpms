package smartPMS.modell;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by IntelliJ IDEA.
 * User: tbs
 * Date: 26.05.2008
 * Time: 11:46:03
 * To change this template use File | Settings | File Templates.
 */
@Entity
@Table(name = "person")
@Inheritance(strategy = InheritanceType.JOINED)
@DiscriminatorColumn(name = "typ")
public abstract class Person {

    private long id;

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
    @SequenceGenerator(name = "personId", sequenceName = "seq_person_id", allocationSize = 1)
    @Column(name = "id", precision = 10, scale = 0)
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Column(name = "anrede", length = 4, nullable = false)
    public String getAnrede() {
        return anrede;
    }

    public void setAnrede(String anrede) {
        this.anrede = anrede;
    }

    @Column(name = "vorname", length = 50, nullable = false)
    public String getVorname() {
        return vorname;
    }

    public void setVorname(String vorname) {
        this.vorname = vorname;
    }

    @Column(name = "nachname", length = 100, nullable = false)
    public String getNachname() {
        return nachname;
    }

    public void setNachname(String nachname) {
        this.nachname = nachname;
    }

    @Column(name = "anschrift1", length = 100)
    public String getAnschrift1() {
        return anschrift1;
    }

    public void setAnschrift1(String anschrift1) {
        this.anschrift1 = anschrift1;
    }

    @Column(name = "anschrift2", length = 100)
    public String getAnschrift2() {
        return anschrift2;
    }

    public void setAnschrift2(String anschrift2) {
        this.anschrift2 = anschrift2;
    }

    @Column(name = "postleitzahl", length = 5)
    public String getPostleitzahl() {
        return postleitzahl;
    }

    public void setPostleitzahl(String postleitzahl) {
        this.postleitzahl = postleitzahl;
    }

    @Column(name = "wohnort", length = 100)
    public String getWohnort() {
        return wohnort;
    }

    public void setWohnort(String wohnort) {
        this.wohnort = wohnort;
    }

    @Column(name = "telefon", length = 20)
    public String getTelefon() {
        return telefon;
    }

    public void setTelefon(String telefon) {
        this.telefon = telefon;
    }

    @Column(name = "telefax", length = 20)
    public String getTelefax() {
        return telefax;
    }

    public void setTelefax(String telefax) {
        this.telefax = telefax;
    }

    @Column(name = "mobiltelefon", length = 20)
    public String getMobiltelefon() {
        return mobiltelefon;
    }

    public void setMobiltelefon(String mobiltelefon) {
        this.mobiltelefon = mobiltelefon;
    }

    @Column(name = "email", length = 255)
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Temporal(TemporalType.DATE)
    @Column(name = "geburtsdatum")
    public Date getGeburtsdatum() {
        return geburtsdatum;
    }

    public void setGeburtsdatum(Date geburtsdatum) {
        this.geburtsdatum = geburtsdatum;
    }
}
