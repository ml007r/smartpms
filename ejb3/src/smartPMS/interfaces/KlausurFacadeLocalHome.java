package smartPMS.interfaces;

import javax.ejb.CreateException;
import javax.ejb.EJBLocalHome;

/**
 * Created by IntelliJ IDEA.
 * User: tbs
 * Date: 17.06.2008
 * Time: 12:49:43
 * To change this template use File | Settings | File Templates.
 */
public interface KlausurFacadeLocalHome extends EJBLocalHome {

    public static final String JNDI_NAME = "KlausurFacade/localHome";

    public KlausurFacadeLocal create()
            throws CreateException;
}
