package smartPMS.form;

import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;

import javax.servlet.http.HttpServletRequest;
import java.text.DateFormat;
import java.util.Date;

/**
 * Created by IntelliJ IDEA.
 * User: tbs
 * Date: 17.06.2008
 * Time: 13:21:45
 * To change this template use File | Settings | File Templates.
 */
public class PersonForm extends ActionForm {

    private long id;

    /*
    0 - Bitte auswählen
    1 - Student
    2 - Hilfskraft
    3 - Dozent
    4 - Professor
     */

    private int typ;

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

    //

    private long matrikel;

    private String studiengang;

    //

    private double wochenstunden;

    private double stundensatz;

    //

    private String titel;

    private String buero;

    //

    private String fachgebiet;

    private String passwort;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getTyp() {
        return typ;
    }

    public void setTyp(int typ) {
        this.typ = typ;
    }

    public String getAnrede() {
        return anrede;
    }

    public void setAnrede(String anrede) {
        this.anrede = anrede;
    }

    public String getVorname() {
        return vorname;
    }

    public void setVorname(String vorname) {
        this.vorname = vorname;
    }

    public String getNachname() {
        return nachname;
    }

    public void setNachname(String nachname) {
        this.nachname = nachname;
    }

    public String getAnschrift1() {
        return anschrift1;
    }

    public void setAnschrift1(String anschrift1) {
        this.anschrift1 = anschrift1;
    }

    public String getAnschrift2() {
        return anschrift2;
    }

    public void setAnschrift2(String anschrift2) {
        this.anschrift2 = anschrift2;
    }

    public String getPostleitzahl() {
        return postleitzahl;
    }

    public void setPostleitzahl(String postleitzahl) {
        this.postleitzahl = postleitzahl;
    }

    public String getWohnort() {
        return wohnort;
    }

    public void setWohnort(String wohnort) {
        this.wohnort = wohnort;
    }

    public String getTelefon() {
        return telefon;
    }

    public void setTelefon(String telefon) {
        this.telefon = telefon;
    }

    public String getTelefax() {
        return telefax;
    }

    public void setTelefax(String telefax) {
        this.telefax = telefax;
    }

    public String getMobiltelefon() {
        return mobiltelefon;
    }

    public void setMobiltelefon(String mobiltelefon) {
        this.mobiltelefon = mobiltelefon;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getGeburtsdatum() {
        return geburtsdatum;
    }

    public void setGeburtsdatum(Date geburtsdatum) {
        this.geburtsdatum = geburtsdatum;
    }

    public String getGeburtsdatumString() {
        DateFormat df = DateFormat.getDateInstance(DateFormat.MEDIUM);
        try {
            return df.format(geburtsdatum);
        } catch (Exception e) {
            return null;
        }
    }

    public void setGeburtsdatumString(String geburtsdatum) {
        DateFormat df = DateFormat.getDateInstance(DateFormat.MEDIUM);
        try {
            this.geburtsdatum = df.parse(geburtsdatum);
        } catch (Exception e) {
            this.geburtsdatum = null;
        }
    }

    public long getMatrikel() {
        return matrikel;
    }

    public void setMatrikel(long matrikel) {
        this.matrikel = matrikel;
    }

    public String getStudiengang() {
        return studiengang;
    }

    public void setStudiengang(String studiengang) {
        this.studiengang = studiengang;
    }

    public String getTitel() {
        return titel;
    }

    public void setTitel(String titel) {
        this.titel = titel;
    }

    public String getBuero() {
        return buero;
    }

    public void setBuero(String buero) {
        this.buero = buero;
    }

    public double getWochenstunden() {
        return wochenstunden;
    }

    public void setWochenstunden(double wochenstunden) {
        this.wochenstunden = wochenstunden;
    }

    public double getStundensatz() {
        return stundensatz;
    }

    public void setStundensatz(double stundensatz) {
        this.stundensatz = stundensatz;
    }

    public String getFachgebiet() {
        return fachgebiet;
    }

    public void setFachgebiet(String fachgebiet) {
        this.fachgebiet = fachgebiet;
    }

    public String getPasswort() {
        return passwort;
    }

    public void setPasswort(String passwort) {
        this.passwort = passwort;
    }

    //

    public void reset(ActionMapping actionMapping, HttpServletRequest httpServletRequest) {
        super.reset(actionMapping, httpServletRequest);
        this.id = 0;
        this.typ = 0;
        this.anrede = "";
        this.vorname = "";
        this.nachname = "";
        this.anschrift1 = "";
        this.anschrift2 = "";
        this.postleitzahl = "";
        this.wohnort = "";
        this.telefon = "";
        this.telefax = "";
        this.mobiltelefon = "";
        this.email = "";
        this.geburtsdatum = null;
        this.matrikel = 0;
        this.studiengang = "";
        this.titel = "";
        this.buero = "";
        this.wochenstunden = 0.0;
        this.stundensatz = 0.0;
        this.fachgebiet = "";
        this.passwort = "";
    }

    public ActionErrors validate(ActionMapping actionMapping, HttpServletRequest httpServletRequest) {
        return super.validate(
                actionMapping, httpServletRequest
        );    //To change body of overridden methods use File | Settings | File Templates.
    }
}
