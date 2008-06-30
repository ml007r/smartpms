package smartPMS.action.lehrangebot;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import smartPMS.action.AbstractAction;
import smartPMS.form.LehrangebotForm;
import smartPMS.server.SmartController;
import smartPMS.session.DokumentSessionFacade;
import smartPMS.session.LehrangebotSessionFacade;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class Anlegen extends AbstractAction {
    public ActionForward execute(ActionMapping actionMapping, ActionForm actionForm, HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws Exception {
        super.execute(actionMapping, actionForm, httpServletRequest, httpServletResponse);

        DokumentSessionFacade dokumentEJB = SmartController.getDokumentFacade();
        LehrangebotSessionFacade lehrangebotEJB = SmartController.getLehrangebotFacade();
        LehrangebotForm fForm = (LehrangebotForm) actionForm;

        try {
            fForm.setDokumente(dokumentEJB.getDokumente(fForm.getLehrangebot().getId()));
        } catch (Exception e) {

        }

        try {
            fForm.setTermine(lehrangebotEJB.getTermine(fForm.getLehrangebot().getId()));
        } catch (Exception e) {

        }

        return actionMapping.findForward("success");
    }
}
