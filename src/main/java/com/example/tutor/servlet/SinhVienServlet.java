package com.example.tutor.servlet;

import com.example.tutor.entity.SinhVien;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;
import java.util.ArrayList;

@WebServlet(name = "SinhVienServlet", value = {"/home",
        "/sinh-vien/add",
        "/sinh-vien/edit",
        "/sinh-vien/delete",
})
public class SinhVienServlet extends HttpServlet {

    // tạo 1 đối tượng sinh viên:id. hoten,diachi,
    // gioi tinh, trang thai
    // hiển thị 1 danh sách sinh viên.

    ArrayList<SinhVien> list = new ArrayList<>();

    public SinhVienServlet() {
        list.add(new SinhVien(1, "Nguyen Van A", "Ha Noi", "Nam", "ON"));
        list.add(new SinhVien(2, "Nguyen Van A", "Ha Noi", "Nam", "ON"));
        list.add(new SinhVien(3, "Nguyen Van A", "Ha Noi", "Nam", "ON"));
        list.add(new SinhVien(4, "Nguyen Van A", "Ha Noi", "Nam", "ON"));
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String uri = request.getRequestURI();
        if (uri.equals("/home")) {
            String mess = "Nguyen Van A";
            request.setAttribute("message", mess);
            request.setAttribute("list", list);
            request.getRequestDispatcher("/sinh-vien.jsp").forward(request, response);
        } else if (uri.contains("/sinh-vien/edit")) {
            Integer id = Integer.parseInt(request.getParameter("id"));
            SinhVien sinhVienDetail = new SinhVien();
            for (SinhVien sinhVien : list) {
                ;
                if (sinhVien.getId().equals(id)) {
                    sinhVienDetail = sinhVien;
                }
            }
            request.setAttribute("sinhVienDetail", sinhVienDetail);
            request.getRequestDispatcher("/edit.jsp").forward(request, response);
        } else if (uri.contains("/sinh-vien/delete")) {
            Integer id = Integer.parseInt(request.getParameter("id"));
            for (int i = 0; i < list.size(); i++) {
                if (list.get(i).getId().equals(id)){
                    list.remove(list.get(i));
                }
            }
            response.sendRedirect("/home");
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String uri = request.getRequestURI();
        if (uri.contains("/sinh-vien/add")) {
            Integer id = Integer.parseInt(request.getParameter("id"));
            String hoTen = request.getParameter("hoTen");
            String diaChi = request.getParameter("diaChi");
            String gioiTinh = request.getParameter("gioiTinh");
            String trangThai = request.getParameter("trangThai");
            SinhVien sinhVien = new SinhVien(id, hoTen, diaChi, gioiTinh, trangThai);
            list.add(sinhVien);
            response.sendRedirect("/home");
        }
    }
}