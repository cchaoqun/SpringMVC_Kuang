<%--
  Created by IntelliJ IDEA.
  User: Chaoq
  Date: 2021/5/26
  Time: 17:53
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>Log In</h1>

<form action="${pageContext.request.contextPath}/user/login" method="post">
    Username: <input type="text" name="username"/>
    Password: <input type="password" name="password">
    <input type="submit" value="submit">
</form>


</body>
</html>
