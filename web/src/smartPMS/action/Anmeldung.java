package smartPMS.action;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.struts.action.*;
import smartPMS.form.LoginForm;
import smartPMS.server.SmartController;
import smartPMS.session.PersonSessionFacade;
import smartPMS.transfer.SessionUser;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by IntelliJ IDEA.
 * User: tbs
 * Date: 31.05.2008
 * Time: 11:42:40
 * To change this template use File | Settings | File Templates.
 */
public class Anmeldung extends Action {

    private static Log logger = LogFactory.getLog(Anmeldung.class);

    @Override
    public ActionForward execute(ActionMapping actionMapping, ActionForm actionForm, HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws Exception {

        LoginForm loginForm = (LoginForm) actionForm;

        // 1. Seitenaufruf ist immer ein Erfolg
        if (loginForm.getBenutzername() == null && loginForm.getPasswort() == null)
            return actionMapping.findForward("failure");

        logger.info("Benutzeranmeldung: " + loginForm.getBenutzername());

        SessionUser prof = null;

        PersonSessionFacade personEJB = SmartController.getPersonFacade();

        try {
            prof = personEJB.authProfessor(loginForm.getBenutzername());
        } catch (Exception e) {
            logger.error("Konnte Professor nicht anmelden!", e);
        }

        if (prof == null) {
            ActionErrors errors = new ActionErrors();
            errors.add("benutzername", new ActionMessage("benutzername_falsch"));

            super.addErrors(httpServletRequest, errors);
            return actionMapping.findForward("failure");
        }

        logger.info("Professor authentifiziert!");
        httpServletRequest.getSession().setAttribute("loggedUser", prof);

        return actionMapping.findForward("success");
    }
}
