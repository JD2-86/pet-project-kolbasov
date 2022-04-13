<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<!DOCTYPE html>

<html xmlns="http://www.w3.org/1999/xhtml">
<head>
    <meta charset="UTF-8">
    <title>CameKol</title>
    <link rel="stylesheet" href="css/style.css">
    <link rel="preconnect" href="https://fonts.gstatic.com">
    <link href="https://fonts.googleapis.com/css2?family=Dela+Gothic+One&family=Oswald:wght@300&display=swap" rel="stylesheet">

</head>
<body>

<%@ include file="/header.jsp"%>
    <c:if test="${user.role.name=='ADMIN'}">
    <%@ include file="adminHeader.jsp"%></div><br>
    </c:if>
<div id="banner">
    <div class="grayScreen">
    </div>
    <h1></h1>
</div>
<div id="words">
    <div id="slogan">
        СПОСОБСТВУЕМ ВАШЕЙ БЕЗОПАСНОСТИ
    </div>
</div>
<footer>

    <div id="copyright">
        <div id="name">
            © 2022, VideoPerimeter.com
        </div>
    </div>
</footer>


</body>
</html>