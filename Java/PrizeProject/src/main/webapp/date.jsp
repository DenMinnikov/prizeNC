<%@ page import="javax.management.Attribute" %><%--
  Created by IntelliJ IDEA.
  User: serberus
  Date: 21.12.15
  Time: 23:14
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%--<FORM action="DateOut1" method="post">--%>

<br><%= request.getAttribute("dateNow")%>

<%--<%= request.setAttribute("age", );%>--%>

<br><%= request.getAttribute("dateResult")%>


<%--</FORM>--%>
</body>
</html>
