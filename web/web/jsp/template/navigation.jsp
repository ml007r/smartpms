<%--
  Created by IntelliJ IDEA.
  User: tbs
  Date: 31.05.2008
  Time: 11:15:51
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>

<div id="menu">
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
            <html:link action="/abschlussarbeit/Ansicht" titleKey="menu_abschlussarbeit">
                <bean:message bundle="smartPMS" key="menu_abschlussarbeit"/>
            </html:link>
        </li>
        <li>
            <html:link action="/statistik/Ansicht" titleKey="menu_statistik">
                <bean:message bundle="smartPMS" key="menu_statistik"/>
            </html:link>
        </li>
        <li>
            <html:link action="/hilfskraft/Ansicht" titleKey="menu_hilfskraft">
                <bean:message bundle="smartPMS" key="menu_hilfskraft"/>
            </html:link>
        </li>
        <li>
            <html:link action="/verwaltung/person/Anzeigen">
                <bean:message bundle="smartPMS" key="menu_verwaltung"/>
            </html:link>
        </li>
    </ul>
</div>