package smartPMS.form;

import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.upload.FormFile;
import smartPMS.modell.Lehrangebot;
import smartPMS.transfer.DokumentVO;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.Collection;


public class DokumentForm extends ActionForm {

    private DokumentVO dokument;

    private FormFile dateianhang;

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

    public FormFile getDateianhang() {
        return dateianhang;
    }

    public void setDateianhang(FormFile dateianhang) {
        this.dateianhang = dateianhang;
    }

    @Override
    public void reset(ActionMapping actionMapping, HttpServletRequest httpServletRequest) {
        super.reset(actionMapping, httpServletRequest);
        this.dokument = new DokumentVO();
        this.lehrangebote = new ArrayList<Lehrangebot>();
    }

    @Override
    public ActionErrors validate(ActionMapping actionMapping, HttpServletRequest httpServletRequest) {
        return super.validate(actionMapping, httpServletRequest);
    }
}
