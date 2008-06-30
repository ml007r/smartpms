package smartPMS.action.dokument;

import org.apache.struts.action.*;
import smartPMS.action.AbstractAction;
import smartPMS.form.DokumentForm;
import smartPMS.server.SmartController;
import smartPMS.session.DokumentSessionFacade;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class Speichern extends AbstractAction {
    public ActionForward execute(ActionMapping actionMapping, ActionForm actionForm, HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws Exception {
        super.execute(actionMapping, actionForm, httpServletRequest, httpServletResponse);

        DokumentSessionFacade dokumentEJB = SmartController.getDokumentFacade();
        DokumentForm aForm = (DokumentForm) actionForm;

        try {
            if (aForm.getDokument().getId() == 0) {
                dokumentEJB.createDokument(aForm.getDokument());
            } else {
                dokumentEJB.updateDokument(aForm.getDokument());
            }
        } catch (Exception e) {
            ActionErrors errors = new ActionErrors();
            errors.add("dokument", new ActionMessage(e.getMessage()));
            super.addErrors(httpServletRequest, errors);
            return actionMapping.findForward("failure");
        }

        return actionMapping.findForward("success");
    }
}
