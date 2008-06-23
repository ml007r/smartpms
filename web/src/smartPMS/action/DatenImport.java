package smartPMS.action;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import smartPMS.modell.Dozent;
import smartPMS.modell.Person;
import smartPMS.modell.Professor;
import smartPMS.modell.Student;
import smartPMS.server.SmartController;
import smartPMS.session.PersonSessionFacade;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: tbs
 * Date: 22.06.2008
 * Time: 14:37:18
 * To change this template use File | Settings | File Templates.
 */
public class DatenImport extends Action {

    public ActionForward execute(ActionMapping actionMapping, ActionForm actionForm, HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws Exception {

        PersonSessionFacade personEJB = SmartController.getPersonFacade();

        if (personEJB != null) {
            List<Person> personListe = new ArrayList<Person>();

            personListe.add(new Student("Herr", "Marcel", "Liening", "Am Acker 1", "", "12345", "Pusemuckel", "0190 123456", "", "", "marcel@liening.com", new Date(), 1234567, "Wirtschaftsinformatik"));
            personListe.add(new Student("Herr", "Markus", "Müller", "Am Acker 2", "", "12345", "Hamm", "0190 123456", "", "", "markus@müller.com", new Date(), 1234568, "Wirtschaftsinformatik"));
            personListe.add(new Student("Herr", "Tobias", "Langlotz", "Am Acker 3", "", "12345", "Bochum", "0190 123456", "", "", "tobias@langlotz.com", new Date(), 1234569, "Wirtschaftsinformatik"));
            personListe.add(new Student("Herr", "Jürgen", "Klinsmann", "Am Acker 1", "", "12345", "Essen", "0190 123456", "", "", "hans@wurst.com", new Date(), 543534, "Informatik"));
            personListe.add(new Student("Herr", "Yogi", "Löw", "Am Acker 1", "", "12345", "Herne", "0190 123456", "", "", "test@mopped.com", new Date(), 645323, "Informatik"));
            personListe.add(new Student("Herr", "Miro", "Klose", "Am Acker 1", "", "12345", "Dortmund", "0190 123456", "", "", "wupp@wupp.com", new Date(), 87353453, "Informatik"));
            personListe.add(new Student("Herr", "Prinz", "Peng", "Am Acker 1", "", "12345", "Duisburg", "0190 123456", "", "", "brumm@brumm.de.vu", new Date(), 23454, "Medizininformatik"));

            personListe.add(new Dozent("Herr", "Kalle", "Grabowski", "Am Acker 1", "", "12345", "Duisburg", "0190 123456", "", "", "kalle@grab.com", new Date(), "Dr. Dr."));
            personListe.add(new Dozent("Frau", "Anna", "Von Hinten", "Am Acker 1", "", "12345", "Duisburg", "0190 123456", "", "", "anna@vh.com", new Date(), "Dr. Dr."));
            personListe.add(new Dozent("Herr", "Uwe", "Meier", "Am Acker 1", "", "12345", "Duisburg", "0190 123456", "", "", "uwe@meier.com", new Date(), "Dipl. Inf"));
            personListe.add(new Dozent("Frau", "Nataile", "Schluck", "Am Acker 1", "", "12345", "Duisburg", "0190 123456", "", "", "natty@sch-l-uck.com", new Date(), "Dr. Dr."));

            personListe.add(new Professor("Herr", "X.", "Zeppenfeld", "Am Acker 1", "", "12345", "Duisburg", "0190 123456", "", "", "swt@zep.com", new Date(), "Prof. Dr. Dr.", "A.E.01", "Kann alles", "abc"));
            personListe.add(new Professor("Herr", "X.", "Balzerz", "Am Acker 1", "", "12345", "Duisburg", "0190 123456", "", "", "swt@zep.com", new Date(), "Prof. Dr. Dr. Dr.", "A.E.02", "Kann noch mehr", "abc"));

            for (Person p : personListe) {
                try {
                    personEJB.createPerson(p);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }

        return actionMapping.findForward("success");
    }
}
