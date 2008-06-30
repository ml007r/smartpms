package smartPMS.action.dokument;

import org.apache.struts.action.*;
import smartPMS.action.AbstractAction;
import smartPMS.form.AbschlussarbeitForm;
import smartPMS.server.SmartController;
import smartPMS.session.AbschlussarbeitSessionFacade;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class Entfernen extends AbstractAction {
    public ActionForward execute(ActionMapping actionMapping, ActionForm actionForm, HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws Exception {
        super.execute(actionMapping, actionForm, httpServletRequest, httpServletResponse);

        AbschlussarbeitSessionFacade abschlussarbeitEJB = SmartController.getAbschlussarbeitFacade();
        AbschlussarbeitForm aForm = (AbschlussarbeitForm) actionForm;

        try {
            abschlussarbeitEJB.deleteAbschlussarbeit(aForm.getAbschlussarbeit().getId());
        } catch (Exception e) {
            ActionErrors errors = new ActionErrors();
            errors.add("abschlussarbeit", new ActionMessage(e.getMessage()));
            super.addErrors(httpServletRequest, errors);
            return actionMapping.findForward("failure");
        }

        return actionMapping.findForward("success");
    }
}
