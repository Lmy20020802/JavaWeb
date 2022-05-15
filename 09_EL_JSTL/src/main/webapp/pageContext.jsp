<%--
  Created by IntelliJ IDEA.
  User: lmy
  Date: 2022/3/29
  Time: 17:12
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%--
request.getScheme() 它可以获取请求的协议
request.getServerName() 获取请求的服务器ip或域名
request.getServerPort() 获取请求的服务器端口号
getContextPath() 获取当前工程路径
request.getMethod() 获取请求的方式（GET或POST）
request.getRemoteHost()  获取客户端的ip 地址
session.getId() 获取会话的唯一标识
--%>
<%
    pageContext.setAttribute("req",request);
    pageContext.setAttribute("sess",session);
%>
<%=request.getContextPath()%><br>
1.协议:${req.scheme}<br>
2.服务器ip:${req.serverName}<br>
3.服务器端口:${req.serverPort}<br>
4.获取工程路径:${req.contextPath}<br>
5.获取请求方法:${req.method}<br>
6.获取客户端ip地址:${req.remoteHost}<br>
7.获取会话的id端址:${sess.id}<br>
</body>
</html>
