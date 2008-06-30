package smartPMS.action.verwaltung.klausur;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import smartPMS.action.AbstractAction;
import smartPMS.form.KlausurListeForm;
import smartPMS.server.SmartController;
import smartPMS.session.KlausurSessionFacade;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class KlausurListeAnzeigen extends AbstractAction {

    public ActionForward execute(ActionMapping actionMapping, ActionForm actionForm, HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws Exception {
        super.execute(actionMapping, actionForm, httpServletRequest, httpServletResponse);

        KlausurSessionFacade klausurEJB = SmartController.getKlausurFacade();
        KlausurListeForm kForm = (KlausurListeForm) actionForm;

        try {
            kForm.setKlausuren(klausurEJB.getNeueKlausuren(user.getId()));
        } catch (Exception e) {

        }

        return actionMapping.findForward("success");
    }
}
