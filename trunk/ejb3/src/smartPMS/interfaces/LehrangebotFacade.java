package smartPMS.interfaces;

import smartPMS.session.LehrangebotSessionFacade;

import javax.ejb.Remote;


/**
 * Created by IntelliJ IDEA.
 * User: tbs
 * Date: 17.06.2008
 * Time: 12:07:35
 * To change this template use File | Settings | File Templates.
 */
@Remote(LehrangebotFacade.class)
public interface LehrangebotFacade extends LehrangebotSessionFacade {
}