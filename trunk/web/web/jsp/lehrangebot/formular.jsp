<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic" %>

<html:form action="/lehrangebot/Speichern">
    <html:hidden name="lehrangebotForm" property="id"/>
    <div class="buttonBar" id="">
        <html:submit titleKey="lehrangebot_speichern"/>
    </div>
    <div id="formular">
        <h1><bean:message key="lehrangebot"/></h1>

        <div class="feld">
            <label for="code"><bean:write name="lehrangebot" property="code"/></label>
            <html:text name="lehrangebotForm" property="code" styleId="code"/>
        </div>
        <div>
            <label for="bezeichnung"><bean:write name="lehrangebot" property="bezeichnung"/></label>
            <html:text name="lehrangebotForm" property="code" styleId="bezeichnung"/>
        </div>
    </div>
</html:form>