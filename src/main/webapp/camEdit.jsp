<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"
         isELIgnored="false"
%>
<html>
<head>
    <title>camEdit</title>
    <link rel="stylesheet" href="css/addGoodsStyle.css">
</head>
<style>
    body {
        background:#808080;
    }
    <%@include file="/css/addGoodsStyle.css"%>
    <%@include file="/css/header.css"%>
</style>


<body>
<%@ include file="/header.jsp"%>


<div class="container mt-5">
    <form class="form" action="/VideoPerimeter_war/cameras/${cam.id}/edit"  method="post">
        <input type="text" name="name" placeholder="${cam.name}" class="form-control"><br>
        <input type="text" name="url" placeholder="${cam.url}" class="form-control"><br>
        <input type="number" name="cost" placeholder="${cam.cost}" class="form-control"><br>
        <input type="text" name="matrix" placeholder="${cam.matrix}" class="form-control"><br>
        <input type="text" name="sensitivity" placeholder="${cam.sensitivity}" class="form-control"><br>
        <input type="text" name="viewing_angle" placeholder="${cam.viewing_angle}" class="form-control"><br>
        <input type="text" name="resolution" placeholder="${cam.resolution}" class="form-control"><br>

        <button type="sumbit" class="btn btn-success">Обновить</button>
    </form>
</div>
</body>
</html>
