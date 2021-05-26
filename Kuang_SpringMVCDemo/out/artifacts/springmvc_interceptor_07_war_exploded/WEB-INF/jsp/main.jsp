<%--
  Created by IntelliJ IDEA.
  User: Chaoq
  Date: 2021/5/26
  Time: 17:52
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>Main Page</h1>

<span>${username}</span>

<p>
    <a href="${pageContext.request.contextPath}/user/goOut">logout</a>
</p>

</body>
</html>
