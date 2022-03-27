<%@ page import="by.kolbasov.entity.Cameras" %>
<%@ page import="java.util.List" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"
         isELIgnored="false"
%>
<html>
<head>

    <title>Camera_details</title>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="../css/styleCam_details.css">
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
</head>


<body>
<button onclick="history.back();" class="back"> ←Назад </button>
<div id="itemImg">
    <img src="${cam.url}" alt="camera">
</div>
<div id="itemInfo">
    <h1 id="nameItem">${cam.cam_name}</h1>
    <p id="priceItem">${cam.cost}</p>
    <button id="buyButton" class="bold">Приобрести</button>
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

</body>
</html>