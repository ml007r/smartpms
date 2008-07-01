<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic" %>

<h1><bean:message bundle="smartPMS" key="lehrangebot"/></h1>

<div id="formular">
    <h2><bean:message bundle="smartPMS" key="lehrangebot_basisdaten"/></h2>
    <html:form action="/lehrangebot/Speichern">
        <html:hidden name="lehrangebotForm" property="lehrangebot.id"/>
        <html:hidden name="lehrangebotForm" property="lehrangebot.dozentId"/>

        <div class="feld">
            <label for="code"><bean:message bundle="smartPMS" key="lehrangebot_code"/></label>
            <html:text name="lehrangebotForm" property="lehrangebot.nummer" styleId="code"/>
        </div>
        <div class="feld">
            <label for="bezeichnung"><bean:message bundle="smartPMS" key="lehrangebot_bezeichnung"/></label>
            <html:text name="lehrangebotForm" property="lehrangebot.bezeichnung" styleId="bezeichnung"/>
        </div>
        <div>
            <html:submit titleKey="lehrangebot_speichern" bundle="smartPMS" value="Speichern"/>
        </div>
    </html:form>
</div>

<logic:greaterThan value="0" name="lehrangebotForm" property="lehrangebot.id">
    <hr/>
    <div>
        <h2><bean:message bundle="smartPMS" key="lehrangebot_dokumente"/></h2>

        <div>
            <html:link action="/dokument/Anlegen">
                <html:param name="dokument.lehrangebotId" value="${lehrangebotForm.lehrangebot.id}" />
                <bean:message key="dokument_neu" bundle="smartPMS"/>
            </html:link>
        </div>
        <table>
            <colgroup>
                <col width="50%"/>
                <col width="25%"/>
                <col width="15%"/>
                <col width="10%"/>
            </colgroup>
            <tr>
                <th><bean:message bundle="smartPMS" key="dokument_name"/></th>
                <th><bean:message bundle="smartPMS" key="dokument_datum"/></th>
                <th><bean:message bundle="smartPMS" key="dokument_version"/></th>
                <th><bean:message bundle="smartPMS" key="tabelle_aktion"/></th>
            </tr>
            <logic:iterate id="dokument" name="lehrangebotForm" property="dokumente">
                <tr>
                    <th><bean:write name="dokument" property="name"/></th>
                    <th><bean:write name="dokument" property="datum" format="dd.MM.yyyy"/></th>
                    <th><bean:write name="dokument" property="version"/></th>
                    <th>A D</th>
                </tr>
            </logic:iterate>
        </table>
    </div>
    <hr/>
    <div>
        <h2><bean:message bundle="smartPMS" key="lehrangebot_termine"/></h2>

        <div>
            <html:link action="/termin/Anlegen">
                <html:param name="termin.lehrangebotId" value="${lehrangebotForm.lehrangebot.id}" />
                <bean:message key="termin_neu" bundle="smartPMS"/>
            </html:link>
        </div>
        <table>
            <colgroup>
                <col width="25%"/>
                <col width="15%"/>
                <col width="15%"/>
                <col width="10%"/>
                <col width="25%"/>
                <col width="10%"/>
            </colgroup>
            <tr>
                <th><bean:message bundle="smartPMS" key="termin_wochentag"/></th>
                <th><bean:message bundle="smartPMS" key="termin_beginn"/></th>
                <th><bean:message bundle="smartPMS" key="termin_ende"/></th>
                <th><bean:message bundle="smartPMS" key="termin_raum"/></th>
                <th><bean:message bundle="smartPMS" key="termin_typ"/></th>
                <th><bean:message bundle="smartPMS" key="tabelle_aktion"/></th>
            </tr>
            <logic:iterate id="termin" name="lehrangebotForm" property="termine">
                <tr>
                    <td><bean:write name="termin" property="wochentagText"/></td>
                    <td><bean:write name="termin" property="beginn" format="hh:mm"/></td>
                    <td><bean:write name="termin" property="ende" format="hh:mm"/></td>
                    <td><bean:write name="termin" property="raum"/></td>
                    <td><bean:write name="termin" property="typText"/></td>
                    <td>A D</td>
                </tr>
            </logic:iterate>
        </table>
    </div>
</logic:greaterThan>