package smartPMS.modell;

import javax.persistence.Entity;

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



    public String getBuero() {
        return buero;
    }

    public void setBuero(String buero) {
        this.buero = buero;
    }
}
