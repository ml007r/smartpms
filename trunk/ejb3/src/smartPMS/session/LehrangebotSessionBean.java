/**
 * Created by IntelliJ IDEA.
 * User: tbs
 * Date: 26.05.2008
 * Time: 13:58:07
 * To change this template use File | Settings | File Templates.
 */
package smartPMS.session;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import smartPMS.modell.Dozent;
import smartPMS.modell.Lehrangebot;
import smartPMS.modell.Termin;
import smartPMS.transfer.LehrangebotVO;
import smartPMS.transfer.TerminVO;

import javax.ejb.EJBException;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceUnit;
import java.util.Collection;

/**
 *
 */
@Stateless(name = "LehrangebotSessionEJB")
public class LehrangebotSessionBean {

    private static final Log logger = LogFactory.getLog(LehrangebotSessionBean.class);

    @PersistenceUnit(unitName = "smartPMS")
    private EntityManager entityManager;


    /**
     *
     */
    public LehrangebotSessionBean() {
        logger.trace(this);
    }

    /**
     * Liefert eine Collection von Lehrabgebot des Dozenten mit der ID=dozentId.
     *
     * @param dozentId
     * @return
     */
    public Collection<Lehrangebot> getLehrangebotListe(long dozentId) {
        return entityManager.createQuery("SELECT l FROM Lehrangebot l WHERE l.dozent.id = :dozentId").setParameter("dozentId", dozentId).getResultList();
    }

    /**
     * @param lehrangebotId
     * @return
     */
    public Lehrangebot getLehrangebot(long lehrangebotId) throws Exception {
        try {
            return (Lehrangebot) entityManager.createQuery("SELECT l FROM Lehrangebot l LEFT JOIN FETCH l.dozent WHERE l.id = :lehrangebotId").setParameter("lehrangebotId", lehrangebotId).getSingleResult();
        } catch (NoResultException e) {
            logger.error("Konnte Lehrangebot nicht laden!", e);
            throw new Exception("lehrangebot_error_laden");
        }
    }

    /**
     * Ein neues Lehrangebot anlegen
     *
     * @param lehrangebot
     */
    public void neuesLehrangebot(LehrangebotVO lehrangebot) throws Exception {
        if (lehrangebot == null) {
            throw new IllegalArgumentException();
        }

        Lehrangebot l = new Lehrangebot(lehrangebot.getNummer(), lehrangebot.getBezeichnung(), entityManager.find(Dozent.class, lehrangebot.getDozentId()));

        try {
            entityManager.persist(l);
        } catch (EJBException e) {
            logger.error("Konnte Lehrangebot nicht anlegen!", e);
            throw new Exception("lehrangebot_error_anlegen");
        }
    }

    /**
     * Ein bestehendes Lehrangebot speichern
     *
     * @param lehrangebot
     */
    public void speicherLehrangebot(LehrangebotVO lehrangebot) throws Exception {
        if (lehrangebot == null) {
            throw new IllegalArgumentException();
        }

        Lehrangebot l = entityManager.find(Lehrangebot.class, lehrangebot.getId());

        l.setNummer(lehrangebot.getNummer());
        l.setBezeichnung(lehrangebot.getBezeichnung());

        try {
            entityManager.merge(l);
        } catch (EJBException e) {
            logger.error("Konnte Lehrangebot nicht speichern!", e);
            throw new Exception("lehrangebot_error_speichern");
        }
    }

    /**
     * Ein bestehendes Lehrangebot entfernen
     *
     * @param lehrangebotId
     */
    public void entferneLehrangebot(long lehrangebotId) throws Exception {
        try {
            Lehrangebot l = entityManager.find(Lehrangebot.class, lehrangebotId);
            entityManager.remove(l);
        } catch (EJBException e) {
            logger.error("Konnte Lehrangebot nicht entfernen!", e);
            throw new Exception("lehrangebot_error_entfernen");
        }
    }

    /**
     * @param lehrangebotId
     * @return
     */
    public Collection<Termin> getTerminListe(long lehrangebotId) {
        return entityManager.createQuery("SELECT t FROM Termin t WHERE t.lehrangebot.id = :lehrangebotId").setParameter("lehrangebotId", lehrangebotId).getResultList();
    }

    /**
     * @param terminId
     * @return
     */
    public Termin getTermin(long terminId) throws Exception {
        try {
            return (Termin) entityManager.createQuery("SELECT t FROM Termin t WHERE t.id = :terminId").setParameter("terminId", terminId).getSingleResult();
        } catch (NoResultException e) {
            logger.error("Konnte Termin nicht laden!", e);
            throw new Exception("termin_error_laden");
        }
    }

    /**
     * Ein neuer Termin für ein Lehrangebot anlegen
     *
     * @param termin
     */
    public void neuerTermin(TerminVO termin) throws Exception {
        if (termin == null) {
            throw new IllegalArgumentException();
        }

        Termin t = new Termin(Termin.TYP.values()[termin.getTyp()], termin.getWochentag(), termin.getBeginn(), termin.getEnde(), entityManager.find(Lehrangebot.class, termin.getLehrangebotId()));

        try {
            entityManager.persist(t);
        } catch (EJBException e) {
            logger.error("Konnte Termin nicht anlegn!", e);
            throw new Exception("termin_error_anlegen");
        }
    }

    /**
     * @param termin
     */
    public void speicherTermin(TerminVO termin) throws Exception {
        if (termin == null) {
            throw new IllegalArgumentException();
        }

        Termin t = entityManager.find(Termin.class, termin.getId());

        t.setBeginn(termin.getBeginn());
        t.setEnde(termin.getEnde());
        t.setWochentag(termin.getWochentag());
        t.setRaum(termin.getRaum());

        try {
            entityManager.merge(t);
        } catch (EJBException e) {
            logger.error("Konnte Termin nicht speichern!", e);
            throw new Exception("termin_error_speichern");
        }
    }


    /**
     * Ein bestehender Termin entfernen
     *
     * @param terminId
     */
    public void entferneTermin(long terminId) throws Exception {
        try {
            Termin t = entityManager.find(Termin.class, terminId);
            entityManager.remove(t);
        } catch (EJBException e) {
            logger.error("Konnte Termin nicht entfernen!", e);
            throw new Exception("termin_error_entfernen");
        }
    }
}
