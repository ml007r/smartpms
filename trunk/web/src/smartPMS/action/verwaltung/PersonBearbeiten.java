package smartPMS.action.verwaltung;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by IntelliJ IDEA.
 * User: tbs
 * Date: 17.06.2008
 * Time: 15:15:01
 * To change this template use File | Settings | File Templates.
 */
public class PersonBearbeiten extends Action {

    private static Log logger = LogFactory.getLog(PersonBearbeiten.class);


    public ActionForward execute(ActionMapping actionMapping, ActionForm actionForm, HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws Exception {
        logger.info("Bearbeite Person!");
        return actionMapping.findForward("success");
    }
}
