/**
 * Created by IntelliJ IDEA.
 * User: tbs
 * Date: 26.05.2008
 * Time: 13:59:55
 * To change this template use File | Settings | File Templates.
 */
package smartPMS.session;

//import smartPMS.modell.Abschlussarbeit;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Stateless(name = "AbschlussarbeitSessionEJB")
public class AbschlussarbeitSessionBean {

    @PersistenceContext(unitName = "smartPMS")
    private EntityManager manager;

    public AbschlussarbeitSessionBean() {
    }

//    /**
//     * @return
//     */
//    public Collection<Abschlussarbeit> getAbschlussarbeiten() {
//        return (Collection<Abschlussarbeit>) manager.createQuery("SELECT a FROM Abschlussarbeit a WHERE a.abgabetermin >= :datum").setParameter("datum", new Date()).getResultList();
//    }
//
//    public Abschlussarbeit getAbschlussarbeit(long id) {
//        return manager.find(Abschlussarbeit.class, id);
//    }

}
