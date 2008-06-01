<%--
  Created by IntelliJ IDEA.
  User: tbs
  Date: 31.05.2008
  Time: 11:36:57
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>

<html:form action="/Anmelden">
    <div style="">
        <h1><bean:message key="h1_anmelden"/></h1>

        <div class="feld">
            <label for="benutzername"><bean:message key="label_benutzername"/></label>
            <html:text name="loginForm" property="benutzername" styleId="benutzername"/>
        </div>
        <div class="feld">
            <label for="passwort"><bean:message key="label_passwort"/></label>
            <html:password name="loginForm" property="passwort" styleId="passwort"/>
        </div>
        <div style="text-align:right;">
            <html:submit titleKey="submit_anmelden"/>
        </div>
    </div>
</html:form>