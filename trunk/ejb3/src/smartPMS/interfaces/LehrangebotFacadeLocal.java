package smartPMS.interfaces;

import smartPMS.session.LehrangebotSessionFacade;

import javax.ejb.Local;

/**
 * Created by IntelliJ IDEA.
 * User: tbs
 * Date: 17.06.2008
 * Time: 12:45:23
 * To change this template use File | Settings | File Templates.
 */
@Local(LehrangebotFacadeLocal.class)
public interface LehrangebotFacadeLocal extends LehrangebotSessionFacade {
}
