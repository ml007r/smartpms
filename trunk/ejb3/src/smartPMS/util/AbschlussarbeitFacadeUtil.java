package smartPMS.util;

import smartPMS.interfaces.AbschlussarbeitFacadeHome;
import smartPMS.interfaces.AbschlussarbeitFacadeLocalHome;

import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.rmi.PortableRemoteObject;
import java.net.InetAddress;
import java.security.SecureRandom;
import java.util.Hashtable;

/**
 * Created by IntelliJ IDEA.
 * User: tbs
 * Date: 17.06.2008
 * Time: 12:15:07
 * To change this template use File | Settings | File Templates.
 */
public class AbschlussarbeitFacadeUtil {

    /**
     * @return
     * @throws javax.naming.NamingException
     */
    public static AbschlussarbeitFacadeHome getHome()
            throws NamingException {
        // Obtain initial context
        InitialContext initialContext = new InitialContext();
        try {
            Object objRef = initialContext.lookup(AbschlussarbeitFacadeHome.JNDI_NAME);
            return (AbschlussarbeitFacadeHome) PortableRemoteObject.narrow(objRef,
                    AbschlussarbeitFacadeHome.class);
        }
        finally {
            initialContext.close();
        }
    }

    /**
     * @param environment
     * @return
     * @throws javax.naming.NamingException
     */
    public static AbschlussarbeitFacadeHome getHome(Hashtable<?, ?> environment)
            throws NamingException {
        InitialContext initialContext = new InitialContext(environment);
        try {
            Object objRef = initialContext.lookup(AbschlussarbeitFacadeHome.JNDI_NAME);
            return (AbschlussarbeitFacadeHome) PortableRemoteObject.narrow(objRef,
                    AbschlussarbeitFacadeHome.class);
        }
        finally {
            initialContext.close();
        }
    }

    /**
     * @return
     * @throws javax.naming.NamingException
     */
    public static AbschlussarbeitFacadeLocalHome getLocalHome()
            throws NamingException {
        InitialContext initialContext = new InitialContext();
        try {
            return (AbschlussarbeitFacadeLocalHome) initialContext
                    .lookup(AbschlussarbeitFacadeLocalHome.JNDI_NAME);
        }
        finally {
            initialContext.close();
        }
    }


    private static String hexServerIP = null;

    private static final SecureRandom seeder = new SecureRandom();

    /**
     * @param o
     * @return
     */
    public static final String generateGUID(Object o) {
        StringBuffer tmpBuffer = new StringBuffer(16);
        if (hexServerIP == null) {
            InetAddress localInetAddress = null;
            try {

                localInetAddress = InetAddress.getLocalHost();
            }
            catch (java.net.UnknownHostException uhe) {
                return null;
            }
            byte serverIP[] = localInetAddress.getAddress();
            hexServerIP = hexFormat(getInt(serverIP), 8);
        }
        String hashcode = hexFormat(System.identityHashCode(o), 8);
        tmpBuffer.append(hexServerIP);
        tmpBuffer.append(hashcode);

        long timeNow = System.currentTimeMillis();
        int timeLow = (int) timeNow & 0xFFFFFFFF;
        int node = seeder.nextInt();

        StringBuffer guid = new StringBuffer(32);
        guid.append(hexFormat(timeLow, 8));
        guid.append(tmpBuffer.toString());
        guid.append(hexFormat(node, 8));
        return guid.toString();
    }

    private static int getInt(byte bytes[]) {
        int i = 0;
        int j = 24;
        for (int k = 0; j >= 0; k++) {
            int l = bytes[k] & 0xff;
            i += l << j;
            j -= 8;
        }
        return i;
    }

    private static String hexFormat(int i, int j) {
        String s = Integer.toHexString(i);
        return padHex(s, j) + s;
    }

    private static String padHex(String s, int i) {
        StringBuffer tmpBuffer = new StringBuffer();
        if (s.length() < i) {
            for (int j = 0; j < i - s.length(); j++) {
                tmpBuffer.append('0');
            }
        }
        return tmpBuffer.toString();
    }
}