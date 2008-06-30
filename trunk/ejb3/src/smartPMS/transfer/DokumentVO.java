package smartPMS.transfer;

import smartPMS.modell.Dokument;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by IntelliJ IDEA.
 * User: tbs
 * Date: 14.06.2008
 * Time: 21:48:26
 * To change this template use File | Settings | File Templates.
 */
public class DokumentVO implements Serializable {

    private long id;

    private String name;

    private String typ;

    private Date datum;

    private int version;

    private byte[] daten;

    private long lehrangebotId;

    public DokumentVO() {
    }

    public DokumentVO(long id, String name, String typ, Date datum, int version, byte[] daten, long lehrangebotId) {
        this.id = id;
        this.name = name;
        this.typ = typ;
        this.datum = datum;
        this.version = version;
        this.daten = daten;
        this.lehrangebotId = lehrangebotId;
    }

    public DokumentVO(Dokument d) {
        this.id = d.getId();
        this.name = d.getName();
        this.typ = d.getTyp();
        this.datum = d.getDatum();
        this.version = d.getVersion();
        this.daten = d.getDaten();
        this.lehrangebotId = d.getLehrangebot().getId();
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTyp() {
        return typ;
    }

    public void setTyp(String typ) {
        this.typ = typ;
    }

    public Date getDatum() {
        return datum;
    }

    public void setDatum(Date datum) {
        this.datum = datum;
    }

    public int getVersion() {
        return version;
    }

    public void setVersion(int version) {
        this.version = version;
    }

    public byte[] getDaten() {
        return daten;
    }

    public void setDaten(byte[] daten) {
        this.daten = daten;
    }

    public long getLehrangebotId() {
        return lehrangebotId;
    }

    public void setLehrangebotId(long lehrangebotId) {
        this.lehrangebotId = lehrangebotId;
    }
}
