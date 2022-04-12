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
<form action="/VideoPerimeter_war/registrators/${registrator.id}" method="post" class="registrator-form">
    <div id="itemImg">
        <img src="${registrator.url}" alt="camera">

        <div id="itemInfo">
            <h1 id="nameItem">${registrator.name}</h1>
            <p id="priceItem">${registrator.cost}</p>
            <button id="buyButton" class="bold">Приобрести</button>
            <p class="bold">
                Характеристика:
            </p>
            <ul id="complect">
                <li>Источник питания:${registrator.power_supply}</li>
                <li>Потребляемая мощность:${registrator.power_consumption}</li>
                <li>Размеры:${registrator.dimensions}</li>
                <li>Вес:${registrator.weight}</li>
            </ul>
        </div>
    </div>
</form>

</body>
</html>