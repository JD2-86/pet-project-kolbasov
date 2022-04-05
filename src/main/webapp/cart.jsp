<!DOCTYPE html>
<html lang="en">
<head>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="css/cartStyle.css">

    <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
    <title>Document</title>
</head>
<body>
<%@ include file="/header.jsp"%>
    <div class="main-title">
        <h1>Корзина</h1>
    </div>

    <div class="wrapper">
        <c:forEach var="cart" items="${cart}" >
        <div class="goods">
            <div class="description">
                <img class="img" src="${cart.camera.url}" alt="Picture">
                <div>
                    <div class="title">
                        <h2>${cart.camera.name}</h2>
                    </div>
                </div>
            </div>
           
            <div class="sum">
                <p>${cart.camera.cost}</p>
            </div>
            </c:forEach>
        </div>
    </div>
</body>
</html>