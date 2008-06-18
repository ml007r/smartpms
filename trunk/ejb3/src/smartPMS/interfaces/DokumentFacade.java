package smartPMS.interfaces;

import smartPMS.session.DokumentSessionFacade;

import javax.ejb.Remote;

/**
 * Created by IntelliJ IDEA.
 * User: tbs
 * Date: 17.06.2008
 * Time: 12:55:56
 * To change this template use File | Settings | File Templates.
 */
@Remote(DokumentFacade.class)
public interface DokumentFacade extends DokumentSessionFacade {
}
