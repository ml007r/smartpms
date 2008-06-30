package smartPMS.action.abschlussarbeit;

import org.apache.struts.action.*;
import smartPMS.action.AbstractAction;
import smartPMS.form.AbschlussarbeitListeForm;
import smartPMS.server.SmartController;
import smartPMS.session.AbschlussarbeitSessionFacade;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by IntelliJ IDEA.
 * User: tbs
 * Date: 01.06.2008
 * Time: 12:33:47
 * To change this template use File | Settings | File Templates.
 */
public class Ansicht extends AbstractAction {
    public ActionForward execute(ActionMapping actionMapping, ActionForm actionForm, HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws Exception {
        super.execute(actionMapping, actionForm, httpServletRequest, httpServletResponse);

        AbschlussarbeitSessionFacade abschlussarbeitEJB = SmartController.getAbschlussarbeitFacade();
        AbschlussarbeitListeForm aForm = (AbschlussarbeitListeForm) actionForm;

        try {
            aForm.setAbschlussarbeiten(abschlussarbeitEJB.getAbschlussarbeiten());
        } catch (Exception e) {
            ActionErrors errors = new ActionErrors();
            errors.add("abschlussarbeit", new ActionMessage(e.getMessage()));
            super.addErrors(httpServletRequest, errors);
        }


        return actionMapping.findForward("success");
    }
}
