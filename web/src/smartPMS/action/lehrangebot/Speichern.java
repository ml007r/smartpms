package smartPMS.action.lehrangebot;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;
import smartPMS.action.AbstractAction;
import smartPMS.form.LehrangebotForm;
import smartPMS.server.SmartController;
import smartPMS.session.LehrangebotSessionFacade;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Speichern extends AbstractAction {


    public ActionForward execute(ActionMapping actionMapping, ActionForm actionForm, HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws Exception {
        super.execute(actionMapping, actionForm, httpServletRequest, httpServletResponse);

        LehrangebotSessionFacade lehrangebotEJB = SmartController.getLehrangebotFacade();
        LehrangebotForm lForm = (LehrangebotForm) actionForm;

        try {
            if (lForm.getLehrangebot().getId() == 0) {
                lehrangebotEJB.createLehrangebot(lForm.getLehrangebot());
            } else {
                lehrangebotEJB.updateLehrangebot(lForm.getLehrangebot());
            }
        } catch (Exception e) {
            e.printStackTrace();
            errors.add("", new ActionMessage("lehrangebot_speichern_fehler"));

            super.addErrors(httpServletRequest, errors);
            return actionMapping.findForward("failure");
        }

        return actionMapping.findForward("success");
    }
}
