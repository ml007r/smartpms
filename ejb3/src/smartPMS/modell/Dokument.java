package smartPMS.modell;

import javax.persistence.Entity;

/**
 * Created by IntelliJ IDEA.
 * User: Marcel
 * Date: 26.05.2008
 * Time: 12:01:16
 * To change this template use File | Settings | File Templates.
 */
@Entity
public class Dokument {
    //ganz wichtig
    private String Name;
     //ganz wichtig
    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }
}
