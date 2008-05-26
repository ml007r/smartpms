package smartPMS.modell;

import javax.persistence.Entity;

/**
 * Created by IntelliJ IDEA.
 * User: tbs
 * Date: 26.05.2008
 * Time: 11:54:07
 * To change this template use File | Settings | File Templates.
 */
@Entity
public class Hilfskraft extends Student {

    private double wochenstunden;

    private double stundensatz;


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
}
