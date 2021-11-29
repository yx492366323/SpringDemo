<%--
  Created by IntelliJ IDEA.
  User: yx492
  Date: 2021/11/18
  Time: 21:08
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Add</title>
</head>
<body>
${msg}
<form action="login" method="POST">
    用户名:<input type="text" name="username"/><br/>
    密&nbsp;&nbsp;&nbsp;码:
    <input type="password" name="passwd"/><br/>
    <input type="submit" value="登录"/>
</form>
</body>
</html>
