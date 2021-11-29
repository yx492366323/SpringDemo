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
    <title>Modify</title>
</head>
<body>
<form action="../editUsers" method="post" id='formid'>
    <table width="30%" border=l>
        <tr>
            <td>选择</td>
            <td>用户名</td>
        </tr>
        <tr>
            <td>
                <input name="users[0].passwd" value="1" type="checkbox"/>
            </td>
            <td>
                <input name="users[0].username" value="tome" type="text"/>
            </td>
        </tr>
        <tr>
            <td>
                <input name="users[1].passwd" value="2" type="checkbox"/>
            </td>
            <td>
                <input name="users[1].username" value="jack" type="text"/>
            </td>
        </tr>
    </table>
    <input type="submit" value="修改"/>
</form>
</body>
</html>
