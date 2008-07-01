package smartPMS.action.lehrangebot;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import smartPMS.action.AbstractAction;
import smartPMS.form.LehrangebotListeForm;
import smartPMS.server.SmartController;
import smartPMS.session.LehrangebotSessionFacade;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Ansicht extends AbstractAction {

    public ActionForward execute(ActionMapping actionMapping, ActionForm actionForm, HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws Exception {
        super.execute(actionMapping, actionForm, httpServletRequest, httpServletResponse);

        LehrangebotSessionFacade lehrangebotEJB = SmartController.getLehrangebotFacade();
        LehrangebotListeForm lForm = (LehrangebotListeForm) actionForm;
        
        lForm.setLehrangebote(lehrangebotEJB.getLehrangebote(user.getId()));
        
        return actionMapping.findForward("success");
    }
}
