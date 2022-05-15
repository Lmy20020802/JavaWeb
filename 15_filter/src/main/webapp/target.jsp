<%--
  Created by IntelliJ IDEA.
  User: lmy
  Date: 2022/4/3
  Time: 08:51
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    System.out.println("target.jsp页面打开了");
    System.out.println("target.jsp线程"+Thread.currentThread().getName());
    System.out.println("target.jsp:"+request.getParameter("username"));
%>
</body>
</html>
