<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic" %>

<html:form action="/verwaltung/person/Speichern">
    <html:hidden name="personForm" property="id"/>
    <div class="buttonBar" id="">
        <html:submit titleKey="person_speichern"/>
    </div>
    <div id="formular">
        <h1><bean:message bundle="smartPMS" key="person"/></h1>

        <div>
            <label for="typ"><bean:message bundle="smartPMS" key="person_typ"/></label>
            <html:select name="personForm" property="typ" styleId="typ">
                <html:option value="0" bundle="smartPMS" key="bitte_auswaehlen"/>
                <html:option value="1" bundle="smartPMS" key="person_typ_1"/>
                <html:option value="2" bundle="smartPMS" key="person_typ_2"/>
                <html:option value="3" bundle="smartPMS" key="person_typ_3"/>
                <html:option value="4" bundle="smartPMS" key="person_typ_4"/>
            </html:select>
        </div>
        <div class="feld">
            <label for="anrede"><bean:message bundle="smartPMS" key="person_anrede"/></label>
            <html:select name="personForm" property="anrede" styleId="anrede">
                <html:option value="Herr" bundle="smartPMS" key="person_anrede_1"/>
                <html:option value="Frau" bundle="smartPMS" key="person_anrede_2"/>
            </html:select>
        </div>
        <div>
            <label for="titel"><bean:message bundle="smartPMS" key="person_titel"/></label>
            <html:text name="personForm" property="titel" styleId="titel"/>
        </div>
        <div>
            <label for="vorname"><bean:message bundle="smartPMS" key="person_vorname"/></label>
            <html:text name="personForm" property="vorname" styleId="vorname"/>
        </div>
        <div>
            <label for="nachname"><bean:message bundle="smartPMS" key="person_nachname"/></label>
            <html:text name="personForm" property="nachname" styleId="nachname"/>
        </div>
        <div>
            <label for="anschrift1"><bean:message bundle="smartPMS" key="person_anschrift1"/></label>
            <html:text name="personForm" property="anschrift1" styleId="anschrift1"/>
        </div>
        <div>
            <label for="anschrift2"><bean:message bundle="smartPMS" key="person_anschrift2"/></label>
            <html:text name="personForm" property="anschrift2" styleId="anschrift2"/>
        </div>
        <div>
            <label for="postleitzahl"><bean:message bundle="smartPMS" key="person_postleitzahl"/></label>
            <html:text name="personForm" property="postleitzahl" styleId="postleitzahl"/>
        </div>
        <div>
            <label for="wohnort"><bean:message bundle="smartPMS" key="person_wohnort"/></label>
            <html:text name="personForm" property="wohnort" styleId="wohnort"/>
        </div>
        <div>
            <label for="telefon"><bean:message bundle="smartPMS" key="person_telefon"/></label>
            <html:text name="personForm" property="telefon" styleId="telefon"/>
        </div>
        <div>
            <label for="telefax"><bean:message bundle="smartPMS" key="person_telefax"/></label>
            <html:text name="personForm" property="telefax" styleId="telefax"/>
        </div>
        <div>
            <label for="mobiltelefon"><bean:message bundle="smartPMS" key="person_mobiltelefon"/></label>
            <html:text name="personForm" property="mobiltelefon" styleId="mobiltelefon"/>
        </div>
        <div>
            <label for="email"><bean:message bundle="smartPMS" key="person_email"/></label>
            <html:text name="personForm" property="email" styleId="email"/>
        </div>
        <div>
            <label for="geburtsdatum"><bean:message bundle="smartPMS" key="person_geburtsdatum"/></label>
            <html:text name="personForm" property="geburtsdatumString" styleId="geburtsdatum"/>
        </div>
        <div>
            <label for="matrikel"><bean:message bundle="smartPMS" key="person_matrikel"/></label>
            <html:text name="personForm" property="matrikel" styleId="matrikel"/>
        </div>
        <div>
            <label for="studiengang"><bean:message bundle="smartPMS" key="person_studiengang"/></label>
            <html:text name="personForm" property="studiengang" styleId="studiengang"/>
        </div>
        <div>
            <label for="buero"><bean:message bundle="smartPMS" key="person_buero"/></label>
            <html:text name="personForm" property="buero" styleId="buero"/>
        </div>
    </div>
</html:form>



