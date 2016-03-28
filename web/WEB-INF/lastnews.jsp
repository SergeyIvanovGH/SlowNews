<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8">
        <title>Last News</title>
        <link rel="stylesheet" href="css/main.css"/>
    </head>
    <body>
        <%@include file="header.jspf" %>

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

        <%@include file="footer.jspf" %>

    </body>
</html>
