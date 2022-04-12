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
<form action="/VideoPerimeter_war/intercoms/${intercom.id}" method="post" class="registrator-form">
    <div id="itemImg">
        <img src="${intercom.url}" alt="camera">

        <div id="itemInfo">
            <h1 id="nameItem">${intercom.name}</h1>
            <p id="priceItem">${intercom.cost}</p>
            <button id="buyButton" class="bold">Приобрести</button>
            <p class="bold">
                Характеристика:
            </p>
            <ul id="complect">
                <li>Разрешение:${intercom.resolution}</li>
                <li>Формат сжатия видео:${intercom.compression}</li>
                <li>Источник питания:${intercom.power_supply}</li>
                <li>Поддержка SD:${intercom.sd}</li>
                <li>Угол обзора:${intercom.viewing_angle}</li>
            </ul>
        </div>
    </div>
</form>

</body>
</html>