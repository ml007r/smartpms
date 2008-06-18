package smartPMS.interfaces;

import javax.ejb.CreateException;
import javax.ejb.EJBHome;
import java.rmi.RemoteException;

/**
 * Created by IntelliJ IDEA.
 * User: tbs
 * Date: 17.06.2008
 * Time: 12:10:47
 * To change this template use File | Settings | File Templates.
 */
public interface PersonFacadeHome extends EJBHome {

    public static final String JNDI_NAME = "PersonFacade/home";

    public PersonFacade create()
            throws CreateException, RemoteException;
}
