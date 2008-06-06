package smartPMS.form;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by IntelliJ IDEA.
 * User: tbs
 * Date: 01.06.2008
 * Time: 11:38:47
 * To change this template use File | Settings | File Templates.
 */
public class LehrangebotForm extends ActionForm {

    private long id;

    private String code;

    private String bezeichnung;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getBezeichnung() {
        return bezeichnung;
    }

    public void setBezeichnung(String bezeichnung) {
        this.bezeichnung = bezeichnung;
    }

    public void reset(ActionMapping actionMapping, HttpServletRequest httpServletRequest) {
        this.id = 0;
        this.code = null;
        this.bezeichnung = null;
    }
}
