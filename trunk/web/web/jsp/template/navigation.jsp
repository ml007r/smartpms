<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>

<ul>
    <li>
        <html:link action="/lehrangebot/Ansicht" titleKey="menu_lehrangebot">
            <bean:message bundle="smartPMS" key="menu_lehrangebot"/>
        </html:link>
    </li>
    <li>
        <html:link action="/dokument/Ansicht" titleKey="menu_dokument">
            <bean:message bundle="smartPMS" key="menu_dokument"/>
        </html:link>
    </li>
    <li>
        <html:link action="/klausur/Ansicht" titleKey="menu_klausur">
            <bean:message bundle="smartPMS" key="menu_klausur"/>
        </html:link>
    </li>
    <li>
        <html:link action="/abschlussarbeit/Ansicht" titleKey="menu_abschlussarbeit"
                   onclick="alert('Diese Funktion steht im ShowCase nicht zur Verfügung!'); return false;">
            <bean:message bundle="smartPMS" key="menu_abschlussarbeit"/>
        </html:link>
    </li>
    <li>
        <html:link action="/statistik/Ansicht" titleKey="menu_statistik"
                   onclick="alert('Diese Funktion steht im ShowCase nicht zur Verfügung!'); return false;">
            <bean:message bundle="smartPMS" key="menu_statistik"/>
        </html:link>
    </li>
    <li>
        <html:link action="/hilfskraft/Ansicht" titleKey="menu_hilfskraft"
                   onclick="alert('Diese Funktion steht im ShowCase nicht zur Verfügung!'); return false;">
            <bean:message bundle="smartPMS" key="menu_hilfskraft"/>
        </html:link>
    </li>
    <li>
        <html:link action="/verwaltung/Anzeigen" titleKey="menu_verwaltung"
                   onclick="alert('Diese Funktion ist nur im ShowCase verfügbar!');">
            <bean:message bundle="smartPMS" key="menu_verwaltung"/>
        </html:link>
    </li>
</ul>
