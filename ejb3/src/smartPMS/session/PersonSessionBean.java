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
import smartPMS.transfer.SessionUser;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Stateless(name = "PersonSessionEJB")
public class PersonSessionBean implements PersonFacade {

    private static Log logger = LogFactory.getLog(PersonSessionBean.class);

    @PersistenceContext(unitName = "smartPMS")
    private EntityManager entityManager;


    public PersonSessionBean() {
        logger.trace(this);
    }

    public SessionUser authProfessor(String name) {
        logger.info("Suche Benutzerkennung: " + name);
        return (SessionUser) entityManager.createQuery("SELECT new smartPMS.transfer.SessionUser(p.id, CONCAT(p.vorname,CONCAT(' ', p.nachname)) ) FROM Person p").getSingleResult();
    }


}
