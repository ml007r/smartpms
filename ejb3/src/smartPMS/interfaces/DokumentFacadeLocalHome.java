package smartPMS.interfaces;

import javax.ejb.CreateException;
import javax.ejb.EJBLocalHome;

/**
 * Created by IntelliJ IDEA.
 * User: tbs
 * Date: 17.06.2008
 * Time: 12:56:20
 * To change this template use File | Settings | File Templates.
 */
public interface DokumentFacadeLocalHome extends EJBLocalHome {

    public static final String JNDI_NAME = "DokumentFacade/localHome";

    public DokumentFacadeLocal create()
            throws CreateException;
}
