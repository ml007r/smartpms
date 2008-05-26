package smartPMS.form;

import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by IntelliJ IDEA.
 * User: tbs
 * Date: 26.05.2008
 * Time: 14:55:50
 * To change this template use File | Settings | File Templates.
 */
public class PersonForm extends ActionForm {

    public void reset(ActionMapping actionMapping, HttpServletRequest httpServletRequest) {

    }

    public ActionErrors validate(ActionMapping actionMapping, HttpServletRequest httpServletRequest) {
        ActionErrors errors = new ActionErrors();
        return errors;
    }
}
