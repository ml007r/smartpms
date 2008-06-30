package smartPMS.action.abschlussarbeit;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import smartPMS.action.AbstractAction;
import smartPMS.form.AbschlussarbeitForm;
import smartPMS.server.SmartController;
import smartPMS.session.PersonSessionFacade;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class Anlegen extends AbstractAction {

    public ActionForward execute(ActionMapping actionMapping, ActionForm actionForm, HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws Exception {
        super.execute(actionMapping, actionForm, httpServletRequest, httpServletResponse);

        PersonSessionFacade personEJB = SmartController.getPersonFacade();

        AbschlussarbeitForm aForm = (AbschlussarbeitForm) actionForm;
        try {
            aForm.setStudenten(personEJB.getStundenten());
        } catch (Exception e) {

        }

        return actionMapping.findForward("success");
    }
}
