package smartPMS.interfaces;

import javax.ejb.CreateException;
import javax.ejb.EJBLocalHome;

/**
 * Created by IntelliJ IDEA.
 * User: tbs
 * Date: 17.06.2008
 * Time: 13:03:24
 * To change this template use File | Settings | File Templates.
 */
public interface AbschlussarbeitFacadeLocalHome extends EJBLocalHome {

    public static final String JNDI_NAME = "AbschlussarbeitFacade/localHome";

    public AbschlussarbeitFacadeLocal create()
            throws CreateException;
}
