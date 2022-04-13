<%@ page import="by.kolbasov.entity.User" %>
<%@ page import="org.springframework.beans.factory.annotation.Autowired" %>
<%@ page import="by.kolbasov.service.UserService" %>
<%@ page import="org.springframework.security.core.context.SecurityContextHolder" %>
<html xmlns="http://www.w3.org/1999/xhtml">
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"
         isELIgnored="false"
%>
<head >
    <meta charset="UTF-8">
    <title>CameKol</title>
    <link rel="stylesheet" href="css/header.css">
    <link rel="preconnect" href="https://fonts.gstatic.com">
    <link href="https://fonts.googleapis.com/css2?family=Dela+Gothic+One&family=Oswald:wght@300&display=swap" rel="stylesheet">
    <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
</head>
<body>

<header>

    <nav id="navHeader">
        <ul>

            <li class="default-header-menu-item"><a class="p-2 text-white" href="/VideoPerimeter_war/orders">ЗАКАЗЫ ЗАПИСЕЙ</a></li>
            <li class="default-header-menu-item"><a class="p-2 text-white" href="/VideoPerimeter_war/goodsOrders">ЗАКАЗЫ ТОВАРОВ</a></li>
            <li class="default-header-menu-item"><a class="p-2 text-white" href="/VideoPerimeter_war/addCamera">ДОБАВИТЬ ТОВАР</a></li>
        </ul>

    </nav>
</header>


</body>
</html>