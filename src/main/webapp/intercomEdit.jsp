<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"
         isELIgnored="false"
%>
<html>
<head>
    <title>EditIntercom</title>

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
    <form class="form" action="/VideoPerimeter_war/intercoms/${intercom.id}/edit" method="post">
        <input type="text" name="name" placeholder="${intercom.name}" class="form-control"><br>
        <input type="text" name="url" placeholder="${intercom.url}" class="form-control"><br>
        <input type="number" name="cost" placeholder="${intercom.cost}" class="form-control"><br>
        <input type="text" name="resolution" placeholder="${intercom.resolution}" class="form-control"><br>
        <input type="text" name="compression" placeholder="${intercom.compression}" class="form-control"><br>
        <input type="text" name="viewing_angle" placeholder="${intercom.viewing_angle}" class="form-control"><br>
        <input type="text" name="sd" placeholder="${intercom.sd}" class="form-control"><br>
        <input type="text" name="power_supply" placeholder="${intercom.power_supply}" class="form-control"><br>

        <button type="sumbit" class="btn btn-success">Обновить</button>
    </form>
</div>
</body>
</html>
