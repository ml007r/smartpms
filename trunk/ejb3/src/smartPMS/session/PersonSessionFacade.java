package smartPMS.session;

import smartPMS.modell.Person;
import smartPMS.transfer.SessionUser;

/**
 * Created by IntelliJ IDEA.
 * User: tbs
 * Date: 17.06.2008
 * Time: 10:18:44
 * To change this template use File | Settings | File Templates.
 */
public interface PersonSessionFacade {

    /**
     * @param name
     * @return
     */
    public SessionUser authProfessor(String name);

    /**
     * @param person
     * @return
     */
    public long createPerson(Person person);
}
