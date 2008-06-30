<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>


<html:form action="/verwaltung/teilnahme/Speichern">
    <div class="buttonBar" id="">
        <html:submit titleKey="teilname_speichern" bundle="smartPMS"/>
    </div>
    <div id="formular">
        <h1><bean:message bundle="smartPMS" key="teilnahme_anlegen"/></h1>

        <div>
            <label for="klausur"><bean:message bundle="smartPMS" key="teilnahme_klausur"/></label>
            <html:select name="teilnahmeForm" property="teilnahme.klausurId" styleId="klausurId">
                <html:option value="0" bundle="smartPMS" key="bitte_auswaehlen"/>
                <html:optionsCollection name="teilnameForm" property="klausuren" label="lehrangebot.bezeichnung"
                                        value="id"/>
            </html:select>
        </div>
        <div>
            <label for="typ"><bean:message bundle="smartPMS" key="teilnahme_student"/></label>
            <html:select name="teilnahmeForm" property="teilnahme.studentId" styleId="studentId">
                <html:option value="0" bundle="smartPMS" key="bitte_auswaehlen"/>
                <html:optionsCollection name="teilnameForm" property="studenten" label="name" value="id"/>
            </html:select>
        </div>
    </div>
</html:form>