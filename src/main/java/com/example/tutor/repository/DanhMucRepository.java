package com.example.tutor.repository;

import com.example.tutor.entity.DanhMuc;
import com.example.tutor.ultis.HibernateUltis;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;

import java.util.ArrayList;
import java.util.List;

public class DanhMucRepository {

    public List<DanhMuc> getList() {
        SessionFactory factory = HibernateUltis.getFACTORY();
        Session session = factory.openSession();
        Query<DanhMuc> query = session.createQuery("from  DanhMuc ");
        List<DanhMuc> dsDanhMuc = query.getResultList();
        return dsDanhMuc;
    }
}
