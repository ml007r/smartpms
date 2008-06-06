package smartPMS.form;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;
import smartPMS.modell.Lehrangebot;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.Collection;

/**
 * Created by IntelliJ IDEA.
 * User: tbs
 * Date: 01.06.2008
 * Time: 11:37:46
 * To change this template use File | Settings | File Templates.
 */
public class LehrangebotListeForm extends ActionForm {

    private Collection<Lehrangebot> lehrangebot;

    public Collection<Lehrangebot> getLehrangebot() {
        return lehrangebot;
    }

    public void setLehrangebot(Collection<Lehrangebot> lehrangebot) {
        this.lehrangebot = lehrangebot;
    }

    public void reset(ActionMapping actionMapping, HttpServletRequest httpServletRequest) {
        super.reset(actionMapping, httpServletRequest);
        this.lehrangebot = new ArrayList<Lehrangebot>();
    }
}
