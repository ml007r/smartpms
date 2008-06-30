package smartPMS.form;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;
import smartPMS.modell.Klausur;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.Collection;

public class KlausurListeForm extends ActionForm {

    private Collection<Klausur> klausuren;

    private Collection<Klausur> geschriebeneKlausuren;

    private Collection<Klausur> neueKlausuren;

    public Collection<Klausur> getKlausuren() {
        return klausuren;
    }

    public void setKlausuren(Collection<Klausur> klausuren) {
        this.klausuren = klausuren;
    }

    public Collection<Klausur> getGeschriebeneKlausuren() {
        return geschriebeneKlausuren;
    }

    public void setGeschriebeneKlausuren(Collection<Klausur> geschriebeneKlausuren) {
        this.geschriebeneKlausuren = geschriebeneKlausuren;
    }

    public Collection<Klausur> getNeueKlausuren() {
        return neueKlausuren;
    }

    public void setNeueKlausuren(Collection<Klausur> neueKlausuren) {
        this.neueKlausuren = neueKlausuren;
    }

    @Override
    public void reset(ActionMapping actionMapping, HttpServletRequest httpServletRequest) {
        super.reset(actionMapping, httpServletRequest);
        this.klausuren = new ArrayList<Klausur>();
        this.geschriebeneKlausuren = new ArrayList<Klausur>();
        this.neueKlausuren = new ArrayList<Klausur>();
    }
}
