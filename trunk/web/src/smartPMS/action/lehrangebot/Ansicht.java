package smartPMS.action.lehrangebot;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import smartPMS.session.LehrangebotSessionBean;

import javax.ejb.EJB;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by IntelliJ IDEA.
 * User: tbs
 * Date: 01.06.2008
 * Time: 12:01:33
 * To change this template use File | Settings | File Templates.
 */
public class Ansicht extends Action {

    @EJB
    LehrangebotSessionBean lehrangebotEJB;

    public ActionForward execute(ActionMapping actionMapping, ActionForm actionForm, HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws Exception {


        return actionMapping.findForward("success");
    }
}
