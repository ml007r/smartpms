<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>


<h1><bean:message bundle="smartPMS" key="administration"/></h1>
<ul>
    <li>
        <html:link action="/verwaltung/person/Anzeigen" bundle="smartPMS" titleKey="personen_verwaltung">
            <bean:message bundle="smartPMS" key="personen_verwaltung" />
        </html:link>
    </li>
    <li>
        <html:link action="/verwaltung/teilnahme/Anlegen" bundle="smartPMS" titleKey="teilnahme_anlegen">
            <bean:message bundle="smartPMS" key="teilnahme_anlegen" />
        </html:link>
    </li>
    <li>...</li>
</ul>

