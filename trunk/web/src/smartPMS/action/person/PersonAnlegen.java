package smartPMS.action.person;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.ejb.EJB;

/**
 * Created by IntelliJ IDEA.
 * User: tbs
 * Date: 26.05.2008
 * Time: 14:50:54
 * To change this template use File | Settings | File Templates.
 */
public class PersonAnlegen extends Action {

    @EJB
    PersonSession person;

    /**
     *
     * @param actionMapping
     * @param actionForm
     * @param servletRequest
     * @param servletResponse
     * @return
     * @throws Exception
     */
    public ActionForward execute(ActionMapping actionMapping, ActionForm actionForm, HttpServletRequest servletRequest, HttpServletResponse servletResponse) throws Exception {
    



        return actionMapping.findForward("");

    }
}
