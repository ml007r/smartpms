package smartPMS.modell;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Created by IntelliJ IDEA.
 * User: tbs
 * Date: 18.06.2008
 * Time: 18:47:04
 * To change this template use File | Settings | File Templates.
 */
@Entity
@Table(name = "HILFSKRAFT")
@DiscriminatorValue("H")
public class Hilfskraft extends Student {

    private double stundenanzahl;

    private double stundensatz;

    @Column(name = "STUNDENANZAHL", precision = 2, scale = 1)
    public double getStundenanzahl() {
        return stundenanzahl;
    }

    public void setStundenanzahl(double stundenanzahl) {
        this.stundenanzahl = stundenanzahl;
    }

    @Column(name = "STUNDENSATZ", precision = 2, scale = 1)
    public double getStundensatz() {
        return stundensatz;
    }

    public void setStundensatz(double stundensatz) {
        this.stundensatz = stundensatz;
    }

    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Hilfskraft)) return false;
        if (!super.equals(o)) return false;

        Hilfskraft that = (Hilfskraft) o;

        if (Double.compare(that.stundenanzahl, stundenanzahl) != 0) return false;
        if (Double.compare(that.stundensatz, stundensatz) != 0) return false;

        return true;
    }

    public int hashCode() {
        int result = super.hashCode();
        long temp;
        temp = stundenanzahl != +0.0d ? Double.doubleToLongBits(stundenanzahl) : 0L;
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = stundensatz != +0.0d ? Double.doubleToLongBits(stundensatz) : 0L;
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }
}
