<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"
         isELIgnored="false"
%>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Cart</title>
    <script src="https://code.jquery.com/jquery-2.2.4.js" charset="utf-8"></script>
    <link rel="stylesheet" href="css/cartStyle.css">
    <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
</head>
<body>
<%@ include file="/header.jsp"%>
<div class="shopping-cart">
    <!-- Title -->
    <div class="title">
        Shopping Bag
    </div>
    <c:forEach var="cart" items="${cart}" >
    <form action="/VideoPerimeter_war/cart/${cart.id}/remove"method="post">
    <div class="item">

        <div class="buttons">
            <button class="delete-btn" type="submit" ></button>
        </div>
        <div class="image">
            <img src="${cart.camera.url}" alt="" />
        </div>

        <div class="description">
            <span>${cart.camera.name}</span>
        </div>

        <div class="quantity">
            <button class="plus-btn" type="button" name="button">
                <img src="https://designmodo.com/demo/shopping-cart/plus.svg" alt="" />
            </button>
            <input type="text" name="name" value="1">
            <button class="minus-btn" type="button" name="button">
                <img src="https://designmodo.com/demo/shopping-cart/minus.svg" alt="" />
            </button>
        </div>

        <div class="total-price">${cart.camera.cost}</div>
    </div>

    </form>
    </c:forEach>


</div>
<script type="text/javascript">
    $('.minus-btn').on('click', function(e) {
        e.preventDefault();
        var $this = $(this);
        var $input = $this.closest('div').find('input');
        var value = parseInt($input.val());

        if (value > 1) {
            value = value - 1;
        } else {
            value = 0;
        }

        $input.val(value);

    });

    $('.plus-btn').on('click', function(e) {
        e.preventDefault();
        var $this = $(this);
        var $input = $this.closest('div').find('input');
        var value = parseInt($input.val());

        if (value < 100) {
            value = value + 1;
        } else {
            value =100;
        }

        $input.val(value);
    });

    $('.like-btn').on('click', function() {
        $(this).toggleClass('is-active');
    });
</script>
</body>
</html>