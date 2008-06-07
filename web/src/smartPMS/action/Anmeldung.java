package smartPMS.action;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.struts.action.*;
import smartPMS.form.LoginForm;

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

        if (logger.isInfoEnabled())
            logger.info("Benutzeranmeldung: " + loginForm.getBenutzername());

        // nachschauen ob der name in PERSON Tabelle steht

        if (true) {
            httpServletRequest.getSession().setAttribute("loggedUser", "bla");
            return actionMapping.findForward("success");
        }

        ActionErrors errors = new ActionErrors();
        errors.add("benutzername", new ActionMessage("benutzername_falsch"));
        super.addErrors(httpServletRequest, errors);
        return actionMapping.findForward("failure");
    }
}
