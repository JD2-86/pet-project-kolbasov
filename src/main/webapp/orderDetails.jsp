<%@ page import="by.kolbasov.entity.Camera" %>
<%@ page import="java.util.List" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"
         isELIgnored="false"
%>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
    <link rel="stylesheet" href="./style.css">
</head>
<style>
    <%@include file="/css/orderDetaisStyle.css"%>
</style>
<body>
<div class="wrapper">
    <div class="user-name">
        <p><span>Имя: </span>${order.user.firstname}</p>
    </div>
    <div class="address">
        <p><span>Адрес:</span>${order.address}</p>
    </div>
    <div class="data">
        <p><span>Дата: </span>${order.period}</p>
    </div>
    <div class="number">
        <p><span>Номер: </span>${order.num}</p>
    </div>

    <div class="add-info">
        <p><span>Дополнительная информация: </span>${order.description}</p>
    </div>
</div>
</body>
</html>

