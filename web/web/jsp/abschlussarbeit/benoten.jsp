<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic" %>

<html:form action="/abschlussarbeit/Benoten">
    <html:hidden name="abschlussarbeitForm" property="id"/>
    <div class="buttonBar" id="">
        <html:submit titleKey="abschlussarbeit_speichern"/>
    </div>
    <div id="formular">
        <h1><bean:message bundle="smartPMS" key="abschlussarbeit"/></h1>

        <div>
            <label for="typ"><bean:message bundle="smartPMS" key="abschlussarbeit_typ"/></label>
            <bean:write name="abschlussarbeitForm" property="typ"/>
            <html:hidden name="abschlussarbeitForm" property="typ"/>
        </div>
        <div class="feld">
            <label for="student"><bean:message bundle="smartPMS" key="abschlussarbeit_student"/></label>
            <bean:write name="abschlussarbeitForm" property="student"/>
            <html:hidden name="abschlussarbeitForm" property="student"/>
        </div>
        <div>
            <label for="thema"><bean:message bundle="smartPMS" key="abschlussarbeit_thema"/></label>
            <bean:write name="abschlussarbeitForm" property="thema"/>
            <html:hidden name="abschlussarbeitForm" property="thema"/>
        </div>
        <div>
            <label for="beschreibung"><bean:message bundle="smartPMS" key="abschlussarbeit_beschreibung"/></label>
            <bean:write name="abschlussarbeitForm" property="beschreibung"/>
            <html:hidden name="abschlussarbeitForm" property="beschreibung"/>
        </div>
        <div>
            <label for="etcs"><bean:message bundle="smartPMS" key="abschlussarbeit_etcs"/></label>
            <bean:write name="abschlussarbeitForm" property="ects"/>
            <html:hidden name="abschlussarbeitForm" property="etcs"/>
        </div>
        <div>
            <label for="abgabetermin"><bean:message bundle="smartPMS" key="abschlussarbeit_abgabetermin"/></label>
            <bean:write name="abschlussarbeitForm" property="abgabetermin" format="dd.mm.yyyy"/>
            <html:hidden name="abschlussarbeitForm" property="abgabetermin"/>
        </div>
        <div>
            <label for="note"><bean:message bundle="smartPMS" key="abschlussarbeit_note"/></label>
            <html:text name="abschlussarbeitForm" property="note" styleId="note"/>
        </div>
    </div>
</html:form>