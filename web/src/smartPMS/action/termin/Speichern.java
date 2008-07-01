package smartPMS.action.termin;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import smartPMS.action.AbstractAction;
import smartPMS.form.TerminForm;
import smartPMS.modell.Termin;
import smartPMS.server.SmartController;
import smartPMS.session.LehrangebotSessionFacade;
import smartPMS.transfer.TerminVO;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class Speichern extends AbstractAction {
    @Override
    public ActionForward execute(ActionMapping actionMapping, ActionForm actionForm, HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws Exception {
        super.execute(actionMapping, actionForm, httpServletRequest, httpServletResponse);

        LehrangebotSessionFacade lehrangebotEJB = SmartController.getLehrangebotFacade();
        TerminForm tForm = (TerminForm) actionForm;

        TerminVO tVO = tForm.getTermin();
        Termin t = null;

        try {
            t = lehrangebotEJB.getTermin(tVO.getId());
        } catch (Exception e) {

            return actionMapping.findForward("failure");
        }

        tVO.setBeginn(t.getBeginn());
        tVO.setEnde(t.getEnde());
        tVO.setLehrangebotId(t.getLehrangebot().getId());
        tVO.setRaum(t.getRaum());
        tVO.setTyp(t.getTyp().ordinal());
        tVO.setWochentag(t.getWochentag());

        tForm.setTermin(tVO);

        return actionMapping.findForward("success");
    }
}
