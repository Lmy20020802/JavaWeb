<%@ page import="java.util.Map" %>
<%@ page import="java.util.HashMap" %><%--
  Created by IntelliJ IDEA.
  User: lmy
  Date: 2022/3/29
  Time: 16:11
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    Map<String,Object> map=new HashMap<String,Object>();
    map.put("a.a.a","aaaValue");
    map.put("b+b+b","bbbValue");
    map.put("c-c-c","cccValue");

    request.setAttribute("map",map);
%>
${map['a.a.a']}<br>
${map['b+b+b']}<br>
${map['c-c-c']}<br>
</body>
</html>
