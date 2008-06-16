package smartPMS.form;

import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;
import smartPMS.transfer.KlausurVO;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by IntelliJ IDEA.
 * User: tbs
 * Date: 26.05.2008
 * Time: 15:20:15
 * To change this template use File | Settings | File Templates.
 */
public class KlausurForm extends ActionForm {

    // zu bearbeitende Klausur

    private KlausurVO klausur;

    public KlausurVO getKlausur() {
        return klausur;
    }

    public void setKlausur(KlausurVO klausur) {
        this.klausur = klausur;
    }

    //

    @Override
    public void reset(ActionMapping actionMapping, HttpServletRequest httpServletRequest) {
        super.reset(actionMapping, httpServletRequest);
        klausur = new KlausurVO();
    }

    @Override
    public ActionErrors validate(ActionMapping actionMapping, HttpServletRequest httpServletRequest) {

        ActionErrors error = new ActionErrors();

        // in MEssageResources.properties:
        // klausur_beginn_null=Es wurde kein Beginn eingegeben

        if (klausur.getBeginn() == null)
            error.add("klausur.beginn", new ActionMessage("klausur_beginn_null"));


        return error;
    }

}
