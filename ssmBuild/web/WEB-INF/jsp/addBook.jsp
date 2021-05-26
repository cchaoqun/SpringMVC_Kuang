<%--
  Created by IntelliJ IDEA.
  User: Chaoq
  Date: 2021/5/26
  Time: 10:50
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>AddBook</title>
    <link href="https://cdn.bootcss.com/bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>

<div class="container" >
    <div class="row clearfix">
        <div class="col-md-12 column" >
            <div class="page-header">
                <h1>
                    <small>Add New Book</small>
                </h1>
            </div>
        </div>
    </div>

    <form action="${pageContext.request.contextPath}/book/addBook" method="post">
        <div class="form-group">
            <label>Book Name</label>
            <input type="text" name="bookName" class="form-control"  required>
        </div>
        <div class="form-group">
            <label>Book Count</label>
            <input type="text" name="bookCounts" class="form-control" required>
        </div>
        <div class="form-group">
            <label>Book Detail</label>
            <input type="text" name="detail" class="form-control" required>
        </div>
        <div class="form-group">
            <input type="submit" class="form-control" value="addBook" >
        </div>

    </form>


</div>


</body>
</html>
