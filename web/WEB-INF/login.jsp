<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <title>Login</title>
    <link rel="stylesheet" href="css/main.css"/>
</head>
<body>

    <%@include file="header.jspf" %>

    <div class="contentwrap">
        <div class="contentheader">
            <h4>Login</h4>
            <hr/>
        </div>
        <div class="contentfeed">
            <p>Enter your registration data:</p>
            <form name="loginform" method="GET">
                <label for="login">E-Mail:</label>
                <div>
                    <input id="login" name="login" type="email"/>
                </div>
                <label for="passwd">Password:</label>
                <div>
                    <input id="passwd" name="passwd" type="password">
                </div>
                <p><input value="Submit" id="btnSubmit" type="submit"></p>
            </form>
        </div>
    </div>

    <%@include file="footer.jspf" %>

</body>
</html>
