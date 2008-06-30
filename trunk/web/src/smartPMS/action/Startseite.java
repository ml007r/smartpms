package smartPMS.action;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

/**
 * Created by IntelliJ IDEA.
 * User: tbs
 * Date: 01.06.2008
 * Time: 11:36:52
 * To change this template use File | Settings | File Templates.
 */
public class Startseite extends AbstractAction {

    public ActionForward execute(ActionMapping actionMapping, ActionForm actionForm, ServletRequest servletRequest, ServletResponse servletResponse) throws Exception {
        super.execute(actionMapping, actionForm, servletRequest, servletResponse);
        return actionMapping.findForward("success");
    }
}
