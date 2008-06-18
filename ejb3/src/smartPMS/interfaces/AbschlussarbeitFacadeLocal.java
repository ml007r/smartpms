package smartPMS.interfaces;

import smartPMS.session.AbschlussarbeitSessionFacade;

import javax.ejb.Local;

/**
 * Created by IntelliJ IDEA.
 * User: tbs
 * Date: 17.06.2008
 * Time: 13:03:17
 * To change this template use File | Settings | File Templates.
 */
@Local(AbschlussarbeitFacadeLocal.class)
public interface AbschlussarbeitFacadeLocal extends AbschlussarbeitSessionFacade {
}
