<%--
  Created by IntelliJ IDEA.
  User: STRIDE
  Date: 2021/1/18
  Time: 22:05
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <table border="1" align="center" width="50%">
        <tr>
            <th>Name</th>
            <th>Sex</th>
            <th>Age</th>
        </tr>
        <#list list as user>
            <tr>
                <td>${user.username}</td>
                <td>${user.usersex}</td>
                <td>${user.userage}</td>
            </tr>
        </#list>

    </table>
</body>
</html>
