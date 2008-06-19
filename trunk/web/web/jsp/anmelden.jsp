<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>

<html:form action="/Anmelden">
    <h1><bean:message bundle="smartPMS" key="h1_anmelden"/></h1>

    <div class="feld">
        <label for="benutzername"><bean:message bundle="smartPMS" key="label_benutzername"/></label>
        <html:text name="loginForm" property="benutzername" styleId="benutzername"/>
    </div>
    <div class="feld">
        <label for="passwort"><bean:message bundle="smartPMS" key="label_passwort"/></label>
        <html:password name="loginForm" property="passwort" styleId="passwort"/>
    </div>
    <div class="feld">
        <html:submit value="Go!"/>
    </div>
</html:form>