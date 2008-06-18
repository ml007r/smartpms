package smartPMS.interfaces;

import smartPMS.session.AbschlussarbeitSessionFacade;

import javax.ejb.Remote;

/**
 * Created by IntelliJ IDEA.
 * User: tbs
 * Date: 17.06.2008
 * Time: 13:03:00
 * To change this template use File | Settings | File Templates.
 */
@Remote(AbschlussarbeitFacade.class)
public interface AbschlussarbeitFacade extends AbschlussarbeitSessionFacade {
}
