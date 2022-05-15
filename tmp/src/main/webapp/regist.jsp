<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>$Title$</title>
</head>
<body>
<form action="http://localhost:8080/tmp/registServlet" method="get">
    用户名:<input type="text" name="username" id=""><br/>
    验证码:<input type="text" style="width: 50px;" name="code">
    <img src="http://localhost:8080/tmp/kaptcha.jpg" style="width: 100px;height:28px;"><br/>
    <input type="submit" value="登录">
</form>
</body>
</html>