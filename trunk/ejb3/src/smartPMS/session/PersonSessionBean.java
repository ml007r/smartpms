/**
 * Created by IntelliJ IDEA.
 * User: tbs
 * Date: 26.05.2008
 * Time: 13:56:19
 * To change this template use File | Settings | File Templates.
 */
package smartPMS.session;

import smartPMS.modell.Student;

import javax.ejb.Stateless;
import java.util.Collection;

@Stateless(name = "PersonSessionEJB")
public class PersonSessionBean {
    public PersonSessionBean() {
    }

    /**
     * @param studiengang
     * @return
     */
    public Collection<Student> getStudenten(String studiengang) {

    }
}
