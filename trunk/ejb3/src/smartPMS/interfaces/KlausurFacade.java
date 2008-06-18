package smartPMS.interfaces;

import smartPMS.session.KlausurSessionFacade;

import javax.ejb.Remote;

/**
 * Created by IntelliJ IDEA.
 * User: tbs
 * Date: 17.06.2008
 * Time: 12:50:40
 * To change this template use File | Settings | File Templates.
 */
@Remote(KlausurFacade.class)
public interface KlausurFacade extends KlausurSessionFacade {
}
