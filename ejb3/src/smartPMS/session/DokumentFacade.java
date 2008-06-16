package smartPMS.session;

import smartPMS.modell.Dokument;
import smartPMS.transfer.DokumentVO;

import javax.ejb.Local;
import javax.ejb.Remote;
import java.util.Collection;

/**
 * Created by IntelliJ IDEA.
 * User: tbs
 * Date: 14.06.2008
 * Time: 19:45:42
 * To change this template use File | Settings | File Templates.
 */
@Local
@Remote
public interface DokumentFacade {

    public long createDokument(DokumentVO Dokument);

    /**
     * @param Dokument
     */
    public void updateDokument(DokumentVO Dokument);

    /**
     * @param id
     */
    public void deleteDokument(long id);

    /**
     * @param id
     * @return
     */
    public Dokument getDokument(long id);

    /**
     * @return
     */
    public Collection<Dokument> getDokumente();
}
