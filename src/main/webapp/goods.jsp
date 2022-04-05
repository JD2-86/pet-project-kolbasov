<%@ page import="by.kolbasov.entity.goods.Camera" %>
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

        <c:forEach var="goods" items="${goods}" >
        <div  class="catalogItem">
            <img src="${goods.url}" alt="camera"/>
            <p class="catalogItemName bold">${goods.name}</p>
            <div class="buy">
                <p class="catalogItemPrice">${goods.cost}</p>

                <button class="buyButton bold"><a href="${url}/${goods.id}">Details</a></button>
            </div>
        </div>
        </c:forEach>
    </div>



</body>
</html>