package smartPMS.form;

import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;
import smartPMS.transfer.TerminVO;

import javax.servlet.http.HttpServletRequest;
import java.text.DateFormat;
import java.text.ParseException;
import java.util.Locale;

public class TerminForm extends ActionForm {

    private TerminVO termin;

    public TerminVO getTermin() {
        return termin;
    }

    public void setTermin(TerminVO termin) {
        this.termin = termin;
    }

    public void setBeginnString(String param) {
        DateFormat df = DateFormat.getTimeInstance(DateFormat.SHORT, Locale.GERMANY);
        try {
            termin.setBeginn(df.parse(param));
        } catch (ParseException e) {

        }
    }

    public String getBeginnString() {
        DateFormat df = DateFormat.getTimeInstance(DateFormat.SHORT, Locale.GERMANY);
        try {
            return df.format(termin.getBeginn());
        } catch (Exception e) {
            return "";
        }
    }


    public void setEndeString(String param) {
        DateFormat df = DateFormat.getTimeInstance(DateFormat.SHORT, Locale.GERMANY);
        try {
            termin.setEnde(df.parse(param));
        } catch (ParseException e) {

        }
    }

    public String getEndeString() {
        DateFormat df = DateFormat.getTimeInstance(DateFormat.SHORT, Locale.GERMANY);
        try {
            return df.format(termin.getEnde());
        } catch (Exception e) {
            return "";
        }
    }

    @Override
    public ActionErrors validate(ActionMapping actionMapping, HttpServletRequest httpServletRequest) {
        return super.validate(actionMapping, httpServletRequest);
    }

    @Override
    public void reset(ActionMapping actionMapping, HttpServletRequest httpServletRequest) {
        super.reset(actionMapping, httpServletRequest);
        this.termin = new TerminVO();
    }
}
