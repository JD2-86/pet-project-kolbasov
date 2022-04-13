<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"
         isELIgnored="false"
%>
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Order</title>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
</head>
<style>
    <%@include file="/css/ordersStyle.css"%>
</style>
<body>
<%@ include file="/header.jsp"%>
<%@ include file="adminHeader.jsp"%>
<c:forEach var="cart" items="${cart}">
    <div class="main">
        <div class="wrapper">
            <div class="description">
                <div class="user-name">
                    <p><span>Имя:</span> ${cart.user.firstname}</p>
                </div>
                <div class="button">
                    <button class="buyButton bold"><a href="${url}/${cart.id}">Details</a></button>
                </div>
            </div>
            <form action="/VideoPerimeter_war/${url}/${cart.id}/remove"method="post">
                <button class="delete-btn" type="submit" ></button>
            </form>
        </div>

    </div>
</c:forEach>

</body>
</html>

