<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic" %>

<html:form action="/abschlussarbeit/Speichern">
    <html:hidden name="abschlussarbeitForm" property="id"/>
    <div class="buttonBar" id="">
        <html:submit titleKey="abschlussarbeit_speichern"/>
    </div>
    <div id="formular">
        <h1><bean:message key="abschlussarbeit"/></h1>

        <div>
            <label for="typ"><bean:message key="abschlussarbeit_typ"/></label>
            <html:select name="abschlussarbeitForm" property="typ" styleId="typ">
                <html:option value="0" key="bitte_auswaehlen"/>
                <html:option value="1" key="abschlussarbeit_typ_1"/>
                <html:option value="2" key="abschlussarbeit_typ_2"/>
                <html:option value="3" key="abschlussarbeit_typ_3"/>
            </html:select>
        </div>
        <div class="feld">
            <label for="student"><bean:message key="abschlussarbeit_student"/></label>
            <html:select name="abschlussarbeitForm" property="student" styleId="student">
                <html:option value="0" key="bitte_auswaehlen"/>
                <html:optionsCollection name="abschlussarbeitForm" property="studenten" value="id" label="name"/>
            </html:select>
        </div>
        <div>
            <label for="thema"><bean:message key="abschlussarbeit_thema"/></label>
            <html:text name="abschlussarbeitForm" property="thema" styleId="thema"/>
        </div>
        <div>
            <label for="beschreibung"><bean:message key="abschlussarbeit_beschreibung"/></label>
            <html:text name="abschlussarbeitForm" property="beschreibung" styleId="beschreibung"/>
        </div>
        <div>
            <label for="etcs"><bean:message key="abschlussarbeit_etc"/></label>
            <html:text name="abschlussarbeitForm" property="etcs" styleId="etcs"/>
        </div>
        <div>
            <label for="abgabetermin"><bean:message key="abschlussarbeit_abgabetermin"/></label>
            <html:text name="abschlussarbeitForm" property="abgabetermin" styleId="abgabetermin"/>
        </div>
    </div>
</html:form>