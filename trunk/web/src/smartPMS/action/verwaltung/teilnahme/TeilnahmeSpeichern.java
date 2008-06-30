package smartPMS.action.verwaltung.teilnahme;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import smartPMS.action.AbstractAction;

import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;


public class TeilnahmeSpeichern extends AbstractAction {
    @Override
    public ActionForward execute(ActionMapping actionMapping, ActionForm actionForm, ServletRequest servletRequest, ServletResponse servletResponse) throws Exception {
        super.execute(actionMapping, actionForm, servletRequest, servletResponse);
        return actionMapping.findForward("success");
    }
}
