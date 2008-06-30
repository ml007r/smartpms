package smartPMS.form;

import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;
import smartPMS.modell.Lehrangebot;
import smartPMS.transfer.DokumentVO;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.Collection;

/**
 * Created by IntelliJ IDEA.
 * User: tbs
 * Date: 26.05.2008
 * Time: 15:21:47
 * To change this template use File | Settings | File Templates.
 */
public class DokumentForm extends ActionForm {

    private DokumentVO dokument;

    private Collection<Lehrangebot> lehrangebote;

    public DokumentVO getDokument() {
        return dokument;
    }

    public void setDokument(DokumentVO dokument) {
        this.dokument = dokument;
    }

    public Collection<Lehrangebot> getLehrangebote() {
        return lehrangebote;
    }

    public void setLehrangebote(Collection<Lehrangebot> lehrangebote) {
        this.lehrangebote = lehrangebote;
    }

    public void reset(ActionMapping actionMapping, HttpServletRequest httpServletRequest) {
        super.reset(actionMapping, httpServletRequest);
        this.dokument = new DokumentVO();
        this.lehrangebote = new ArrayList<Lehrangebot>();
    }

    public ActionErrors validate(ActionMapping actionMapping, HttpServletRequest httpServletRequest) {
        return super.validate(actionMapping, httpServletRequest);
    }
}
