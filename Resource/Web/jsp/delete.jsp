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
    <title>Delete</title>
</head>
<body>
<form action="../delete" method="post">
    <table width="20%" border=1>
        <tr>
            <td>选择</td>
            <td>用户名</td>
        </tr>
        <tr>
            <td><input name="ids" value="1" type="checkbox"></td>
            <td>tom</td>
        </tr>
        <tr>
            <td><input name="ids" value="2" type="checkbox"></td>
            <td>jack</td>
        </tr>
        <tr>
            <td><input name="ids" value="3" type="checkbox"></td>
            <td>lucy</td>
    </table>
    <input type="submit" value="删除"/>
</form>
</body>
</html>
