package smartPMS.form;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;
import smartPMS.modell.Dokument;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.Collection;

/**
 * Created by IntelliJ IDEA.
 * User: tbs
 * Date: 26.05.2008
 * Time: 15:21:56
 * To change this template use File | Settings | File Templates.
 */
public class DokumentListeForm extends ActionForm {

    private long lehrangebotId;

    private Collection<Dokument> dokumente;


    public long getLehrangebotId() {
        return lehrangebotId;
    }

    public void setLehrangebotId(long lehrangebotId) {
        this.lehrangebotId = lehrangebotId;
    }

    public Collection<Dokument> getDokumente() {
        return dokumente;
    }

    public void setDokumente(Collection<Dokument> dokumente) {
        this.dokumente = dokumente;
    }

    public void reset(ActionMapping actionMapping, HttpServletRequest httpServletRequest) {
        super.reset(actionMapping, httpServletRequest);
        this.lehrangebotId = 0;
        this.dokumente = new ArrayList<Dokument>();
    }
}
