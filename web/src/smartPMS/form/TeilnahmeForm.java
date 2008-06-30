package smartPMS.form;

import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;
import smartPMS.modell.Klausur;
import smartPMS.modell.Student;
import smartPMS.transfer.TeilnahmeVO;

import javax.servlet.http.HttpServletRequest;
import java.util.Collection;

public class TeilnahmeForm extends ActionForm {

    private Collection<Student> studenten;

    private Collection<Klausur> klausuren;

    private TeilnahmeVO teilnahme;

    public Collection<Student> getStudenten() {
        return studenten;
    }

    public void setStudenten(Collection<Student> studenten) {
        this.studenten = studenten;
    }

    public Collection<Klausur> getKlausuren() {
        return klausuren;
    }

    public void setKlausuren(Collection<Klausur> klausuren) {
        this.klausuren = klausuren;
    }

    public TeilnahmeVO getTeilnahme() {
        return teilnahme;
    }

    public void setTeilnahme(TeilnahmeVO teilnahme) {
        this.teilnahme = teilnahme;
    }

    @Override
    public void reset(ActionMapping actionMapping, HttpServletRequest httpServletRequest) {
        super.reset(actionMapping, httpServletRequest);
    }

    @Override
    public ActionErrors validate(ActionMapping actionMapping, HttpServletRequest httpServletRequest) {
        return super.validate(actionMapping, httpServletRequest);
    }
}
