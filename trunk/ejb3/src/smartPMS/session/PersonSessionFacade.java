package smartPMS.session;

import smartPMS.modell.*;
import smartPMS.transfer.SessionUser;

import java.util.Collection;

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
    public SessionUser authProfessor(String name, String passwort);

    /**
     * @param person
     * @return
     */
    public long createPerson(Person person);

    /**
     * @return
     */
    public Collection<Student> getStundenten();

    /**
     * @return
     */
    public Collection<Hilfskraft> getHilfskraefte();

    /**
     * @return
     */
    public Collection<Dozent> getDozenten();

    /**
     * @return
     */
    public Collection<Professor> getProfessoren();

}
