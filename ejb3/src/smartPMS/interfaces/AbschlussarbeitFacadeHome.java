package smartPMS.interfaces;

import javax.ejb.CreateException;
import javax.ejb.EJBHome;
import java.rmi.RemoteException;

/**
 * Created by IntelliJ IDEA.
 * User: tbs
 * Date: 17.06.2008
 * Time: 13:03:13
 * To change this template use File | Settings | File Templates.
 */
public interface AbschlussarbeitFacadeHome extends EJBHome {

    public static final String JNDI_NAME = "AbschlussarbeitFacade/home";

    public AbschlussarbeitFacade create()
            throws CreateException, RemoteException;
}
