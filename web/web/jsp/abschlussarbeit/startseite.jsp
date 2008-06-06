<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>

<div class="buttonBar" id="">
    <html:link action="/abschlussarbeit/Anlegen" titleKey="abschlussarbeit_anlegen">
        <bean:message key="abschlussarbeit_anlegen"/>
    </html:link>
</div>
<div id="">
    <h1><bean:message key="abschlussarbeit_verwaltung"/></h1>
    <table id="abschlussarbeit">
        <tr>
            <th><bean:message key="abschlussarbeit_typ"/></th>
            <th><bean:message key="abschlussarbeit_student"/></th>
            <th><bean:message key="abschlussarbeit_thema"/></th>
            <th><bean:message key="abschlussarbeit_note"/></th>
            <th><bean:message key="abschlussarbeit_abgabetermin"/></th>
            <th><bean:message key="tabelle_aktion"/></th>
        </tr>
        <logic:iterate id="abschlussarbeit" name="abschlussarbeitListeForm" property="abschlussarbeiten">
            <tr>
                <td><bean:write name="abschlussarbeit" property="typ"/></td>
                <td><bean:write name="abschlussarbeit" property="student"/></td>
                <td><bean:write name="abschlussarbeit" property="thema"/></td>
                <td><bean:write name="abschlussarbeit" property="note"/></td>
                <td><bean:write name="abschlussarbeit" property="abgabetermin"/></td>
                <td>
                    <html:link action="/abschlussarbeit/Bearbeiten" titleKey="abschlussarbeit_bearbeiten">
                        <html:param name="id" value="abschlussarbeit.id"/>
                    </html:link>
                    <html:link action="/abschlussarbeit/Entfernen" titleKey="abschlussarbeit_entfernen">
                        <html:param name="id" value="abschlussarbeit.id"/>
                    </html:link>
                </td>
            </tr>
        </logic:iterate>
    </table>
</div>