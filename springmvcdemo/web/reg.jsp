<%--
  Created by IntelliJ IDEA.
  User: huh
  Date: 18-8-22
  Time: 下午7:51
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>注册</title>
</head>
<body>
<form id="reg_form" name="reg_form" method="post" action="/doReg">
    用户名：<input type="text" id="username" name="username"/> <br />
    密码：　<input type="password" id="password" name="password"/> <br />
    <input type="submit" name="submit" value="注册">
</form>

</body>
</html>