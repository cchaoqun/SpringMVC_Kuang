<%--
  Created by IntelliJ IDEA.
  User: Chaoq
  Date: 2021/5/26
  Time: 11:26
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>UpdateBook</title>
    <link href="https://cdn.bootcss.com/bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>

<div class="container" >
    <div class="row clearfix">
        <div class="col-md-12 column" >
            <div class="page-header">
                <h1>
                    <small>Update Book</small>
                </h1>
            </div>
        </div>
    </div>

    <form action="${pageContext.request.contextPath}/book/updateBook" method="post">
<%--        出现的问题, 我们提交了修改的SQL请求, 但是修改失败, 初次考虑事物的问题, 配置完事务, 依旧失败--%>
<%--        看一下SQL语句, 能否执行成功 SQL执行失败, 修改未完成--%>
<%--        前端传递隐藏域--%>
        <input type="hidden" name="bookID" value="${QBook.bookID}">
        <div class="form-group">
            <label>Book Name</label>
            <input type="text" name="bookName" value="${QBook.bookName}" class="form-control"  required>
        </div>
        <div class="form-group">
            <label>Book Count</label>
            <input type="text" name="bookCounts" value="${QBook.bookCounts}" class="form-control" required>
        </div>
        <div class="form-group">
            <label>Book Detail</label>
            <input type="text" name="detail" value="${QBook.detail}" class="form-control" required>
        </div>
        <div class="form-group">
            <input type="submit" class="form-control" value="updateBook" >
        </div>

    </form>


</div>


</body>
</html>
