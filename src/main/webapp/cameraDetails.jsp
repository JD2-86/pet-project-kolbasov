<%@ page import="by.kolbasov.entity.Camera" %>
<%@ page import="java.util.List" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"
         isELIgnored="false"
%>
<html>
<head>
    <title>GoodsDetails</title>
    <link rel="stylesheet" href="css/detailsStyle.css">
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
</head>
<style>
    <%@include file="/css/detailsStyle.css"%>
</style>

<body>
<button onclick="history.back();" class="back"> ←Назад</button>
<form action="/VideoPerimeter_war/cameras/${cam.id}" method="post" class="registrator-form">
    <div id="itemImg">
        <img src="${cam.url}" alt="camera">

    <div id="itemInfo">
        <h1 id="nameItem">${cam.name}</h1>
        <p id="priceItem">${cam.cost}</p>
        <button id="buyButton" class="bold">В корзину</button>
        <p class="bold">
            Характеристика:
        </p>
        <ul id="complect">
            <li>Матрица:${cam.matrix}</li>
            <li>Разрешение:${cam.resolution}</li>
            <li>Чувствительность:${cam.sensitivity}</li>
            <li>Угол обзора:${cam.viewing_angle}</li>
        </ul>
    </div>
    </div>
</form>

</body>
</html>