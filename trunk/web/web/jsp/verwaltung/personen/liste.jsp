<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>

<div class="buttonBar" id="">
    <html:link action="/verwaltung/person/Anlegen" titleKey="person_anlegen">
        <bean:message bundle="smartPMS" key="person_anlegen"/>
    </html:link>
</div>
<div id="">
    <h1><bean:message bundle="smartPMS" key="personen_verwaltung"/></h1>

    <h2><bean:message bundle="smartPMS" key="personen_liste_student"/></h2>
    <table id="studenten">
        <tr>
            <th><bean:message bundle="smartPMS" key="student_matrikel"/></th>
            <th><bean:message bundle="smartPMS" key="student_name"/></th>
            <th><bean:message bundle="smartPMS" key="student_email"/></th>
            <th><bean:message bundle="smartPMS" key="student_studiengang"/></th>
            <th><bean:message bundle="smartPMS" key="student_wohnort"/></th>
            <th><bean:message bundle="smartPMS" key="tabelle_aktion"/></th>
        </tr>
        <logic:iterate id="student" name="personListeForm" property="studenten">
            <tr>
                <td><bean:write name="student" property="matrikelnummer"/></td>
                <td><bean:write name="student" property="vorname"/> <bean:write name="student"
                                                                                property="nachname"/></td>
                <td><bean:write name="student" property="email"/></td>
                <td><bean:write name="student" property="studiengang"/></td>
                <td><bean:write name="student" property="wohnort"/></td>
                <td>
                    <html:link action="/abschlussarbeit/Bearbeiten" titleKey="student_bearbeiten">
                        <html:param name="id" value="student.id"/>
                        A
                    </html:link>
                    <html:link action="/abschlussarbeit/Entfernen" titleKey="student_entfernen">
                        <html:param name="id" value="student.id"/>
                        D
                    </html:link>
                </td>
            </tr>
        </logic:iterate>
    </table>

    <hr/>

    <h2><bean:message bundle="smartPMS" key="personen_liste_dozent"/></h2>
    <table id="dozenten">
        <tr>
            <th><bean:message bundle="smartPMS" key="dozent_name"/></th>
            <th><bean:message bundle="smartPMS" key="dozent_buero"/></th>
            <th><bean:message bundle="smartPMS" key="dozent_telefon"/></th>
            <th><bean:message bundle="smartPMS" key="dozent_telefax"/></th>
            <th><bean:message bundle="smartPMS" key="dozent_email"/></th>
            <th><bean:message bundle="smartPMS" key="tabelle_aktion"/></th>
        </tr>
        <logic:iterate id="dozent" name="personListeForm" property="dozenten">
            <tr>
                <td><bean:write name="dozent" property="titel"/> <bean:write name="dozent" property="vorname"/>
                    <bean:write name="dozent" property="nachname"/></td>
                <td><bean:write name="dozent" property="buero"/></td>
                <td><bean:write name="dozent" property="telefon"/></td>
                <td><bean:write name="dozent" property="telefax"/></td>
                <td><bean:write name="dozent" property="email"/></td>
                <td>
                    <html:link action="/abschlussarbeit/Bearbeiten" titleKey="dozent_bearbeiten">
                        <html:param name="id" value="dozent.id"/>
                        A
                    </html:link>
                    <html:link action="/abschlussarbeit/Entfernen" titleKey="dozent_entfernen">
                        <html:param name="id" value="dozent.id"/>
                        D
                    </html:link>
                </td>
            </tr>
        </logic:iterate>
    </table>
</div>