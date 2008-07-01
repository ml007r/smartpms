<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic" %>

<h1></h1>
<div>
    <html:form action="/dokument/Speichern" enctype="multipart/form-data">
        <div class="feld">
            <label for="dateianhang"><bean:message key="dokument_neu" bundle="smartPMS"/></label>
            <html:file name="lehrangebotForm" property="dokument"/>
        </div>
        <div>
            <html:link href="javascript:document.forms[1].submit();">
                <html:param name="lehrangebot.id" value="lehrangebotForm.lehrangebot.id"/>
                <bean:message bundle="smartPMS" key="dokument_hochladen"/>
            </html:link>
        </div>
    </html:form>
</div>