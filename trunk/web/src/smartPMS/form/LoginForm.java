package smartPMS.form;

import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by IntelliJ IDEA.
 * User: tbs
 * Date: 31.05.2008
 * Time: 11:38:09
 * To change this template use File | Settings | File Templates.
 */
public class LoginForm extends ActionForm {

    private String benutzername;


    public String getBenutzername() {
        return benutzername;
    }

    public void setBenutzername(String benutzername) {
        this.benutzername = benutzername;
    }

    private String passwort;

    public String getPasswort() {
        return passwort;
    }

    public void setPasswort(String passwort) {
        this.passwort = passwort;
    }

    public void reset(ActionMapping actionMapping, HttpServletRequest httpServletRequest) {
        super.reset(actionMapping, httpServletRequest);
        this.benutzername = null;
        this.passwort = null;

    }

    public ActionErrors validate(ActionMapping actionMapping, HttpServletRequest httpServletRequest) {
        ActionErrors e = super.validate(actionMapping, httpServletRequest);

        if (benutzername == null) {
            e.add("benutzername", new ActionMessage("error_benutzername"));
        }

        if (passwort == null) {
            e.add("passwort", new ActionMessage("error_passwort"));
        }

        if (benutzername != passwort) {
            e.add("passwort", new ActionMessage("error_benutzername_passwort"));
        }

        return e;
    }
}
