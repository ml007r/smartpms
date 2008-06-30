package smartPMS.action.abschlussarbeit;

import org.apache.struts.action.*;
import smartPMS.action.AbstractAction;
import smartPMS.form.DokumentForm;
import smartPMS.server.SmartController;
import smartPMS.session.DokumentSessionFacade;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by IntelliJ IDEA.
 * User: tbs
 * Date: 01.06.2008
 * Time: 12:33:18
 * To change this template use File | Settings | File Templates.
 */
public class Entfernen extends AbstractAction {

    public ActionForward execute(ActionMapping actionMapping, ActionForm actionForm, HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws Exception {
        super.execute(actionMapping, actionForm, httpServletRequest, httpServletResponse);

        DokumentSessionFacade dokumentEJB = SmartController.getDokumentFacade();
        DokumentForm dForm = (DokumentForm) actionForm;

        try {
            dokumentEJB.deleteDokument(dForm.getDokument().getId());
        } catch (Exception e) {
            ActionErrors errors = new ActionErrors();
            errors.add("dokument", new ActionMessage(e.getMessage()));
            super.addErrors(httpServletRequest, errors);
            return actionMapping.findForward("failure");
        }

        return actionMapping.findForward("success");
    }
}
