package smartPMS.action.verwaltung.teilnahme;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import smartPMS.action.AbstractAction;

import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

/**
 * Created by IntelliJ IDEA.
 * User: tbs
 * Date: 29.06.2008
 * Time: 11:56:46
 * To change this template use File | Settings | File Templates.
 */
public class TeilnahmeAnlegen extends AbstractAction {
    @Override
    public ActionForward execute(ActionMapping actionMapping, ActionForm actionForm, ServletRequest servletRequest, ServletResponse servletResponse) throws Exception {
        super.execute(actionMapping, actionForm, servletRequest, servletResponse);

        return actionMapping.findForward("success");
    }
}
