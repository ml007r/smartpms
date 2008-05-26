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

    private String name;

    public Dokument(String name){
        this.name = name;
    }

    protected Dokument() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        name = name;
    }
}
