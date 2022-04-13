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
    <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
</head>
<style>
    <%@include file="/css/orderDetaisStyle.css"%>
    <%@include file="/css/cartStyle.css"%>
</style>
<body>
<div class="wrapper">
    <div class="user-name">
        <p><span>Имя: </span>${cart.user.firstname}</p>
    </div>
    <div class="address">
        <p><span>Номер:</span>${cart.user.number}</p>
    </div>
    <div class="shopping-cart">

        <div class="title">
            Shopping Bag
        </div>
        <c:if test="${cart.camera !=null}">
            <c:forEach var="camera" items="${cart.camera}">

                <form action="/VideoPerimeter_war/cart/${camera.id}/removeCamera" method="post">
                    <div class="item">

                        <div class="image">
                            <img src="${camera.url}" alt=""/>
                        </div>

                        <div class="description">
                            <span>${camera.name}</span>
                        </div>


                        <div class="total-price">${camera.cost}</div>
                    </div>
                </form>
            </c:forEach>
        </c:if>
        <c:if test="${cart.registrator!=null}">
            <c:forEach var="registrator" items="${cart.registrator}">
                <form action="/VideoPerimeter_war/cart/${registrator.id}/removeRegistrator" method="post">
                    <div class="item">

                        <div class="image">
                            <img src="${registrator.url}" alt=""/>
                        </div>

                        <div class="description">
                            <span>${registrator.name}</span>
                        </div>


                        <div class="total-price">${registrator.cost}</div>
                    </div>
                </form>
            </c:forEach>
        </c:if>

        <c:if test="${cart.intercom!=null}">
            <c:forEach var="intercom" items="${cart.intercom}">
                <form action="/VideoPerimeter_war/cart/${intercom.id}/removeIntercom" method="post">
                    <div class="item">

                        <div class="image">
                            <img src="${intercom.url}" alt=""/>
                        </div>

                        <div class="description">
                            <span>${intercom.name}</span>
                        </div>


                        <div class="total-price">${intercom.cost}</div>
                    </div>
                </form>
            </c:forEach>
        </c:if>

    </div>

</div>
</body>
</html>

