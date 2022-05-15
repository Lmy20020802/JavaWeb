<%--
  Created by IntelliJ IDEA.
  User: lmy
  Date: 2022/3/28
  Time: 20:18
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>score.jsp页面</h1>
<%
    pageContext.setAttribute("key","pageContext");
    request.setAttribute("key","requset");
    session.setAttribute("key","session");
    application.setAttribute("key","application");
%>
pageContext域是否有值:<%=pageContext.getAttribute("key")%><br>
request域是否有值:<%=request.getAttribute("key")%><br>
session域是否有值:<%=session.getAttribute("key")%><br>
application域是否有值:<%=application.getAttribute("key")%><br>

<%--<%--%>
<%--    request.getRequestDispatcher("/score2.jsp").forward(request,response);--%>
<%--%>--%>

<%--
    <jsp:forward page=""></jsp:forward> 是请求转发标签，它的功能就是请求转发
        page 属性设置请求转发的路径
--%>
<jsp:forward page="/score2.jsp"></jsp:forward>
</body>
</html>
