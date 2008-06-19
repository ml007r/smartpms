/**
 * Created by IntelliJ IDEA.
 * User: tbs
 * Date: 26.05.2008
 * Time: 13:56:19
 * To change this template use File | Settings | File Templates.
 */
package smartPMS.session;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import smartPMS.interfaces.PersonFacade;
import smartPMS.interfaces.PersonFacadeHome;
import smartPMS.interfaces.PersonFacadeLocal;
import smartPMS.interfaces.PersonFacadeLocalHome;
import smartPMS.modell.Person;
import smartPMS.transfer.SessionUser;

import javax.ejb.*;
import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;

@Stateless(name = "PersonFacade")
@LocalHome(PersonFacadeLocalHome.class)
@RemoteHome(PersonFacadeHome.class)
public class PersonSessionBean implements PersonFacadeLocal, PersonFacade {

    public void ejbCreate() throws CreateException {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    private static Log logger = LogFactory.getLog(PersonSessionBean.class);

    @PersistenceContext(unitName = "smartPMS")
    private EntityManager entityManager;

    public PersonSessionBean() {
        logger.trace(this);
    }

    public SessionUser authProfessor(String name) {
        logger.info("Suche Benutzerkennung: " + name);

        SessionUser sessionUser = null;

        try {
            sessionUser = (SessionUser) entityManager.createQuery("SELECT new smartPMS.transfer.SessionUser(p.id, CONCAT(p.vorname,CONCAT(' ', p.nachname)) ) FROM Person p").getSingleResult();
        } catch (NoResultException e) {
            logger.error("Professor mit der Benutzerkennung '" + name + "' nicht gefunden!");
        }

        return sessionUser;
    }


    public long createPerson(Person person) {
        try {
            entityManager.persist(person);
        } catch (EJBException e) {
            return 0;
        }
        return person.getId();
    }
}
