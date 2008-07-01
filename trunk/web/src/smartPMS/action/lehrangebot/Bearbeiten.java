package smartPMS.action.lehrangebot;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import smartPMS.action.AbstractAction;
import smartPMS.form.LehrangebotForm;
import smartPMS.modell.Lehrangebot;
import smartPMS.server.SmartController;
import smartPMS.session.DokumentSessionFacade;
import smartPMS.session.LehrangebotSessionFacade;
import smartPMS.transfer.LehrangebotVO;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class Bearbeiten extends AbstractAction {
    public ActionForward execute(ActionMapping actionMapping, ActionForm actionForm, HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws Exception {
        super.execute(actionMapping, actionForm, httpServletRequest, httpServletResponse);

        LehrangebotSessionFacade lehrangebotEJB = SmartController.getLehrangebotFacade();
        DokumentSessionFacade dokumentEJB = SmartController.getDokumentFacade();

        LehrangebotForm lForm = (LehrangebotForm) actionForm;
        LehrangebotVO lVO = lForm.getLehrangebot();
        Lehrangebot l = null;

        try {
            l = lehrangebotEJB.getLehrangebot(lVO.getId());
        } catch (Exception e) {
            return actionMapping.findForward("failure");
        }

        lVO.setBezeichnung(l.getBezeichnung());
        lVO.setDozentId(l.getDozent().getId());
        lVO.setNummer(l.getNummer());

        lForm.setLehrangebot(lVO);
        lForm.setDokumente(dokumentEJB.getDokumente(l.getId()));
        lForm.setTermine(lehrangebotEJB.getTermine(lVO.getId()));

        return actionMapping.findForward("success");
    }
}
