package smartPMS.modell;

import javax.persistence.Entity;

/**
 * Created by IntelliJ IDEA.
 * User: Marcel
 * Date: 26.05.2008
 * Time: 11:54:15
 * To change this template use File | Settings | File Templates.
 */
@Entity
public class Lehrangebot {

    private int nummer;
    //ganz wichtig
    private String bezeichnung;

    public boolean speichern(){
          return true;
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
