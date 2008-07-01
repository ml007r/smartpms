<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://struts.apache.org/tags-tiles" prefix="tiles" %>
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
<html:xhtml/>
<html>
<head>
    <title><bean:message bundle="smartPMS" key="page_title_default"/> :: <tiles:getAsString name="title"/></title>
    <link type="text/css" rel="stylesheet" href="/css/smartPMS.css"/>
    <link type="text/css" rel="stylesheet" href="/css/menu.css"/>
    <script type="text/javascript" src="/js/smartpms.js"></script>
</head>
<body>
<div id="blocker" onclick="return false;"></div>
<img id="progressbar" src="/image/progressbar.gif" alt="Anfrage wird bearbeitet" />
<center>
    <div id="wrapper">
        <div id="header">
            <tiles:insert attribute="header"/>
        </div>
        <div id="menu">
            <tiles:insert attribute="menu"/>
        </div>
        <div id="messages">
            <html:errors bundle="smartPMS"/>
        </div>
        <div id="content">
            <tiles:insert attribute="content"/>
        </div>
        <div id="footer">
            <tiles:insert attribute="footer"/>
        </div>
    </div>
</center>
</body>
</html>

