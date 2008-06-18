/**
 * Created by IntelliJ IDEA.
 * User: tbs
 * Date: 26.05.2008
 * Time: 13:57:12
 * To change this template use File | Settings | File Templates.
 */
package smartPMS.session;

//import smartPMS.modell.Klausur;
//import smartPMS.modell.Lehrangebot;
//import smartPMS.modell.Teilnahme;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import smartPMS.interfaces.KlausurFacade;
import smartPMS.interfaces.KlausurFacadeHome;
import smartPMS.interfaces.KlausurFacadeLocal;
import smartPMS.interfaces.KlausurFacadeLocalHome;
import smartPMS.modell.Klausur;
import smartPMS.modell.Lehrangebot;
import smartPMS.modell.Teilnahme;
import smartPMS.transfer.KlausurVO;

import javax.ejb.*;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.Collection;

@Stateless(name = "KlausurFacade")
@LocalHome(KlausurFacadeLocalHome.class)
@RemoteHome(KlausurFacadeHome.class)
public class KlausurSessionBean implements KlausurFacadeLocal, KlausurFacade {

    public void ejbCreate() throws CreateException {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    private static final Log logger = LogFactory.getLog(KlausurSessionBean.class);

    @PersistenceContext(unitName = "smartPMS")
    private EntityManager entityManager;

    public KlausurSessionBean() {
        logger.trace(this);
    }

    public long createKlausur(KlausurVO klausur) {
        if (klausur == null) {
            throw new IllegalArgumentException();
        }

        Klausur k = new Klausur(klausur.getBeginn(), klausur.getEnde(), entityManager.find(Lehrangebot.class, klausur.getLehrangebotId()));
        k.setLehrangebot(entityManager.find(Lehrangebot.class, klausur.getLehrangebotId()));

        try {
            entityManager.persist(k);
        } catch (EJBException e) {

        }


        return k.getId();
    }

    public void updateKlausur(KlausurVO klausur) throws IllegalAccessException {
        if (klausur == null) {
            throw new IllegalArgumentException();
        }

        if (klausur.getId() == 0) {
            throw new IllegalAccessException();
        }

        Klausur k = entityManager.find(Klausur.class, klausur.getId());
        k.setBeginn(klausur.getBeginn());
        k.setEnde(klausur.getEnde());
        k.setEcts(klausur.getEcts());
        k.setLehrangebot(entityManager.find(Lehrangebot.class, klausur.getLehrangebotId()));

        try {
            entityManager.merge(k);
        } catch (EJBException e) {

        }
    }

    public void deleteKlausur(long id) {
        entityManager.remove(entityManager.find(Klausur.class, id));
    }

    public Klausur getKlausur(long klausurId) {
        return entityManager.find(Klausur.class, klausurId);
    }

    public Collection<Klausur> getKlausuren() {
        return entityManager.createQuery("SELECT k FROM Klausur k").getResultList();
    }


    public Collection<Teilnahme> getKlausurTeilnahmen(long klausurId) {
        return entityManager.createQuery("SELECT t FROM Teilnahme t").getResultList();
    }

    public void klausurBenoten(Collection<Teilnahme> teilnahmen) {
        for (Teilnahme t : teilnahmen) {
            try {
                entityManager.persist(t);
            } catch (EJBException e) {

            }
        }
    }


}
