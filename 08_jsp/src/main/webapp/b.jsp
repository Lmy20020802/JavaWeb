<%--
  Created by IntelliJ IDEA.
  User: lmy
  Date: 2022/3/28
  Time: 09:18
  To change this template use File | Settings | File Templates.
--%>
<%@ page import="java.util.Map" %>
<%@ page contentType="text/html;charset=UTF-8"
         language="java"
         errorPage="error500.jsp"
%>
<!--
errorPage表示错误后自动跳转去的路径 </br>
这个路径一般都是以斜杠大头,它表示请求地址为http://ip:poot/路径/
映射到代码的web目录
-->
<html>
<head>
    <title>Title</title>
</head>
<body>
这是b.jsp页面
<!--这是html注释 -->
<%
    //单行java注释
    /*
    多行java注释
     */
%>
<%--
这是jsp注释
--%>
</body>
</html>
