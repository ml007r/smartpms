package smartPMS.interfaces;

import smartPMS.session.PersonSessionFacade;

import javax.ejb.Local;


/**
 * Created by IntelliJ IDEA.
 * User: tbs
 * Date: 17.06.2008
 * Time: 12:07:57
 * To change this template use File | Settings | File Templates.
 */
@Local(PersonFacadeLocal.class)
public interface PersonFacadeLocal extends PersonSessionFacade {
}
