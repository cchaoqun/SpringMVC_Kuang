<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Chaoq
  Date: 2021/5/26
  Time: 1:38
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title >AllBooks</title>
    <!--BootStrap cdn库-->
    <link href="https://cdn.bootcss.com/bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">
    <link rel="icon" type="image/png" sizes="144x144" href="/img/kobe_face.JPG"/>
</head>
<body>

<div class="container" >
    <div class="row clearfix">
        <div class="col-md-12 column" >
            <div class="page-header">
                <h1>
                    <small>Book List</small>
                </h1>
            </div>
        </div>

        <div class="row">



            <%--添加--%>
            <div class="col-md-4 column">
                <%--toAddBook--%>
                <a class="btn btn-primary" href="${pageContext.request.contextPath}/book/toAddBook">Add New Book</a>
                <a class="btn btn-primary" href="${pageContext.request.contextPath}/book/allBook">Show All Books</a>
            </div>


            <%--查询--%>
            <div class="col-md-8 column">
                <%--SearchBook--%>

                    <%--根据书名查询查询--%>
                <form class="form-inline" action="${pageContext.request.contextPath}/book/queryBook" method="post" style="float:right">
                    <%--错误信息--%>
                    <span style="color:firebrick; font-weight: bold">${error1}</span>
                    <input type="text" name="queryBookName" class="form-control" placeholder="Enter the book name you want to search">
                    <input type="submit" value="SearchByName" class="btn btn-primary">
                </form>
                    <%--根据书名模糊查询--%>
                <form class="form-inline" action="${pageContext.request.contextPath}/book/queryBookLike" method="post" style="float:right">
                    <!--错误信息-->
                    <span style="color:firebrick; font-weight: bold">${error2}</span>
                    <input type="text" name="queryBookLike" class="form-control" placeholder="Enter the book name like you want to search">
                    <input type="submit" value="SearchByNameLike" class="btn btn-primary">
                </form>
            </div>

        </div>
    </div>
    <div class="row clearfix">
        <div class="col-md-12 column">
            <table class="table table-hover table-striped">
                <thead>
                    <tr>
                        <th>BookId</th>
                        <th>BookName</th>
                        <th>BookCounts</th>
                        <th>BookDetails</th>
                        <th>Modification</th>
                    </tr>
                </thead>

                <%--书籍从数据库中查询出来, 从这个list中遍历出来: foreach--%>
                <tbody>
                    <c:forEach var="book" items="${list}">
                        <tr>
                            <td>${book.bookID}</td>
                            <td>${book.bookName}</td>
                            <td>${book.bookCounts}</td>
                            <td>${book.detail}</td>
                            <td>

                                <a href="${pageContext.request.contextPath}/book/toUpdateBook?id=${book.bookID}">Modify</a>
                                &nbsp; | &nbsp;
                                <a href="${pageContext.request.contextPath}/book/deleteBook/${book.bookID}">Delete</a>
                            </td>
                        </tr>
                    </c:forEach>
                </tbody>
            </table>
        </div>
    </div>
</div>



</body>
</html>
