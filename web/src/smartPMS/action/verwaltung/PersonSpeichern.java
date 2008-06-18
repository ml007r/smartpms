package smartPMS.action.verwaltung;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import smartPMS.form.PersonForm;
import smartPMS.modell.Dozent;
import smartPMS.modell.Person;
import smartPMS.modell.Student;
import smartPMS.server.SmartController;
import smartPMS.session.PersonSessionFacade;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by IntelliJ IDEA.
 * User: tbs
 * Date: 17.06.2008
 * Time: 15:26:28
 * To change this template use File | Settings | File Templates.
 */
public class PersonSpeichern extends Action {


    public ActionForward execute(ActionMapping actionMapping, ActionForm actionForm, HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws Exception {
        PersonSessionFacade personEJB = SmartController.getPersonFacade();

        if (personEJB == null) {
            return actionMapping.findForward("failure");
        }

        PersonForm pForm = (PersonForm) actionForm;

        Person person = null;

        switch (pForm.getTyp()) {
            case 1:
                person = new Student(pForm.getAnrede(), pForm.getVorname(), pForm.getNachname(), pForm.getAnschrift1(), pForm.getAnschrift2(), pForm.getPostleitzahl(), pForm.getWohnort(), pForm.getTelefon(), pForm.getTelefax(), pForm.getMobiltelefon(), pForm.getEmail(), pForm.getGeburtsdatum(), pForm.getMatrikel(), pForm.getStudiengang());
                break;
            case 2:
                break;
            case 3:
                person = new Dozent(pForm.getAnrede(), pForm.getVorname(), pForm.getNachname(), pForm.getAnschrift1(), pForm.getAnschrift2(), pForm.getPostleitzahl(), pForm.getWohnort(), pForm.getTelefon(), pForm.getTelefax(), pForm.getMobiltelefon(), pForm.getEmail(), pForm.getGeburtsdatum(), pForm.getTitel(), pForm.getBuero());
                break;
            case 4:
                break;
            default:
                break;
        }

        try {
            personEJB.createPerson(person);
        } catch (Exception e) {
            return actionMapping.findForward("failure");
        }

        return actionMapping.findForward("success");
    }
}
