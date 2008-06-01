<%--
  Created by IntelliJ IDEA.
  User: tbs
  Date: 31.05.2008
  Time: 11:09:56
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://struts.apache.org/tags-tiles" prefix="tiles" %>
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html"%>

<html>
<head>
    <title><bean:message key="page_title_default"/> :: <tiles:getAsString name="title"/></title>
    <link type="text/css" rel="stylesheet" href="/css/smartPMS.css" />
</head>
<body>
<div id="wrapper">
    <div id="header">
        <tiles:insert attribute="header"/>
    </div>
    <div id="menu">
        <tiles:insert attribute="menu" />
    </div>
    <div id="messages">
        <html:errors />
        </div>
    <div id="content">
        <tiles:insert attribute="content"/>
    </div>
    <div id="footer">
        <tiles:insert attribute="footer"/>
    </div>
</div>
</body>
</html>
