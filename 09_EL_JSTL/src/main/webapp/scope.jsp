<%--
  Created by IntelliJ IDEA.
  User: lmy
  Date: 2022/3/29
  Time: 17:04
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
  pageContext.setAttribute("key1","pageContext1");
  pageContext.setAttribute("key2","pageContext2");
  request.setAttribute("key2","request");
  session.setAttribute("key2","session");
  application.setAttribute("key2","application");
%>
${pageScope.key2}<br>
${requestScope.key2}<br>
${sessionScope.key2}<br>
${applicationScope.key2}<br>
</body>
</html>
