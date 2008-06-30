package smartPMS.session;

import smartPMS.modell.Lehrangebot;
import smartPMS.modell.Termin;

import java.util.Collection;

public interface LehrangebotSessionFacade {

    public Collection<Lehrangebot> getLehrangebote();

    public Collection<Lehrangebot> getLehrangebote(long dozentId);


    public Collection<Termin> getTermine(long lehrangebotId);
}
