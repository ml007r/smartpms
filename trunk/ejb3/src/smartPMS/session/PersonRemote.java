package smartPMS.session;

import smartPMS.transfer.SessionUser;

import javax.ejb.Remote;

/**
 * Created by IntelliJ IDEA.
 * User: tbs
 * Date: 16.06.2008
 * Time: 11:12:09
 * To change this template use File | Settings | File Templates.
 */
@Remote
public interface PersonRemote {

    /**
     * @param name
     * @return
     */
    public SessionUser authProfessor(String name);
}
