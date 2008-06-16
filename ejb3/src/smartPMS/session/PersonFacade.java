package smartPMS.session;

import smartPMS.transfer.SessionUser;

import javax.ejb.Local;
import javax.ejb.Remote;

/**
 * Created by IntelliJ IDEA.
 * User: tbs
 * Date: 14.06.2008
 * Time: 21:33:45
 * To change this template use File | Settings | File Templates.
 */
@Local
@Remote
public interface PersonFacade {

    /**
     * @param name
     * @return
     */
    public SessionUser authProfessor(String name);

}
