<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic" %>

<h1><bean:message bundle="smartPMS" key="dokumente"/></h1>

<div id="formular">
    <h2><bean:message bundle="smartPMS" key="dokument_neu"/></h2>
    <html:form action="/dokument/Speichern" enctype="multipart/form-data">
        <div class="feld">
            <label for="dateianhang"><bean:message key="dokument_auswaehlen" bundle="smartPMS"/></label>
            <html:file name="dokumentForm" property="dokument"/>
        </div>
        <div>
            <html:link href="javascript:document.forms[0].submit();">
                <html:param name="lehrangebot.id" value="dokumentForm.lehrangebot.id"/>
                <bean:message bundle="smartPMS" key="dokument_hochladen"/>
            </html:link>
        </div>
    </html:form>
</div>
<hr/>
<div id="dokumente">
    <h2><bean:message bundle="smartPMS" key="vorhandene_dokumente"/></h2>
</div>