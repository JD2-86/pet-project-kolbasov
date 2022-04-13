<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"
         isELIgnored="false"
%>
<html>
<head>
    <title>AddCamera</title>
    <link rel="stylesheet" href="css/addGoodsStyle.css">
</head>
<style>
    body {
        background:#808080;
    }
</style>


<body>
<%@ include file="/header.jsp"%>
<%@ include file="/adminHeader.jsp"%>
<%@ include file="/headerGoods.jsp"%>

<div class="container mt-5">
    <h1 class="title"> Добавление Камеры</h1>
    <form class="form" action="/VideoPerimeter_war/addCamera" method="post">
        <input type="text" name="name" placeholder="Введите название камеры" class="form-control"><br>
        <input type="text" name="url" placeholder="Введите url фото" class="form-control"><br>
        <input type="number" name="cost" placeholder="Введите Цену" class="form-control"><br>
        <input type="text" name="matrix" placeholder="Введите модель матрицы" class="form-control"><br>
        <input type="text" name="sensitivity" placeholder="Введите чувствиетльность камеры" class="form-control"><br>
        <input type="text" name="viewing_angle" placeholder="Введите угол обзора" class="form-control"><br>
        <input type="text" name="resolution" placeholder="Введите разрешение" class="form-control"><br>

        <button type="sumbit" class="btn btn-success">Добавить товар</button>
    </form>
</div>
</body>
</html>
