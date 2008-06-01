package smartPMS.action;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
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

    public ActionForward execute(ActionMapping actionMapping, ActionForm actionForm, HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws Exception {

        LoginForm loginForm = (LoginForm) actionForm;

        if (httpServletRequest.getSession().getAttribute("loggedUser") == null) {
            return actionMapping.findForward("failure");
        }

        return actionMapping.findForward("success");
    }
}
