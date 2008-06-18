package smartPMS.interfaces;

import javax.ejb.CreateException;
import javax.ejb.EJBLocalHome;

/**
 * Created by IntelliJ IDEA.
 * User: tbs
 * Date: 17.06.2008
 * Time: 12:14:14
 * To change this template use File | Settings | File Templates.
 */
public interface PersonFacadeLocalHome extends EJBLocalHome {

    public static final String JNDI_NAME = "PersonFacade/localHome";

    public PersonFacadeLocal create()
            throws CreateException;
}
