<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic" %>

<div class="buttonBar" id="">
    <html:link action="/lehrangebot/Anlegen" titleKey="lehrangebot_anlegen">
        <bean:message key="lehrangebot_anlegen"/>
    </html:link>
</div>
<div id="">
    <h1><bean:message key="lehrangebot_verwaltung"/></h1>
    <table id="lehrangebot">
        <tr>
            <th><bean:message key="lehrangebot_code"/></th>
            <th><bean:message key="lehrangebot_bezeichnung"/></th>
            <th><bean:message key="tabelle_aktion"/></th>
        </tr>
        <logic:iterate id="lehrangebot" name="lehrangebotListeForm" property="lehrangebot">
            <tr>
                <td><bean:write name="lehrangebot" property="code"/></td>
                <td><bean:write name="lehrangebot" property="bezeichnung"/></td>
                <td>
                    <html:link action="/lehrangebot/Bearbeiten" titleKey="lehrangebot_bearbeiten">
                        <html:param name="id">
                            <bean:write name="lehrangebot" property="id"/>
                        </html:param>
                    </html:link>
                    <html:link action="/lehrangebot/Entfernen" titleKey="lehrangebot_entfernen">
                        <html:param name="id">
                            <bean:write name="lehrangebot" property="id"/>
                        </html:param>
                    </html:link>
                </td>
            </tr>
        </logic:iterate>
    </table>
</div>
