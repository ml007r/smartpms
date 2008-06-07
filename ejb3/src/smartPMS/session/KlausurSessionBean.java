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

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Stateless(name = "KlausurSessionEJB")
public class KlausurSessionBean {

    @PersistenceContext(unitName = "smartPMS")
    private EntityManager entityManager;

    // @EJB(beanName = "DokumentSessionEJB", beanInterface = Object.class)
    // private Object dokumentSessionEJBRef;

    public KlausurSessionBean() {
    }

//    public long klausurAnlegen(KlausurVO klausur) {
////        if (klausur == null) {
////            throw new IllegalArgumentException();
////        }
////
////        Klausur k = new Klausur(klausur.getBeginn(), klausur.getEnde(), entityManager.find(Lehrangebot.class, klausur.getLehrangebotId()));
////        k.setLehrangebot(entityManager.find(Lehrangebot.class, klausur.getLehrangebotId()));
////        entityManager.persist(k);
////
////        return k.getId();
//    }
//
//    public void klausurSpeichern(KlausurVO klausur) throws IllegalAccessException {
//
////        if (klausur == null) {
////            throw new IllegalArgumentException();
////        }
////
////        if (klausur.getId() == 0) {
////            throw new IllegalAccessException();
////        }
////
////        Klausur k = entityManager.find(Klausur.class, klausur.getId());
////        k.setBeginn(klausur.getBeginn());
////        k.setEnde(klausur.getEnde());
////        k.setEcts(klausur.getEcts());
////        k.setLehrangebot(entityManager.find(Lehrangebot.class, klausur.getLehrangebotId()));
////        entityManager.merge(k);
//    }
//
//    public void klausurEntfernen(long klausurId) {
//       // entityManager.remove(entityManager.find(Klausur.class, klausurId));
//    }
//
//    public Klausur getKlausur(long klausurId) {
//      //  return entityManager.find(Klausur.class, klausurId);
//    }
//
//    public Collection<Teilnahme> getKlausurTeilnahmen(long klausurId) {
//     //   Collection<Teilnahme> teilnahmen = new ArrayList<Teilnahme>();
//      //  return teilnahmen;
//    }
//
//    public void klausurBenoten(Collection<Teilnahme> teilnahmen) {
////        for (Teilnahme t : teilnahmen) {
////            try {
////                entityManager.persist(t);
////            } catch (EJBException e) {
////
////            }
////        }
//    }
}
