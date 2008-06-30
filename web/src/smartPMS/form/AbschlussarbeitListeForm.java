package smartPMS.form;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;
import smartPMS.modell.Abschlussarbeit;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.Collection;

/**
 * Created by IntelliJ IDEA.
 * User: tbs
 * Date: 26.05.2008
 * Time: 15:21:02
 * To change this template use File | Settings | File Templates.
 */
public class AbschlussarbeitListeForm extends ActionForm {

    private Collection<Abschlussarbeit> abschlussarbeiten;

    public Collection<Abschlussarbeit> getAbschlussarbeiten() {
        return abschlussarbeiten;
    }

    public void setAbschlussarbeiten(Collection<Abschlussarbeit> abschlussarbeiten) {
        this.abschlussarbeiten = abschlussarbeiten;
    }

    public void reset(ActionMapping actionMapping, HttpServletRequest httpServletRequest) {
        super.reset(actionMapping, httpServletRequest);
        this.abschlussarbeiten = new ArrayList<Abschlussarbeit>();
    }
}
