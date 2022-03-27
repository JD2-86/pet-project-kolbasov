<%@ page import="by.kolbasov.entity.Cameras" %>
<%@ page import="java.util.List" %>
<html xmlns="http://www.w3.org/1999/xhtml"
xmlns:th="http://www.thymeleaf.org" >
<head>

    <title>Cameras</title>
    <link rel="stylesheet" href="css/styleCam.css">
    <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>



</head>

<body>
<%@ include file="/header.jsp"%>

<div  id="catalog">

        <c:forEach var="cam" items="${cam}" >
        <div  class="catalogItem">
            <img src="${cam.url}" alt="camera"/>
            <p class="catalogItemName bold">${cam.cam_name}</p>
            <div class="buy">
                <p class="catalogItemPrice">${cam.cost}</p>

                <button class="buyButton bold"><a href="cameras/${cam.cam_id}">Details</a></button>
            </div>
        </div>
        </c:forEach>
    </div>



</body>
</html>