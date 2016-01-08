<%--<%@ taglib prefix="fmt" uri="http://java.sun.com/jstl/fmt" %>--%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="jst" uri="http://java.sun.com/jsp/jstl/sql" %>
<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8" language="java" %>

<html>
<head>
    <title>Форма ввода данных</title>
</head>
<body>
<FORM action="/FormRequest" method=POST>
    <br>Введите данные:

    <br>Фамилия
    <br><INPUT type="text" name="Фамилия" value=" ">
    <br>Имя
    <br><INPUT type="text" name="Имя" value=" ">
    <br>Возраст
    <br><INPUT type="text" name="Ваш возраст" value=" ">

    </H3>
    <H3>Сегодня:
        <%java.text.DateFormat df = new java.text.SimpleDateFormat("yyyy-MM-dd"); %>
        <%= df.format(new java.util.Date()) %>

    </H3>
    <INPUT type="submit" value="Показать товары">
</FORM>

</body>
</html>