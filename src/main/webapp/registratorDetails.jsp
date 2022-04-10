<%@ page import="by.kolbasov.entity.goods.Camera" %>
<%@ page import="java.util.List" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"
         isELIgnored="false"
%>
<html>
<head>
    <title>GoodsDetails</title>
    <link rel="stylesheet" href="css/detailsStyle.css">
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
</head>
<style>

    *
    {
        box-sizing: border-box;
    }
    body{
        display: flex;
        width: 100%;
        margin: 0;
        font-family: -apple-system, BlinkMacSystemFont, 'Segoe UI', Roboto, Oxygen, Ubuntu, Cantarell, 'Open Sans', 'Helvetica Neue', sans-serif;
        font-weight: 100;
    }
.registrator-form {
    margin: 0 auto;
}
    #itemImg{
        display: flex;
        justify-content: space-around;
        width: 100%;
    }

    #itemImg img{
        width: 350px;
        transition: 1.5s;
    }

    #itemImg img:hover{
        cursor: zoom-in;
        transform: scale(1.1);
    }

    #itemInfo{
        display: flex;
        flex-direction: column;
        align-items: baseline;
        width: 50%;
        padding-top: 100px;
        padding-left: 10px;
        padding-right: 80px;
        padding-bottom: 50px;
    }

    #buyButton{
        width: 110px;
        height: 40px;
        background-color: black;
        color: white;
        font-size: 13px;
        border-radius: 5px;
        border: 0;
        transition: 1s;
    }

    #buyButton:hover{
        cursor: pointer;
        transform: scale(1.1);
    }

    #buyButton:active{
        transform: scale(0.5);
    }

    #priceItemOld{
        text-decoration: line-through;
        color: gray;
        font-size: 18px;
        opacity: 0.7;
    }

    #priceItem{
        font-size: 18px;
    }

    .bold{
        font-weight: 600;
    }
    .back{
        background-color: unset;
        border: none;
        position: absolute;
        left: 20px;
        top: 20px;
    }

    @media screen and (max-width: 750px){
        body{
            flex-direction: column;
        }

        #itemInfo, #itemImg{
            width: 100%;
        }

        #itemInfo{
            padding-left: 50px;
            padding-top: 30px;
            padding-bottom: 50px;
        }

        #itemImg{
            padding-top: 50px;
        }

        #itemImg img{
            width: 300px;
        }


    }

</style>

<body>
<button onclick="history.back();" class="back"> ←Назад</button>
<form action="/VideoPerimeter_war/registrators/${registrator.id}" method="post" class="registrator-form">
    <div id="itemImg">
        <img src="${registrator.url}" alt="camera">

        <div id="itemInfo">
            <h1 id="nameItem">${registrator.name}</h1>
            <p id="priceItem">${registrator.cost}</p>
            <button id="buyButton" class="bold">Приобрести</button>
            <p class="bold">
                Характеристика:
            </p>
            <ul id="complect">
                <li>Источник питания:${registrator.power_supply}</li>
                <li>Потребляемая мощность:${registrator.power_consumption}</li>
                <li>Размеры:${registrator.dimensions}</li>
                <li>Вес:${registrator.weight}</li>
            </ul>
        </div>
    </div>
</form>

</body>
</html>