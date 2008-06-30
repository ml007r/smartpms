package smartPMS.action.verwaltung.person;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import smartPMS.action.AbstractAction;
import smartPMS.form.PersonListeForm;
import smartPMS.server.SmartController;
import smartPMS.session.PersonSessionFacade;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by IntelliJ IDEA.
 * User: tbs
 * Date: 17.06.2008
 * Time: 15:26:03
 * To change this template use File | Settings | File Templates.
 */
public class PersonListeAnzeigen extends AbstractAction {

    private Log logger = LogFactory.getLog(PersonListeAnzeigen.class);

    public ActionForward execute(ActionMapping actionMapping, ActionForm actionForm, HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws Exception {
        super.execute(actionMapping, actionForm, httpServletRequest, httpServletResponse);

        PersonSessionFacade personEJB = SmartController.getPersonFacade();
        PersonListeForm pForm = (PersonListeForm) actionForm;

        pForm.setStudenten(personEJB.getStundenten());
        logger.info("Insgesamt " + pForm.getStudenten().size() + " Studenten gefunden --- " + pForm.getStudenten());

        pForm.setDozenten(personEJB.getDozenten());
        logger.info("Insgesamt " + pForm.getDozenten().size() + " Dozenten gefunden --- " + pForm.getDozenten());

        return actionMapping.findForward("success");
    }
}
