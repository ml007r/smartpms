package smartPMS.action.verwaltung.klausur;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;
import smartPMS.action.AbstractAction;
import smartPMS.form.KlausurForm;
import smartPMS.server.SmartController;
import smartPMS.session.KlausurSessionFacade;
import smartPMS.transfer.KlausurVO;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Date;


public class KlausurSchreiben extends AbstractAction {

    public ActionForward execute(ActionMapping actionMapping, ActionForm actionForm, HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws Exception {
        super.execute(actionMapping, actionForm, httpServletRequest, httpServletResponse);

        KlausurSessionFacade klausurEJB = SmartController.getKlausurFacade();
        KlausurForm kForm = (KlausurForm) actionForm;

        KlausurVO klausur = kForm.getKlausur();
        klausur.setDatum(new Date()); // heute
        klausur.setBeginn(new Date(System.currentTimeMillis() - (2 * 60 * 60 * 100 - 1000))); // jetzt vor 2 Stunden
        klausur.setBeginn(new Date(System.currentTimeMillis() - 1000)); // jetzt

        try {
            klausurEJB.updateKlausur(klausur);
        } catch (Exception e) {
            errors.add("", new ActionMessage(e.getMessage()));
            return actionMapping.findForward("failure");
        }

        return actionMapping.findForward("success");
    }
}
