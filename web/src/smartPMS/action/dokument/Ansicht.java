package smartPMS.action.dokument;

import org.apache.struts.action.*;
import smartPMS.action.AbstractAction;
import smartPMS.form.DokumentListeForm;
import smartPMS.server.SmartController;
import smartPMS.session.DokumentSessionFacade;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class Ansicht extends AbstractAction {

    public ActionForward execute(ActionMapping actionMapping, ActionForm actionForm, HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws Exception {
        super.execute(actionMapping, actionForm, httpServletRequest, httpServletResponse);

        DokumentSessionFacade dokumentEJB = SmartController.getDokumentFacade();
        DokumentListeForm dForm = (DokumentListeForm) actionForm;

        try {
            dForm.setDokumente(dokumentEJB.getDokumente(dForm.getLehrangebotId()));
        } catch (Exception e) {
            ActionErrors errors = new ActionErrors();
            errors.add("dokument", new ActionMessage(e.getMessage()));
            super.addErrors(httpServletRequest, errors);
        }


        return actionMapping.findForward("success");
    }
}
