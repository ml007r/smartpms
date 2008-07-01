package smartPMS.session;

import smartPMS.modell.Lehrangebot;
import smartPMS.modell.Termin;
import smartPMS.transfer.LehrangebotVO;
import smartPMS.transfer.TerminVO;

import java.util.Collection;

public interface LehrangebotSessionFacade {

    /**
     * @param lehrangebot
     * @return
     */
    public long createLehrangebot(LehrangebotVO lehrangebot) throws Exception;

    /**
     * @param lehrangebot
     */
    public void updateLehrangebot(LehrangebotVO lehrangebot) throws Exception;

    /**
     * @param lehrangebotId
     */
    public void deleteLehrangebot(long lehrangebotId) throws Exception;

    /**
     * @param lehrangebotId
     * @return
     * @throws Exception
     */
    public Lehrangebot getLehrangebot(long lehrangebotId) throws Exception;

    /**
     * @return
     */
    public Collection<Lehrangebot> getLehrangebote();

    /**
     * @param dozentId
     * @return
     */
    public Collection<Lehrangebot> getLehrangebote(long dozentId);

    /**
     * @param termin
     * @return
     * @throws Exception
     */
    public long createTermin(TerminVO termin) throws Exception;

    /**
     * @param termin
     * @throws Exception
     */
    public void updateTermin(TerminVO termin) throws Exception;

    /**
     * @param terminId
     * @throws Exception
     */
    public void deleteTermin(long terminId) throws Exception;

    /**
     * @param terminId
     * @return
     * @throws Exception
     */
    public Termin getTermin(long terminId) throws Exception;

    /**
     * @return
     */
    public Collection<Termin> getTermine();

    /**
     * @param lehrangebotId
     * @return
     */
    public Collection<Termin> getTermine(long lehrangebotId);

}
