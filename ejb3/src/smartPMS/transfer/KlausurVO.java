package smartPMS.transfer;

import java.util.Date;

/**
 * Created by IntelliJ IDEA.
 * User: tbs
 * Date: 31.05.2008
 * Time: 09:55:18
 * To change this template use File | Settings | File Templates.
 */
public class KlausurVO {

    private long id;

    private Date datum;

    private Date beginn;

    private Date ende;

    private double ects = 5.0;

    // Assoziationen

    private long lehrangebotId;

    public KlausurVO() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Date getDatum() {
        return datum;
    }

    public void setDatum(Date datum) {
        this.datum = datum;
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

    public double getEcts() {
        return ects;
    }

    public void setEcts(double ects) {
        this.ects = ects;
    }

    public long getLehrangebotId() {
        return lehrangebotId;
    }

    public void setLehrangebotId(long lehrangebotId) {
        this.lehrangebotId = lehrangebotId;
    }
}
