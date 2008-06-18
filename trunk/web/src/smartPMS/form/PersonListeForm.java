package smartPMS.form;

import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;
import smartPMS.modell.Dozent;
import smartPMS.modell.Student;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.Collection;

/**
 * Created by IntelliJ IDEA.
 * User: tbs
 * Date: 17.06.2008
 * Time: 13:22:00
 * To change this template use File | Settings | File Templates.
 */
public class PersonListeForm extends ActionForm {

    private Collection<Student> studenten;

    private Collection<Dozent> dozenten;

    public Collection<Student> getStudenten() {
        return studenten;
    }

    public void setStudenten(Collection<Student> studenten) {
        this.studenten = studenten;
    }

    public Collection<Dozent> getDozenten() {
        return dozenten;
    }

    public void setDozenten(Collection<Dozent> dozenten) {
        this.dozenten = dozenten;
    }

    public void reset(ActionMapping actionMapping, HttpServletRequest httpServletRequest) {
        super.reset(actionMapping, httpServletRequest);
        this.studenten = new ArrayList<Student>();
        this.dozenten = new ArrayList<Dozent>();
    }

    public ActionErrors validate(ActionMapping actionMapping, HttpServletRequest httpServletRequest) {
        return super.validate(actionMapping, httpServletRequest);
    }
}
