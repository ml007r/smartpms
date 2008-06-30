package smartPMS.action.dokument;

import org.apache.struts.action.*;
import smartPMS.action.AbstractAction;
import smartPMS.form.DokumentForm;
import smartPMS.modell.Dokument;
import smartPMS.server.SmartController;
import smartPMS.session.DokumentSessionFacade;
import smartPMS.session.PersonSessionFacade;
import smartPMS.transfer.DokumentVO;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class Bearbeiten extends AbstractAction {
    public ActionForward execute(ActionMapping actionMapping, ActionForm actionForm, HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws Exception {
        super.execute(actionMapping, actionForm, httpServletRequest, httpServletResponse);

        DokumentSessionFacade dokumentEJB = SmartController.getDokumentFacade();
        PersonSessionFacade personEJB = SmartController.getPersonFacade();

        DokumentForm dForm = (DokumentForm) actionForm;
        Dokument dokument = null;

        try {
            dokument = dokumentEJB.getDokument(dForm.getDokument().getId());
            dForm.setDokument(new DokumentVO(dokument));
        } catch (Exception e) {
            ActionErrors errors = new ActionErrors();
            errors.add("abschlussarbeit", new ActionMessage(e.getMessage()));
            super.addErrors(httpServletRequest, errors);
            return actionMapping.findForward("failure");
        }

        return actionMapping.findForward("success");
    }
}
