/**
 * Created by IntelliJ IDEA.
 * User: tbs
 * Date: 26.05.2008
 * Time: 13:57:36
 * To change this template use File | Settings | File Templates.
 */
package smartPMS.session;

import smartPMS.interfaces.DokumentFacade;
import smartPMS.interfaces.DokumentFacadeHome;
import smartPMS.interfaces.DokumentFacadeLocal;
import smartPMS.interfaces.DokumentFacadeLocalHome;
import smartPMS.modell.Dokument;
import smartPMS.transfer.DokumentVO;

import javax.ejb.CreateException;
import javax.ejb.LocalHome;
import javax.ejb.RemoteHome;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.Collection;

@Stateless(name = "DokumentFacade")
@LocalHome(DokumentFacadeLocalHome.class)
@RemoteHome(DokumentFacadeHome.class)
public class DokumentSessionBean implements DokumentFacadeLocal, DokumentFacade {

    @PersistenceContext(unitName = "smartPMS")
    private EntityManager entityManager;


    public void ejbCreate() throws CreateException {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    public DokumentSessionBean() {
    }

    public long createDokument(DokumentVO Dokument) {
        return 0;  //To change body of implemented methods use File | Settings | File Templates.
    }

    public void updateDokument(DokumentVO Dokument) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    public void deleteDokument(long id) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    public Dokument getDokument(long id) {
        return entityManager.find(Dokument.class, id);
    }

    public Collection<Dokument> getDokumente() {
        return entityManager.createQuery("SELECT d FROM Dokument d").getResultList();
    }

    public Collection<Dokument> getDokumente(long lehrangebotId) {
        return entityManager.createQuery("SELECT d FROM Dokument d WHERE d.lehrangebot.id = :lehrangebotId")
                .setParameter("lehrangebotId", lehrangebotId).getResultList();
    }
}
