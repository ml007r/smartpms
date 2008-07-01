<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic" %>

<div class="buttonBar" id="">
    <html:link action="/lehrangebot/Anlegen" titleKey="lehrangebot_anlegen">
        <bean:message bundle="smartPMS" key="lehrangebot_anlegen"/>
    </html:link>
</div>
<div id="">
    <h1><bean:message bundle="smartPMS" key="lehrangebot_verwaltung"/></h1>
    <table id="lehrangebot">
        <tr>
            <th><bean:message bundle="smartPMS" key="lehrangebot_code"/></th>
            <th><bean:message bundle="smartPMS" key="lehrangebot_bezeichnung"/></th>
            <th><bean:message bundle="smartPMS" key="tabelle_aktion"/></th>
        </tr>
        <% int i = 0; %>
        <logic:iterate id="lehrangebot" name="lehrangebotListeForm" property="lehrangebote">
            <tr class="<%= i++ % 2 == 0 ? "odd" : "edge" %>">
                <td><bean:write name="lehrangebot" property="nummer"/></td>
                <td><bean:write name="lehrangebot" property="bezeichnung"/></td>
                <td class="action">
                    <html:link action="/lehrangebot/Bearbeiten" titleKey="lehrangebot_bearbeiten">
                        <html:param name="lehrangebot.id" value="${lehrangebot.id}"/>
                        <html:img src="/image/icons/letter-2-16.png" border="0" bundle="smartPMS"
                                  altKey="lehrangebot_bearbeiten"/>
                    </html:link>
                    <html:link action="/lehrangebot/Entfernen" titleKey="lehrangebot_entfernen">
                        <html:param name="lehrangebot.id" value="${lehrangebot.id}"/>
                        <html:img src="/image/icons/letter-4-16.png" border="0" bundle="smartPMS"
                                  altKey="lehrangebot_entfernen"/>
                    </html:link>
                </td>
            </tr>
        </logic:iterate>
    </table>
</div>
