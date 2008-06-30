package smartPMS.form;

import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;
import smartPMS.modell.Abschlussarbeit;
import smartPMS.modell.Student;
import smartPMS.transfer.AbschlussarbeitVO;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.Collection;

public class AbschlussarbeitForm extends ActionForm {

    private AbschlussarbeitVO abschlussarbeit;

    private Collection<Student> studenten;

    public AbschlussarbeitVO getAbschlussarbeit() {
        return abschlussarbeit;
    }

    public void setAbschlussarbeit(AbschlussarbeitVO abschlussarbeit) {
        this.abschlussarbeit = abschlussarbeit;
    }

    public Collection<Student> getStudenten() {
        return studenten;
    }

    public void setStudenten(Collection<Student> studenten) {
        this.studenten = studenten;
    }

    public int getAbschlussarbeitTyp() {
        return this.abschlussarbeit.getTyp().ordinal();
    }

    public void setAbschlussarbeitTyp(int typ) {
        this.abschlussarbeit.setTyp(Abschlussarbeit.AbschlussarbeitTyp.values()[typ]);
    }

    public void reset(ActionMapping actionMapping, HttpServletRequest httpServletRequest) {
        super.reset(actionMapping, httpServletRequest);
        this.abschlussarbeit = new AbschlussarbeitVO();
        this.studenten = new ArrayList<Student>();
    }

    public ActionErrors validate(ActionMapping actionMapping, HttpServletRequest httpServletRequest) {
        return super.validate(actionMapping, httpServletRequest);
    }
}
