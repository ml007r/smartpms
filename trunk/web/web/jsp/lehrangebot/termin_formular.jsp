<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic" %>

<h1><bean:message bundle="smartPMS" key="termin"/></h1>

<div id="formular">
    <h2><bean:message bundle="smartPMS" key="termin_anlegen"/></h2>
    <html:form action="/termin/Speichern">
        <html:hidden name="terminForm" property="termin.id"/>
        <html:hidden name="terminForm" property="termin.lehrangebotId"/>
        <div class="feld">
            <label for="wochentag"><bean:message bundle="smartPMS" key="termin_wochentag"/></label>
            <html:select name="terminForm" property="termin.wochentag" styleId="wochentag">
                <html:option value="0" bundle="smartPMS" key="wochentag_montag"></html:option>
                <html:option value="1" bundle="smartPMS" key="wochentag_dienstag"></html:option>
                <html:option value="2" bundle="smartPMS" key="wochentag_mittwoch"></html:option>
                <html:option value="3" bundle="smartPMS" key="wochentag_donnerstag"></html:option>
                <html:option value="4" bundle="smartPMS" key="wochentag_freitag"></html:option>
                <html:option value="5" bundle="smartPMS" key="wochentag_samstag"></html:option>
                <html:option value="6" bundle="smartPMS" key="wochentag_sonntag"></html:option>
            </html:select>
        </div>
        <div class="feld">
            <label for="typ"><bean:message bundle="smartPMS" key="termin_typ"/></label>
            <html:select name="terminForm" property="termin.typ" styleId="typ">
                <html:option value="0" bundle="smartPMS" key="typ_vorlesung"></html:option>
                <html:option value="1" bundle="smartPMS" key="typ_uebung"></html:option>
                <html:option value="2" bundle="smartPMS" key="typ_praktikum"></html:option>
                <html:option value="3" bundle="smartPMS" key="typ_tutorium"></html:option>
            </html:select>
        </div>
        <div class="feld">
            <label for="beginn"><bean:message bundle="smartPMS" key="termin_beginn"/></label>
            <html:text name="terminForm" property="beginnString" styleId="beginn"/>
        </div>
        <div class="feld">
            <label for="ende"><bean:message bundle="smartPMS" key="termin_ende"/></label>
            <html:text name="terminForm" property="endeString" styleId="ende"/>
        </div>
        <div class="feld">
            <label for="raum"><bean:message bundle="smartPMS" key="termin_raum"/></label>
            <html:text name="terminForm" property="termin.raum" styleId="raum"/>
        </div>
        <div>
            <html:submit titleKey="termin_speichern" bundle="smartPMS" value="Speichern"/>
        </div>
    </html:form>
</div>