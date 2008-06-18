package smartPMS.interfaces;

import smartPMS.session.KlausurSessionFacade;

import javax.ejb.Local;

/**
 * Created by IntelliJ IDEA.
 * User: tbs
 * Date: 17.06.2008
 * Time: 12:50:52
 * To change this template use File | Settings | File Templates.
 */
@Local(KlausurFacadeLocal.class)
public interface KlausurFacadeLocal extends KlausurSessionFacade {
}
