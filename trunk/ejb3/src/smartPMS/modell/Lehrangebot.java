package smartPMS.modell;

import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Created by IntelliJ IDEA.
 * User: Marcel
 * Date: 26.05.2008
 * Time: 11:54:15
 * To change this template use File | Settings | File Templates.
 */
@Entity
@Table(name = "Lehrangebot")
public class Lehrangebot {

    private long id;

    private int nummer;

    private String bezeichnung;

    protected Lehrangebot() {
    }

    public Lehrangebot(int nr, String bez) {
        this.nummer = nr;
        this.bezeichnung = bez;
    }

    public String getBezeichnung() {
        return bezeichnung;
    }

    public void setBezeichnung(String bezeichnung) {
        this.bezeichnung = bezeichnung;
    }

    public int getNummer() {
        return nummer;
    }

    public void setNummer(int nummer) {
        this.nummer = nummer;
    }
}
