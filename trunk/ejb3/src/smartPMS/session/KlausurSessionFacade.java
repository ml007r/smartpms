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
     * Liefert eine Collection mit allen Klausuren.
     *
     * @return
     */
    public Collection<Klausur> getKlausuren();

    /**
     * Liefert eine Collection mit allen Klausuren eines Dozenten.
     *
     * @param dozentId
     * @return
     */
    public Collection<Klausur> getKlausuren(long dozentId);

    /**
     * Liefert eine Collection mit geschriebenen, nicht bewerteten, Klausuren.
     *
     * @param dozentId
     * @return
     */
    public Collection<Klausur> getGeschriebeneKlausuren(long dozentId);

    /**
     * Liefert eine Collection mit nicht geschriebenen Klausuren.
     *
     * @param dozentId
     * @return
     */
    public Collection<Klausur> getNeueKlausuren(long dozentId);
}
