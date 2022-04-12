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
    <div id="logo">
        <a href="/VideoPerimeter_war/">
            <div id="kolDiv">
                <div id="kol">
                    VIDEO.
                </div>
            </div>
            <div id="camDiv">
                <div id="cam">
                    PERIMETER
                </div>
            </div>
        </a>
    </div>
    <nav id="navHeader">
        <ul>
            <li class="default-header-menu-item"><a class="p-2 text-white" href="/VideoPerimeter_war/cameras">КАМЕРЫ</a></li>
            <li class="default-header-menu-item"><a class="p-2 text-white" href="/VideoPerimeter_war/registrators">ВИДЕОРЕГИСТРАТОРЫ</a></li>
            <li class="default-header-menu-item"><a class="p-2 text-white" href="/VideoPerimeter_war/intercoms">ДОМОФОНЫ</a></li>
            <li class="default-header-menu-item"><a class="p-2 text-white" href="/VideoPerimeter_war/sendOrder">ЗАПРОС ЗАПИСЕЙ</a></li>
            <li class="default-header-menu-item"><a class="p-2 text-white" href="/VideoPerimeter_war/contacts">КОНТАКТЫ</a></li>
            <li class="default-header-menu-item"><a class="p-2 text-white" href="/VideoPerimeter_war/addCamera">ДОБАВИТЬ ТОВАР</a></li>
            <a id="pay"  href="/VideoPerimeter_war/login"><img src="https://img.icons8.com/ios-glyphs/60/ffffff/test-account.png"/></a>
            <a id="pay1"  href="/VideoPerimeter_war/logout"><img class="logout" src="https://4.downloader.disk.yandex.ru/preview/6b5a3cf30a1854aaeaea0af4b6efe80a2c0e5cc592eb81a718c92bb6b41a2885/inf/X2LbHNuYtK08EULNJnoNikvHqsNKB-SGwdl4ZHnvRy6pCZ_plqZeFyH-1MkYlvHgBBF23T2_EeXNql6vssdzjw%3D%3D?uid=643950779&filename=icons8-%D0%B2%D1%8B%D1%85%D0%BE%D0%B4-60.png&disposition=inline&hash=&limit=0&content_type=image%2Fpng&owner_uid=643950779&tknv=v2&size=1903x880"/></a>
        </ul>

    </nav>
</header>


</body>
</html>