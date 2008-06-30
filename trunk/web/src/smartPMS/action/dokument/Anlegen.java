package smartPMS.action.dokument;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import smartPMS.action.AbstractAction;
import smartPMS.form.DokumentForm;
import smartPMS.server.SmartController;
import smartPMS.session.LehrangebotSessionFacade;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class Anlegen extends AbstractAction {

    public ActionForward execute(ActionMapping actionMapping, ActionForm actionForm, HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws Exception {
        super.execute(actionMapping, actionForm, httpServletRequest, httpServletResponse);

        LehrangebotSessionFacade lehrangebotEJB = SmartController.getLehrangebotFacade();

        DokumentForm dForm = (DokumentForm) actionForm;

        try {
            dForm.setLehrangebote(lehrangebotEJB.getLehrangebote(user.getId()));
        } catch (Exception e) {

        }

        return actionMapping.findForward("success");
    }
}
