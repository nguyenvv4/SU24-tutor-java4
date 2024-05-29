<%--
  Created by IntelliJ IDEA.
  User: nguyenvv
  Date: 17/05/2024
  Time: 14:32
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="/sinh-vien/add" method="post">
    <label> id</label>
    <input type="text" name="id"> <br>
    <label> ho ten</label>
    <input type="text" name="hoTen"> <br>
    <label>dia chi</label>
    <input type="text" name="diaChi"><br>
    <label> gioi tinh</label>
    <div>
        <input type="radio" name="gioiTinh" value="Nam"> Nam
        <input type="radio" name="gioiTinh" value="Nu"> Nu
    </div>
    <label>trang thai</label>
    <div>
        <input type="radio" name="trangThai" value="ON"> ON
        <input type="radio" name="trangThai" value="OFF"> OFF
    </div>
    <label>ngay tao</label>
    < <input type="date" name="ngayTao"><br>
    <button type="submit">Add</button>
</form>
<h1>Danh sach sinh vien</h1>
<table>
    <tr>
        <td>id</td>
        <td>ho ten</td>
        <td>dia chi</td>
        <td>gioi tinh</td>
        <td>trang thai</td>
        <td>Action</td>
    </tr>
    <tbody>
    <c:forEach items="${list}" var="l">
        <tr>
            <td>${l.id}</td>
            <td>${l.hoTen}</td>
            <td>${l.diaChi}</td>
            <td>${l.gioiTinh}</td>
            <td>${l.trangThai}</td>
            <td>
                <a href="/sinh-vien/edit?id=${l.id}">Edit</a>
                <a href="/sinh-vien/delete?id=${l.id}">Xoa</a>
            </td>
        </tr>
    </c:forEach>
    </tbody>
</table>

</body>
</html>
