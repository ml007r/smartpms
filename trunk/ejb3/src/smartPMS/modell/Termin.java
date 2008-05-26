package smartPMS.modell;

import javax.persistence.Entity;
import java.util.Date;

/**
 * Created by IntelliJ IDEA.
 * User: MG
 * Date: 26.05.2008
 * Time: 13:47:33
 * To change this template use File | Settings | File Templates.
 */

@Entity
public class Termin {

    public enum TYP{
        VORLESUNG, UEBUNG, PRAKTIKUM, TUTORIUM
    };

    private long id;

    private TYP typ;
    private String raum;
    private int wochentag;
    private Date beginn;
    private Date ende;


    //Constructors
    protected Termin() {

    }


    /**
     *
     * @param typ
     * @param raum
     * @param wochentag
     * @param beginn
     * @param ende
     */
    public Termin(TYP typ, String raum, int wochentag, Date beginn, Date ende) {
        this.typ = typ;
        this.raum = raum;
        this.wochentag = wochentag;
        this.beginn = beginn;
        this.ende = ende;
    }


    //Getter & Setter
    public TYP getTyp() {
        return typ;
    }

    public void setTyp(TYP typ) {
        this.typ = typ;
    }

    public String getRaum() {
        return raum;
    }

    public void setRaum(String raum) {
        this.raum = raum;
    }

    public int getWochentag() {
        return wochentag;
    }

    public void setWochentag(int wochentag) {
        this.wochentag = wochentag;
    }

    public Date getBeginn() {
        return beginn;
    }

    public void setBeginn(Date beginn) {
        this.beginn = beginn;
    }

    public Date getEnde() {
        return ende;
    }

    public void setEnde(Date ende) {
        this.ende = ende;
    }
}
