<%@ page import="java.util.List" %><%--
  Created by IntelliJ IDEA.
  User: serberus
  Date: 07.01.16
  Time: 14:19
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8" language="java" %>
<html>
<head>
    <title>Регистрация</title>
</head>
<body>
<form method="post" action="/start" >
    <b>Имя: </b> <input type="text" name="name" size="20"> <br><br>
    <b>Фамилия: </b> <input type="text" name="lastname" size="15"> <br><br>
    <b>Возраст: </b> <input type="text" name="age" size="15"> <br><br>
    <b>Сегодня:
        <%java.text.DateFormat df = new java.text.SimpleDateFormat("yyyy-MM-dd"); %>
        <%= df.format(new java.util.Date()) %>

    <br><br>
    <input type="submit" value = "Отправить">
</form>
</body>
</html>
