package smartPMS.action.abschlussarbeit;

import org.apache.struts.action.*;
import smartPMS.action.AbstractAction;
import smartPMS.form.AbschlussarbeitForm;
import smartPMS.modell.Abschlussarbeit;
import smartPMS.server.SmartController;
import smartPMS.session.AbschlussarbeitSessionFacade;
import smartPMS.session.PersonSessionFacade;
import smartPMS.transfer.AbschlussarbeitVO;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by IntelliJ IDEA.
 * User: tbs
 * Date: 01.06.2008
 * Time: 12:33:04
 * To change this template use File | Settings | File Templates.
 */
public class Bearbeiten extends AbstractAction {

    public ActionForward execute(ActionMapping actionMapping, ActionForm actionForm, HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws Exception {
        super.execute(actionMapping, actionForm, httpServletRequest, httpServletResponse);

        AbschlussarbeitSessionFacade abschlussarbeitEJB = SmartController.getAbschlussarbeitFacade();
        PersonSessionFacade personEJB = SmartController.getPersonFacade();

        AbschlussarbeitForm aForm = (AbschlussarbeitForm) actionForm;

        Abschlussarbeit abschlussarbeit = null;

        try {
            abschlussarbeit = abschlussarbeitEJB.getAbschlussarbeit(aForm.getAbschlussarbeit().getId());
            aForm.setAbschlussarbeit(new AbschlussarbeitVO(abschlussarbeit));
        } catch (Exception e) {
            ActionErrors errors = new ActionErrors();
            errors.add("abschlussarbeit", new ActionMessage(e.getMessage()));
            super.addErrors(httpServletRequest, errors);
            return actionMapping.findForward("failure");
        }

        try {
            aForm.setStudenten(personEJB.getStundenten());
        } catch (Exception e) {

        }

        return actionMapping.findForward("success");
    }
}
