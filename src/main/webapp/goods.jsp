<%@ page import="by.kolbasov.entity.Camera" %>
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
            <form action="/VideoPerimeter_war/${url}/${goods.id}/remove"method="post">
            <div class="buttons">
                <button class="delete-btn" type="submit" ></button>
                <a class="edit-btn" href="/VideoPerimeter_war/${url}/${goods.id}/edit"><img src="https://img.icons8.com/material-sharp/24/000000/edit--v1.png"/></a>
            </div>
            <img src="${goods.url}" alt="camera"/>
            <p class="catalogItemName bold">${goods.name}</p>
            <div class="buy">
                <p class="catalogItemPrice">${goods.cost}</p>

                <button class="buyButton bold"><a href="${url}/${goods.id}">Details</a></button>
            </div>
            </form>
        </div>
        </c:forEach>
    </div>

<%--<c:if test="${goods.totalPage > 0}">--%>
<%--<ul class="pagination">--%>
<%--    <c:forEach var="numbers" items="${numbers}">--%>
<%--        <c:if test="${}"--%>



<%--    </c:forEach>--%>

<%--</ul>--%>
<%--</c:>--%>


</body>
</html>