<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"
         isELIgnored="false"
%>
<html>
<head>
    <title>RegistratorEdit</title>
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
    <form class="form" action="/VideoPerimeter_war/registrator/${registrator.id}/edit" method="post">
        <input type="text" name="name" placeholder="${registrator.name}" class="form-control"><br>
        <input type="text" name="url" placeholder="${registrator.url}" class="form-control"><br>
        <input type="number" name="cost" placeholder="${registrator.cost}" class="form-control"><br>
        <input type="text" name="power_supply" placeholder="${registrator.power_supply}" class="form-control"><br>
        <input type="text" name="power_consumption" placeholder="${registrator.power_consumption}" class="form-control"><br>
        <input type="text" name="dimensions" placeholder="${registrator.dimensions}" class="form-control"><br>
        <input type="text" name="weight" placeholder="${registrator.weight}" class="form-control"><br>

        <button type="sumbit" class="btn btn-success">Обновить</button>
    </form>
</div>
</body>
</html>
