package smartPMS.server;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.struts.action.Action;
import smartPMS.interfaces.*;
import smartPMS.util.*;

import javax.ejb.CreateException;
import javax.naming.NamingException;

/**
 * Created by IntelliJ IDEA.
 * User: tbs
 * Date: 17.06.2008
 * Time: 11:47:33
 * To change this template use File | Settings | File Templates.
 */
public abstract class SmartController extends Action {

    private static Log logger = LogFactory.getLog(SmartController.class);

    /**
     * Singleton Instance
     */
    private static PersonFacadeLocal personBean;

    /**
     * @return
     */
    public static PersonFacadeLocal getPersonFacade() {
        if (personBean == null) {
            logger.info("Lade PersonFacadeLocal!");
            try {
                personBean = PersonFacadeUtil.getLocalHome().create();
            } catch (CreateException e) {
                e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
            } catch (NamingException e) {
                e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
            }
        }
        return personBean;
    }

    /**
     * Singleton Instance
     */
    private static LehrangebotFacadeLocal lehrangebotBean;

    /**
     * @return
     */
    public static LehrangebotFacadeLocal getLehrangebotFacade() {
        if (lehrangebotBean == null) {
            logger.info("Lade LehrangebotFacadeLocal!");
            try {
                lehrangebotBean = LehrangebotFacadeUtil.getLocalHome().create();
            } catch (CreateException e) {
                e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
            } catch (NamingException e) {
                e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
            }
        }
        return lehrangebotBean;
    }

    /**
     * Singleton Instance
     */
    private static KlausurFacadeLocal klausurBean;

    /**
     * @return
     */
    public static KlausurFacadeLocal getKlausurFacade() {
        if (klausurBean == null) {
            logger.info("Lade KlausurFacadeLocal!");
            try {
                klausurBean = KlausurFacadeUtil.getLocalHome().create();
            } catch (CreateException e) {
                e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
            } catch (NamingException e) {
                e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
            }
        }
        return klausurBean;
    }

    /**
     * Singleton Instance
     */
    private static DokumentFacadeLocal dokumentBean;

    /**
     * @return
     */
    public static DokumentFacadeLocal getDokumentFacade() {
        if (dokumentBean == null) {
            logger.info("Lade DokumentFacadeLocal!");
            try {
                dokumentBean = DokumentFacadeUtil.getLocalHome().create();
            } catch (CreateException e) {
                e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
            } catch (NamingException e) {
                e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
            }
        }
        return dokumentBean;
    }

    /**
     * Singleton Instance
     */
    private static AbschlussarbeitFacadeLocal abschlussarbeitBean;

    /**
     * @return
     */
    public static AbschlussarbeitFacadeLocal getAbschlussarbeitFacade() {
        if (abschlussarbeitBean == null) {
            logger.info("Lade AbschlussarbeitFacadeLocal!");
            try {
                abschlussarbeitBean = AbschlussarbeitFacadeUtil.getLocalHome().create();
            } catch (CreateException e) {
                e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
            } catch (NamingException e) {
                e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
            }
        }
        return abschlussarbeitBean;
    }
}
