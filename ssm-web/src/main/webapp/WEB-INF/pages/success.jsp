<%--
  Created by IntelliJ IDEA.
  User: 向
  Date: 2021/2/12
  Time: 23:49
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>success</title>
</head>
<body>
    <table border="1">
        <tr>
            <td>ID</td>
            <td>name</td>
            <td>price</td>
            <td>pic</td>
            <td>createTime</td>
            <td>detail</td>
            <td></td>
        </tr>
        <c:forEach items="${item}" var="item">
            <tr>
                <td>${item.id}</td>
                <td>${item.name}</td>
                <td>${item.price}</td>
                <td>${item.pic}</td>
                <td>${item.createtime}</td>
                <td>${item.detail}</td>
            </tr>
        </c:forEach>
</table>
</body>
</html>
