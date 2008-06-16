package smartPMS.transfer;

import java.io.Serializable;

/**
 * Created by IntelliJ IDEA.
 * User: tbs
 * Date: 09.06.2008
 * Time: 10:11:42
 * To change this template use File | Settings | File Templates.
 */
public class LehrangebotVO implements Serializable {

    private long id;

    private String bezeichnung;

    private String nummer;

    private long dozentId;

    //

    public LehrangebotVO() {
    }

    public LehrangebotVO(long id, String bezeichnung, String nummer, long dozentId) {
        this.id = id;
        this.bezeichnung = bezeichnung;
        this.nummer = nummer;
        this.dozentId = dozentId;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getBezeichnung() {
        return bezeichnung;
    }

    public void setBezeichnung(String bezeichnung) {
        this.bezeichnung = bezeichnung;
    }

    public String getNummer() {
        return nummer;
    }

    public void setNummer(String nummer) {
        this.nummer = nummer;
    }

    public long getDozentId() {
        return dozentId;
    }

    public void setDozentId(long dozentId) {
        this.dozentId = dozentId;
    }
}
