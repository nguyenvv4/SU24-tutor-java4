package com.example.tutor.entity;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class SinhVien {

    // tạo 1 đối tượng sinh viên:id. hoten,diachi,
    // gioi tinh, trang thai

    private Integer id;
    private String hoTen;
    private String diaChi;
    private String gioiTinh;
    private String trangThai;

}
