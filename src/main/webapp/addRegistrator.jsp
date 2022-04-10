<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"
         isELIgnored="false"
%>
<html>
<head>
    <title>AddGoods</title>
    <link rel="stylesheet" href="css/addGoodsStyle.css">
</head>
<style>
    body {
        background:#808080;
    }
</style>


<body>
<%@ include file="/header.jsp"%>
<%@ include file="/headerGoods.jsp"%>
<div class="container mt-5">
    <form class="form" action="/VideoPerimeter_war/addRegistrator" method="post">
        <input type="text" name="name" placeholder="Введите название регистратора" class="form-control"><br>
        <input type="text" name="url" placeholder="Введите url фото" class="form-control"><br>
        <input type="number" name="cost" placeholder="Введите цену" class="form-control"><br>
        <input type="text" name="power_supply" placeholder="Введите источник питания" class="form-control"><br>
        <input type="text" name="power_consumption" placeholder="Введите потребляемую мощность" class="form-control"><br>
        <input type="text" name="dimensions" placeholder="Введите размеры" class="form-control"><br>
        <input type="text" name="weight" placeholder="Введите вес" class="form-control"><br>

        <button type="sumbit" class="btn btn-success">Добавить товар</button>
    </form>
</div>
</body>
</html>
