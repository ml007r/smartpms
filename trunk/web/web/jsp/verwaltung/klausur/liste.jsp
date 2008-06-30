<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic" %>

<h1><bean:message bundle="smartPMS" key="klausuren_verwaltung"/></h1>

<h2><bean:message bundle="smartPMS" key="klausuren_liste"/></h2>
<table id="klausuren">
    <tr>
        <th><bean:message bundle="smartPMS" key="klausur_lehrangebot"/></th>
        <th><bean:message bundle="smartPMS" key="klausur_beginn"/></th>
        <th><bean:message bundle="smartPMS" key="klausur_ende"/></th>
        <th><bean:message bundle="smartPMS" key="klausur_ects"/></th>
        <th><bean:message bundle="smartPMS" key="klausur_mindest_ects"/></th>
        <th><bean:message bundle="smartPMS" key="klausur_anzahl_teilnahmen"/></th>
        <th><bean:message bundle="smartPMS" key="tabelle_aktion"/></th>
    </tr>
    <logic:iterate id="klausur" name="klausurListeForm" property="klausuren">
        <tr>
            <td><bean:write name="klausur" property="lehrangebot.bezeichnung"/></td>
            <td><bean:write name="klausur" property="beginn"/></td>
            <td><bean:write name="klausur" property="ende"/></td>
            <td><bean:write name="klausur" property="ects"/></td>
            <td><bean:write name="klausur" property="mindestEcts"/></td>
            <td><bean:write name="klausur" property="anzahlTeilnahmen"/></td>
            <td>
                <html:link action="/verwaltung/klausur/Schreiben" titleKey="klausur_schreiben">
                    <html:param name="klausur.id" value="id"/>
                    S
                </html:link>
            </td>
        </tr>
    </logic:iterate>
</table>
</div>