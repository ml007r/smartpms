package smartPMS.action;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.struts.action.*;
import smartPMS.form.LoginForm;
import smartPMS.session.PersonFacade;
import smartPMS.transfer.SessionUser;

import javax.ejb.EJB;
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

    //(beanName = "PersonSessionEJB", beanInterface = PersonFacade.class)

    @EJB
    PersonFacade personSessionEJB;

    @Override
    public ActionForward execute(ActionMapping actionMapping, ActionForm actionForm, HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws Exception {

        LoginForm loginForm = (LoginForm) actionForm;
        logger.info("Benutzeranmeldung: " + loginForm.getBenutzername());

        SessionUser prof = null;

        try {
            personSessionEJB.authProfessor(loginForm.getBenutzername());
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
