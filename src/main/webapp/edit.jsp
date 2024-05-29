<%--
  Created by IntelliJ IDEA.
  User: nguyenvv
  Date: 20/05/2024
  Time: 15:01
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="#" method="post">
    <label> id</label>
    <input type="text" name="id" value="${sinhVienDetail.id}"> <br>
    <label> ho ten</label>
    <input type="text" name="hoTen" value="${sinhVienDetail.hoTen}"> <br>
    <label>dia chi</label>
    <input type="text" name="diaChi" value="${sinhVienDetail.diaChi}"><br>
    <label> gioi tinh</label>
    <div>
        <input type="radio" name="gioiTinh" value="Nam"
               ${sinhVienDetail.gioiTinh == 'Nam' ? 'checked' : ''}
        > Nam
        <input type="radio" name="gioiTinh" value="Nu"
        ${sinhVienDetail.gioiTinh == 'Nu' ? 'checked' : ''}
        > Nu
    </div>
    <label>trang thai</label>
    <div>
        <input type="radio" name="trangThai" value="ON"
        ${sinhVienDetail.trangThai == 'ON' ? 'checked' : ''}
        > ON
        <input type="radio" name="trangThai" value="OFF"
        ${sinhVienDetail.trangThai == 'OFF' ? 'checked' : ''}
        > OFF
    </div>
    <button type="submit">Update</button>
</form>

</body>
</html>
