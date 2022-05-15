<%--
  Created by IntelliJ IDEA.
  User: lmy
  Date: 2022/3/29
  Time: 13:55
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    //往四个域中都保存了相同的key的数据
    pageContext.setAttribute("key","pageContext");
    request.setAttribute("key","request");
    session.setAttribute("key","session");
    application.setAttribute("key","application");
%>
${key}
</body>
</html>
