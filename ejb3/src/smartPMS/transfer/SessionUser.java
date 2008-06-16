package smartPMS.transfer;

import java.io.Serializable;

/**
 * Created by IntelliJ IDEA.
 * User: tbs
 * Date: 14.06.2008
 * Time: 21:39:49
 * To change this template use File | Settings | File Templates.
 */
public class SessionUser implements Serializable {

    private long id;

    private String name;

    public SessionUser(long id, String name) {
        this.id = id;
        this.name = name;
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
}
