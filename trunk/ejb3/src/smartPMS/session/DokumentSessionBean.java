/**
 * Created by IntelliJ IDEA.
 * User: tbs
 * Date: 26.05.2008
 * Time: 13:57:36
 * To change this template use File | Settings | File Templates.
 */
package smartPMS.session;

import smartPMS.modell.Dokument;
import smartPMS.transfer.DokumentVO;

import javax.ejb.Stateless;
import java.util.Collection;

@Stateless(name = "DokumentSessionEJB")
public class DokumentSessionBean implements DokumentFacade {


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
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    public Collection<Dokument> getDokumente() {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }
}
