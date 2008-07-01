package smartPMS.action.verwaltung;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionForm;
import smartPMS.action.AbstractAction;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by IntelliJ IDEA.
 * User: tbs
 * Date: 30.06.2008
 * Time: 08:31:46
 * To change this template use File | Settings | File Templates.
 */
public class Anzeigen extends AbstractAction {

    @Override
    public ActionForward execute(ActionMapping actionMapping, ActionForm actionForm, HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws Exception {
        return super.execute(
                actionMapping, actionForm, httpServletRequest, httpServletResponse
        );
    }
}
