<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>


<h1><bean:message bundle="smartPMS" key="administration"/></h1>
<ul>
    <li><html:link action="/verwaltung/person/Anzeigen" titleKey="personen_verwaltung"/></li>
    <li><html:link action="/verwaltung/teilnahme/Anlegen" titleKey="teilnahme_anlegen"/></li>

    <li>...</li>
</ul>

