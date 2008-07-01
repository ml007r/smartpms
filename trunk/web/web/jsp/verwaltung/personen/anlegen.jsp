<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic" %>

<script type="text/javascript">
    function showSpecialFields(val) {
        switch (val) {
            case '1':
                showField("matrikelFeld", true);
                showField("studiengangFeld", true);
                showField("semesterFeld", true);
                showField("titelFeld", false);
                showField("bueroFeld", false);
                showField("fachgebiet", false);
                showField("wochenstundenFeld", false);
                showField("stundensatzFeld", false);
                break;

            case '2':
                showField("matrikelFeld", true);
                showField("studiengangFeld", true);
                showField("semesterFeld", true);
                showField("titelFeld", false);
                showField("bueroFeld", false);
                showField("fachgebietFeld", false);
                showField("wochenstundenFeld", true);
                showField("stundensatzFeld", true);
                break;

            case '3':
                showField("matrikelFeld", false);
                showField("studiengangFeld", false);
                showField("semesterFeld", false);
                showField("titelFeld", true);
                showField("bueroFeld", true);
                showField("fachgebietFeld", false);
                showField("wochenstundenFeld", false);
                showField("stundensatzFeld", false);
                break;

            case '4':
                showField("matrikelFeld", false);
                showField("studiengangFeld", false);
                showField("semesterFeld", false);
                showField("titelFeld", true);
                showField("bueroFeld", true);
                showField("fachgebietFeld", true);
                showField("wochenstundenFeld", false);
                showField("stundensatzFeld", false);
                break;
            default:
        }
    }

    function showField(name, flag) {
        document.getElementById(name).style.display = flag == true ? "" : "none";
    }
</script>

<html:form action="/verwaltung/person/Speichern">
<html:hidden name="personForm" property="id"/>
<div class="buttonBar" id="">
    <html:submit titleKey="person_speichern" bundle="smartPMS"/>
</div>
<div id="formular">
    <h1><bean:message bundle="smartPMS" key="person"/></h1>

    <div class="feld">
        <label for="typ"><bean:message bundle="smartPMS" key="person_typ"/></label>
        <html:select name="personForm" property="typ" styleId="typ" onchange="showSpecialFields(this.value);">
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
    <div class="feld" id="titelFeld" style="display:none;">
        <label for="titel"><bean:message bundle="smartPMS" key="person_titel"/></label>
        <html:text name="personForm" property="titel" styleId="titel"/>
    </div>
    <div class="feld">
        <label for="vorname"><bean:message bundle="smartPMS" key="person_vorname"/></label>
        <html:text name="personForm" property="vorname" styleId="vorname"/>
    </div>
    <div class="feld">
        <label for="nachname"><bean:message bundle="smartPMS" key="person_nachname"/></label>
        <html:text name="personForm" property="nachname" styleId="nachname"/>
    </div>
    <div class="feld">
        <label for="anschrift1"><bean:message bundle="smartPMS" key="person_anschrift1"/></label>
        <html:text name="personForm" property="anschrift1" styleId="anschrift1"/>
    </div>
    <div class="feld">
        <label for="anschrift2"><bean:message bundle="smartPMS" key="person_anschrift2"/></label>
        <html:text name="personForm" property="anschrift2" styleId="anschrift2"/>
    </div>
    <div class="feld">
        <label for="postleitzahl"><bean:message bundle="smartPMS" key="person_postleitzahl"/></label>
        <html:text name="personForm" property="postleitzahl" styleId="postleitzahl"/>
    </div>
    <div class="feld">
        <label for="wohnort"><bean:message bundle="smartPMS" key="person_wohnort"/></label>
        <html:text name="personForm" property="wohnort" styleId="wohnort"/>
    </div>
    <div class="feld">
        <label for="telefon"><bean:message bundle="smartPMS" key="person_telefon"/></label>
        <html:text name="personForm" property="telefon" styleId="telefon"/>
    </div>
    <div class="feld">
        <label for="telefax"><bean:message bundle="smartPMS" key="person_telefax"/></label>
        <html:text name="personForm" property="telefax" styleId="telefax"/>
    </div>
    <div class="feld">
        <label for="mobiltelefon"><bean:message bundle="smartPMS" key="person_mobiltelefon"/></label>
        <html:text name="personForm" property="mobiltelefon" styleId="mobiltelefon"/>
    </div>
    <div class="feld">
        <label for="email"><bean:message bundle="smartPMS" key="person_email"/></label>
        <html:text name="personForm" property="email" styleId="email"/>
    </div>
    <div class="feld">
        <label for="geburtsdatum"><bean:message bundle="smartPMS" key="person_geburtsdatum"/></label>
        <html:text name="personForm" property="geburtsdatumString" styleId="geburtsdatum"/>
    </div>
    <div class="feld" id="matrikelFeld" style="display:none;">
        <label for="matrikel"><bean:message bundle="smartPMS" key="person_matrikel"/></label>
        <html:text name="personForm" property="matrikel" styleId="matrikel"/>
    </div>
    <div class="feld" id="studiengangFeld" style="display:none;">
        <label for="studiengang"><bean:message bundle="smartPMS" key="person_studiengang"/></label>
        <html:text name="personForm" property="studiengang" styleId="studiengang"/>
    </div>
    <div class="feld" id="semesterFeld" style="display:none;">
        <label for="studiengang"><bean:message bundle="smartPMS" key="person_studiengang"/></label>
        <html:text name="personForm" property="studiengang" styleId="studiengang"/>
    </div>
    <div class="feld" id="bueroFeld" style="display:none;">
        <label for="buero"><bean:message bundle="smartPMS" key="person_buero"/></label>
        <html:text name="personForm" property="buero" styleId="buero"/>
    </div>
    <div class="feld" id="fachgebietFeld" style="display:none;">
        <label for="fachgebiet"><bean:message bundle="smartPMS" key="person_fachgebiet"/></label>
        <html:text name="personForm" property="fachgebiet" styleId="fachgebiet"/>
    </div>
    <div class="feld" id="passwortFeld" style="display:none;">
        <label for="passwortFeld"><bean:message bundle="smartPMS" key="person_passwort"/></label>
        <html:password name="personForm" property="passwort" styleId="passwort"/>
    </div>
    <div class="feld" id="wochenstundenFeld" style="display:none;">
        <label for="wochenstunden"><bean:message bundle="smartPMS" key="person_wochenstunden"/></label>
        <html:text name="personForm" property="wochenstunden" styleId="wochenstunden"/>
    </div>
    <div class="feld" id="stundensatzFeld" style="display:none;">
        <label for="stundensatz"><bean:message bundle="smartPMS" key="person_stundensatz"/></label>
        <html:text name="personForm" property="stundensatz" styleId="stundensatz"/>
    </div>
</div>
</html:form>



