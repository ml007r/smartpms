package smartPMS.interfaces;

import smartPMS.session.DokumentSessionFacade;

import javax.ejb.Local;

/**
 * Created by IntelliJ IDEA.
 * User: tbs
 * Date: 17.06.2008
 * Time: 12:56:13
 * To change this template use File | Settings | File Templates.
 */
@Local(DokumentFacadeLocal.class)
public interface DokumentFacadeLocal extends DokumentSessionFacade {
}
