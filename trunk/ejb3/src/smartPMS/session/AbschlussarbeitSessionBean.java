/**
 * Created by IntelliJ IDEA.
 * User: tbs
 * Date: 26.05.2008
 * Time: 13:59:55
 * To change this template use File | Settings | File Templates.
 */
package smartPMS.session;

//import smartPMS.modell.Abschlussarbeit;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import smartPMS.interfaces.AbschlussarbeitFacade;
import smartPMS.interfaces.AbschlussarbeitFacadeHome;
import smartPMS.interfaces.AbschlussarbeitFacadeLocal;
import smartPMS.interfaces.AbschlussarbeitFacadeLocalHome;
import smartPMS.modell.Abschlussarbeit;
import smartPMS.transfer.AbschlussarbeitVO;

import javax.ejb.*;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.Collection;
import java.util.Date;

@Stateless(name = "AbschlussarbeitFacade")
@LocalHome(AbschlussarbeitFacadeLocalHome.class)
@RemoteHome(AbschlussarbeitFacadeHome.class)
public class AbschlussarbeitSessionBean implements AbschlussarbeitFacadeLocal, AbschlussarbeitFacade {

    public void ejbCreate() throws CreateException {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    private static final Log logger = LogFactory.getLog(AbschlussarbeitSessionBean.class);

    @PersistenceContext(unitName = "smartPMS")
    private EntityManager manager;

    /**
     *
     */
    public AbschlussarbeitSessionBean() {
        logger.trace(this);
    }

    public long createAbschlussarbeit(AbschlussarbeitVO abschlussarbeit) {
        return 0;  //To change body of implemented methods use File | Settings | File Templates.
    }

    public void updateAbschlussarbeit(AbschlussarbeitVO abschlussarbeit) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    public void deleteAbschlussarbeit(long id) {
        try {
            manager.remove(manager.find(Abschlussarbeit.class, id));
        } catch (EJBException e) {
            logger.error("Konnte Abschlussarbeit nicht entfernen!", e);
        }
    }

    public Abschlussarbeit getAbschlussarbeit(long id) {
        return manager.find(Abschlussarbeit.class, id);
    }

    public Collection<Abschlussarbeit> getAbschlussarbeiten() {
        return (Collection<Abschlussarbeit>) manager.createQuery("SELECT a FROM Abschlussarbeit a WHERE a.abgabetermin >= :datum").setParameter("datum", new Date()).getResultList();
    }


}
