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
import smartPMS.modell.*;
import smartPMS.transfer.SessionUser;

import javax.ejb.*;
import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;
import java.util.Collection;

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

    public SessionUser authProfessor(String name, String passwort) {
        logger.info("Suche Benutzerkennung: " + name);

        SessionUser sessionUser = null;

        try {
            String query = "SELECT NEW smartPMS.transfer.SessionUser(p.id, CONCAT(p.vorname,CONCAT(' ', p.nachname)) ) FROM Professor p WHERE p.nachname = :name AND p.passwort = :passwort";
            sessionUser = (SessionUser) entityManager.createQuery(query).setParameter("name", name)
                    .setParameter("passwort", passwort).getSingleResult();
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

    public Collection<Student> getStundenten() {
        return entityManager.createQuery("SELECT s FROM Student s").getResultList();
    }

    public Collection<Hilfskraft> getHilfskraefte() {
        return entityManager.createQuery("SELECT h FROM Hilfskraft h").getResultList();
    }

    public Collection<Dozent> getDozenten() {
        return entityManager.createQuery("SELECT d FROM Dozent d").getResultList();
    }

    public Collection<Professor> getProfessoren() {
        return entityManager.createQuery("SELECT p FROM Professor p").getResultList();
    }
}
