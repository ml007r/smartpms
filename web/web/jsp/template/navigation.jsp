<%--
  Created by IntelliJ IDEA.
  User: tbs
  Date: 31.05.2008
  Time: 11:15:51
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html"%>
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean"%>

<div id="navigation">
    <ul>
        <li>
            <html:link action="/lehrangebot/Ansicht" />
            <a href="#">Lehrangebote verwalten</a>
            <ul>
                <li><a href="#">Neues Lehrangebot</a></li>
            </ul>
        </li>
        <li>
            <a href="#">Dokumente verwalten</a>
            <ul>
                <li><a href="#">Neues Dokument</a></li>
            </ul>
        </li>
        <li>
            <a href="#">Klausuren verwalten</a>
            <ul>
                <li><a href="#">Neue Klausur</a></li>
                <li><a href="#">Klausur benoten</a></li>
            </ul>
        </li>
        <li>
            <a href="#">Abschlussarbeiten verwalten</a>
            <ul>
                <li><a href="#">Abschlussarbeit eintragen</a></li>
                <li><a href="#">Abschlussarbeit bewerten</a></li>
            </ul>
        </li>
        <li><a href="#">Statistische Auswertung</a></li>
        <li>
            <a href="#">HilfskrŠfte verwalten</a>
            <ul>
                <li><a href="#">Hilfskraft einstellen</a></li>
            </ul>
        </li>
    </ul>
</div>