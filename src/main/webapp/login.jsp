<html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"
         isELIgnored="false"
%>
<head>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-+0n0xVW2eSR5OomGNYDnhzAbDsOXxcvSN1TPprVMTNDbiYZCxYbOOl7+AMvyTG2x" crossorigin="anonymous">
    <title>LogIn</title>
    <link rel="stylesheet" href="css/styleReg.css">
</head>
<body>
<form action="/VideoPerimeter_war/login" method="post">

    <div align="center">
        <div class ="sing-in">
            <div class="form-container">
                <div class="form-content">
                    <h2 class="form-title">Log on</h2>
                    <input placeholder="Login" type="text" name="username" class="form-control" required/>
                    <span class="text-danger"></span>
                    <input placeholder="Password" type="password" name="password" class="form-control" required/>
                </div>
                <div><button id="signUpButton" type="submit" class="form-btn btn btn-primary btn-block">Sing In</button></div>
                <label class="text-secondary mt-2 form-label"><span class="align-middle">Or </span>
                    <a href="/VideoPerimeter_war/registration" class="p-0 btn btn-link">Sign up now!</a>
                </label>
                <div>
                </div>
            </div>
        </div >
    </div >



</form>
</body>
</html>
