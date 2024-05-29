package com.example.tutor.servlet;

import com.example.tutor.entity.DanhMuc;
import com.example.tutor.repository.DanhMucRepository;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;
import java.util.List;

@WebServlet(name = "DanhMucServlet", value = "/danh-muc/hien-thi")
public class DanhMucServlet extends HttpServlet {
    DanhMucRepository danhMucRepository = new DanhMucRepository();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String uri = request.getRequestURI();
        if (uri.contains("/danh-muc/hien-thi")) {
            List<DanhMuc> list = danhMucRepository.getList();
            request.setAttribute("danhMucs", list);
            request.getRequestDispatcher("/danh-muc.jsp").forward(request,response);
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
