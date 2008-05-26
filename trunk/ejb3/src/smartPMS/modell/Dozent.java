package smartPMS.modell;

import javax.persistence.Entity;
import java.util.Collection;

/**
 * Created by IntelliJ IDEA.
 * User: tbs
 * Date: 26.05.2008
 * Time: 11:58:49
 * To change this template use File | Settings | File Templates.
 */
@Entity
public class Dozent extends Person {

    private long id;

    private String buero;

    private Collection<Lehrangebot> lehrangebot;


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getBuero() {
        return buero;
    }

    public void setBuero(String buero) {
        this.buero = buero;
    }

    public Collection<Lehrangebot> getLehrangebot() {
        return lehrangebot;
    }

    public void setLehrangebot(Collection<Lehrangebot> lehrangebot) {
        this.lehrangebot = lehrangebot;
    }
}
