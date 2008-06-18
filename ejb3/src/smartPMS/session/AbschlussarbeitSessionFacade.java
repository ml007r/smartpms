package smartPMS.session;

import smartPMS.modell.Abschlussarbeit;
import smartPMS.transfer.AbschlussarbeitVO;

import java.util.Collection;

/**
 * Created by IntelliJ IDEA.
 * User: tbs
 * Date: 14.06.2008
 * Time: 19:26:26
 * To change this template use File | Settings | File Templates.
 */
public interface AbschlussarbeitSessionFacade {

    /**
     * Eine neue
     * anlegen. Zurückgegeben wird die
     * neue ID
     *
     * @param abschlussarbeit
     * @return
     */
    public long createAbschlussarbeit(AbschlussarbeitVO abschlussarbeit);

    /**
     * @param abschlussarbeit
     */
    public void updateAbschlussarbeit(AbschlussarbeitVO abschlussarbeit);

    /**
     * @param id
     */
    public void deleteAbschlussarbeit(long id);

    /**
     * @param id
     * @return
     */
    public Abschlussarbeit getAbschlussarbeit(long id);

    /**
     * @return
     */

    public Collection<Abschlussarbeit> getAbschlussarbeiten();
}
