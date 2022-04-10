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
    <form class="form" action="/VideoPerimeter_war/addIntercom" method="post">
        <input type="text" name="name" placeholder="Введите название домофона" class="form-control"><br>
        <input type="text" name="url" placeholder="Введите url фото" class="form-control"><br>
        <input type="number" name="cost" placeholder="Введите цену" class="form-control"><br>
        <input type="text" name="resolution" placeholder="Введите разрешение" class="form-control"><br>
        <input type="text" name="compression" placeholder="Введите формат сжатия" class="form-control"><br>
        <input type="text" name="viewing_angle" placeholder="Введите угол обзора" class="form-control"><br>
        <input type="text" name="sd" placeholder="Поддержка SD" class="form-control"><br>
        <input type="text" name="power_supply" placeholder="Введите источник питание" class="form-control"><br>

        <button type="sumbit" class="btn btn-success">Добавить товар</button>
    </form>
</div>
</body>
</html>
