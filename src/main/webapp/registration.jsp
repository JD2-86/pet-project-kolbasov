<html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"
         isELIgnored="false"
%>
<head>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-+0n0xVW2eSR5OomGNYDnhzAbDsOXxcvSN1TPprVMTNDbiYZCxYbOOl7+AMvyTG2x" crossorigin="anonymous">
    <title>Title</title>
    <link rel="stylesheet" href="css/styleReg.css">
</head>
<body>
<form action="/VideoPerimeter-1.0-SNAPSHOT/registration" method="post">

    <div align="center">
        <div class ="sing-in">
            <div class="form-container">
                <div class="form-content">
                    <h2 class="form-title">Registration</h2>
                    <input placeholder="Username" type="text" name="username" class="form-control" required/>
                    <span class="text-danger"></span>
                    <input placeholder="Password" type="password" name="password" class="form-control" required/>
                    <input placeholder="Firstname" type="text" name="firstname" class="form-control" required/>
                    <input placeholder="Lastname" type="text" name="lastname" class="form-control" required/>
                    <input placeholder="Email" type="text" name="email" class="form-control" required/>
                </div>
                <div><button id="signUpButton" type="submit" class="form-btn btn btn-primary btn-block" disabled>Registration</button></div>
                <div>
                </div>
            </div>
        </div >
    </div >



</form>
<script>

    function checkInputs(inputs){
        let counter = 0
        for(let input of inputs){
            if(input.value)
                counter++
        }
        if(counter === 5){
            return true
        } else{
            return false
        }
    }

    let signUpButton = document.querySelector("#signUpButton")
    signUpButton.addEventListener("click", () => {
        alert("Вы зарегестрировались!")

    })

    let inputsEvent = document.querySelectorAll(".form-content input")

    console.log(signUpButton)



    for(let inputEvent of inputsEvent){
        inputEvent.addEventListener("input", () => {
            if(checkInputs(inputsEvent)){
                signUpButton.disabled = false
            } else{
                signUpButton.disabled = true
            }
        })
    }

</script>
</body>
</html>