<%--
  Created by IntelliJ IDEA.
  User: Chaoq
  Date: 2021/5/26
  Time: 16:23
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <script src="${pageContext.request.contextPath}/static/js/jquery-3.6.0.js"></script>
    <script>
        $(function(){
            $("#btn").click(function(){
                /*
                $.post(url, param[option] success)
                 */
                $.post("${pageContext.request.contextPath}/a2", function(data){
                    // console.log(data);
                    var html = "";
                    for(let i=0; i<data.length; i++){
                        html += "<tr>"+
                            "<td>" + data[i].name +"</td>"+
                            "<td>" + data[i].age +"</td>"+
                            "<td>" + data[i].sex +"</td>"+
                            "</tr>"
                    }
                    $("#content").html(html);



                })
            })

        })



    </script>
</head>
<body>

<input type="button" value="load data" id="btn">
<table>
    <tr>
        <td>name</td>
        <td>age</td>
        <td>sex</td>
    </tr>
    <tbody id="content">

    </tbody>
</table>


</body>
</html>
