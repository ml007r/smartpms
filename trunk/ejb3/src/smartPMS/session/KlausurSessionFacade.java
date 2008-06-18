package smartPMS.session;

import smartPMS.modell.Klausur;
import smartPMS.transfer.KlausurVO;

import java.util.Collection;

/**
 * Created by IntelliJ IDEA.
 * User: tbs
 * Date: 14.06.2008
 * Time: 20:05:28
 * To change this template use File | Settings | File Templates.
 */
public interface KlausurSessionFacade {

    /**
     * @param Klausur
     * @return
     */
    public long createKlausur(KlausurVO Klausur);

    /**
     * @param Klausur
     */
    public void updateKlausur(KlausurVO Klausur) throws IllegalAccessException;

    /**
     * @param id
     */
    public void deleteKlausur(long id);

    /**
     * @param id
     * @return
     */
    public Klausur getKlausur(long id);

    /**
     * @return
     */
    public Collection<Klausur> getKlausuren();
}
