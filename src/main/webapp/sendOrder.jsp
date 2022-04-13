<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"
         isELIgnored="false"
%>
<html>
<head>
    <title>SendOrder</title>
    <link rel="stylesheet" href="css/addGoodsStyle.css">
</head>
<style>
    body {
        background:#808080;
    }
</style>


<body>
<%@ include file="/header.jsp"%>
<div class="container mt-5">
    <form class="form" action="/VideoPerimeter_war/sendOrder" method="post">
        <input type="text" name="address" placeholder="Введите ваш адрес" class="form-control"><br>
        <input type="text" name="num" placeholder="Введите ваш номер телефона" class="form-control"><br>
        <input type="text" name="period" placeholder="Введите дату и время за нужный период" class="form-control"><br>
        <textarea  name="description" placeholder="Дополнительная информация(Ф.И.О. если не зарегистрированы)" class="form-control"></textarea><br>

        <button type="sumbit" class="btn btn-success">Заказать запись</button>
    </form>
</div>
</body>
</html>
