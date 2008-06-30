package smartPMS.action.klausur;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import smartPMS.action.AbstractAction;
import smartPMS.form.KlausurListeForm;
import smartPMS.server.SmartController;
import smartPMS.session.KlausurSessionFacade;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by IntelliJ IDEA.
 * User: tbs
 * Date: 01.06.2008
 * Time: 12:10:14
 * To change this template use File | Settings | File Templates.
 */
public class Ansicht extends AbstractAction {
    public ActionForward execute(ActionMapping actionMapping, ActionForm actionForm, HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws Exception {

        super.execute(actionMapping, actionForm, httpServletRequest, httpServletResponse);
        KlausurSessionFacade ksf = SmartController.getKlausurFacade();
        KlausurListeForm klf = (KlausurListeForm) actionForm;
        klf.setKlausuren(ksf.getKlausuren(user.getId()));
        klf.setNeueKlausuren(ksf.getNeueKlausuren(user.getId()));
        klf.setGeschriebeneKlausuren(ksf.getGeschriebeneKlausuren((user.getId())));

        return actionMapping.findForward("success");
    }
}
