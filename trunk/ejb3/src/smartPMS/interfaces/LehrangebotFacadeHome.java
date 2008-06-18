package smartPMS.interfaces;

import javax.ejb.CreateException;
import javax.ejb.EJBHome;
import java.rmi.RemoteException;

/**
 * Created by IntelliJ IDEA.
 * User: tbs
 * Date: 17.06.2008
 * Time: 12:44:34
 * To change this template use File | Settings | File Templates.
 */
public interface LehrangebotFacadeHome extends EJBHome {

    public static final String JNDI_NAME = "LehrangebotFacade/home";

    public LehrangebotFacade create()
            throws CreateException, RemoteException;
}
