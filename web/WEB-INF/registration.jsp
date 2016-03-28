<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <title>Login</title>
    <link rel="stylesheet" href="css/main.css"/>
</head>
<body>
<div class = "header">
    <div class="headername">
        <h1>Slow News</h1>
    </div>
    <div>
        <ul class="headermenu">
            <li><a href="lastnews">News feed</a></li>
            <li><a href="archivenews">Archive</a></li>
            <li><a href="login">Login</a></li>
            <li><a href="registration">Registration</a></li>
        </ul>
    </div>
</div>
<div class="contentwrap">
    <div class="contentheader">
        <h4>Registration user</h4>
        <hr/>
    </div>
    <div class="contentfeed">
        <p>Enter your data:</p>
        <form name="loginform" method="GET">
            <label>First Name:</label>
            <div>
                <input name="firstName" type="text"/>
            </div>
            <label>Last Name:</label>
            <div>
                <input name="lastName" type="text">
            </div>
            <label>E-Mail:</label>
            <div>
                <input name="login" type="email"/>
            </div>
            <label>Password:</label>
            <div>
                <input name="passwd" type="password">
            </div>
            <label>Confirm password:</label>
            <div>
                <input name="passwd" type="password">
            </div>
            <p/>
            <input value="Submit" id="btnSubmit" type="submit">
        </form>
    </div>
</div>
<div class="footer">
    Slow News project 2016
</div>
</body>
</html>
