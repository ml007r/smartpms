package smartPMS.action;

import org.apache.struts.action.*;
import smartPMS.exceptions.NotLoggedInException;
import smartPMS.form.LoginForm;
import smartPMS.modell.Professor;
import smartPMS.server.SmartController;
import smartPMS.session.PersonSessionFacade;
import smartPMS.transfer.SessionUser;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Date;

/**
 * Created by IntelliJ IDEA.
 * User: tbs
 * Date: 28.06.2008
 * Time: 10:54:45
 * To change this template use File | Settings | File Templates.
 */
public abstract class AbstractAction extends Action {

    protected SessionUser user;

    protected ActionErrors errors = new ActionErrors();

    public ActionForward execute(ActionMapping actionMapping, ActionForm actionForm, HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws Exception {

        PersonSessionFacade personEJB = SmartController.getPersonFacade();
        if (personEJB.authProfessor("Zeppenfeld", "abcd") == null) {
            personEJB.createPerson(
                    new Professor(
                            "Herr", "Klaus", "Zeppenfeld", "********-*****-*** **",
                            "", "*****", "********", "",
                            "", "", "zeppenfeld@fh-dortmund.de", new Date(),
                            "Prof. Dr.", "A.E.01", "Softwaretechnik", "abcd"
                    )
            );
        }

        // Benutzer aus der Session laden
        try {
            user = (SessionUser) httpServletRequest.getSession().getAttribute("user");
        } catch (ClassCastException e) {

        } catch (Exception e) {

        }

        // Kein Benutzer angemeldet && Form ist nicht LoginForm (Benutzeranmeldung)
        if (user == null && !(actionForm instanceof LoginForm)) {
            ActionErrors errors = new ActionErrors();
            errors.add("", new ActionMessage("nicht_angemeldet"));
            super.addErrors(httpServletRequest, errors);
            throw new NotLoggedInException();
        }

        // Symbolischer Forward, der nicht gemappt ist
        return actionMapping.findForward("success");
    }
}
