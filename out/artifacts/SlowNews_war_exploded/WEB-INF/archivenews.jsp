<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <title>Archive News</title>
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
        <h4>News feed</h4>
        <hr/>

    </div>
    <div class="contentfeed">
        <ul class="content">
            <c:forEach var="news" items="${newslist}">
                <li>
                    <img src="${news.image}">
                    <a href="#">${news.header}</a><br/>
                    <span><c:out value="${news.date}"></c:out></span>
                </li>
            </c:forEach>
        </ul>
    </div>
</div>
<div class="footer">
    Slow News project 2016
</div>
</body>
</html>
