package smartPMS.transfer;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by IntelliJ IDEA.
 * User: tbs
 * Date: 09.06.2008
 * Time: 10:21:42
 * To change this template use File | Settings | File Templates.
 */
public class TerminVO implements Serializable {

    private long id;

    private Date beginn;

    private Date ende;

    private String raum;

    private int typ;

    private int wochentag;

    private long lehrangebotId;


    public TerminVO() {
    }

    public TerminVO(long id, Date beginn, Date ende, String raum, int typ, int wochentag, long lehrangebotId) {
        this.id = id;
        this.beginn = beginn;
        this.ende = ende;
        this.raum = raum;
        this.typ = typ;
        this.wochentag = wochentag;
        this.lehrangebotId = lehrangebotId;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
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

    public String getRaum() {
        return raum;
    }

    public void setRaum(String raum) {
        this.raum = raum;
    }

    public int getTyp() {
        return typ;
    }

    public void setTyp(int typ) {
        this.typ = typ;
    }

    public int getWochentag() {
        return wochentag;
    }

    public void setWochentag(int wochentag) {
        this.wochentag = wochentag;
    }

    public long getLehrangebotId() {
        return lehrangebotId;
    }

    public void setLehrangebotId(long lehrangebotId) {
        this.lehrangebotId = lehrangebotId;
    }
}
