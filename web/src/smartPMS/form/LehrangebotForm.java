package smartPMS.form;

import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;
import smartPMS.modell.Dokument;
import smartPMS.modell.Termin;
import smartPMS.transfer.LehrangebotVO;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.Collection;


public class LehrangebotForm extends ActionForm {

    private LehrangebotVO lehrangebot;

    private Collection<Dokument> dokumente;

    private Collection<Termin> termine;

    public LehrangebotVO getLehrangebot() {
        return lehrangebot;
    }

    public void setLehrangebot(LehrangebotVO lehrangebot) {
        this.lehrangebot = lehrangebot;
    }

    public Collection<Dokument> getDokumente() {
        return dokumente;
    }

    public void setDokumente(Collection<Dokument> dokumente) {
        this.dokumente = dokumente;
    }

    public Collection<Termin> getTermine() {
        return termine;
    }

    public void setTermine(Collection<Termin> termine) {
        this.termine = termine;
    }

    public void reset(ActionMapping actionMapping, HttpServletRequest httpServletRequest) {
        super.reset(actionMapping, httpServletRequest);
        this.lehrangebot = new LehrangebotVO();
        this.dokumente = new ArrayList<Dokument>();
        this.termine = new ArrayList<Termin>();
    }

    public ActionErrors validate(ActionMapping actionMapping, HttpServletRequest httpServletRequest) {
        return super.validate(
                actionMapping, httpServletRequest
        );    //To change body of overridden methods use File | Settings | File Templates.
    }
}
