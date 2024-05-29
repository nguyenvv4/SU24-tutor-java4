<%--
  Created by IntelliJ IDEA.
  User: nguyenvv
  Date: 29/05/2024
  Time: 14:36
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <title>Title</title>
</head>
<body>
<table>
    <thead>
    <tr>
        <td>id</td>
        <td>ma</td>
        <td>ten</td>
        <td>ngay tao</td>
        <td>ngay sua</td>
        <td>trang thai</td>
    </tr>
    </thead>
    <tbody>
    <c:forEach items="${danhMucs}" var="danhMuc">
        <tr>
            <td>${danhMuc.id}</td>
            <td>${danhMuc.maDanhMuc}</td>
            <td>${danhMuc.tenDanhMuc}</td>
            <td>${danhMuc.ngayTao}</td>
            <td>${danhMuc.ngaySua}</td>
            <td>${danhMuc.trangThai}</td>
        </tr>
    </c:forEach>
    </tbody>
</table>
</body>
</html>
