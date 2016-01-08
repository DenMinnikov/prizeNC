<%@ page import="java.util.Iterator" %>
<%@ page import="java.util.List" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>title</title>
</head>
<body>

<% List data= (List)request.getAttribute("data");

%>
<tr><td align="center"><%=data%></td></tr>

</body>
</html>
