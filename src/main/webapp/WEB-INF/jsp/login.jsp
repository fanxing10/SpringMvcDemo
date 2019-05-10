<%--
  Created by IntelliJ IDEA.
  User: 16848
  Date: 2019/5/9
  Time: 16:18
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<div style="margin: 0 auto;padding-top: 100px;" align="center">
    <form action="doLogin.do" method="post">
        <p>
            <span>用户名：</span><input type="text" name="username">
        </p>
        <p>
            <span>密  码：</span><input type="password" name="password">
        </p>

        <p>
            <input  type="submit" value="登陆" >
        </p>
        <p style="color: red;">
            ${error }
        </p>
    </form>
</div>
</body>
</html>
