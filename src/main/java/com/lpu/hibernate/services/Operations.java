package com.lpu.hibernate.services;

import com.lpu.hibernate.entity.Product;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Operations {

    private final SessionFactory factory;
    public Operations() {
        Configuration config = new Configuration();
        config.configure("hibernate.cfg.xml");
        factory = config.buildSessionFactory();
    }


    public void insertData(Product p){
        Session session = factory.openSession();
        Transaction txn = session.beginTransaction();
        session.save(p);
        txn.commit();
        session.close();
    }

    public Product getProduct(long id){
        Session session = factory.openSession();
        Transaction txn = session.beginTransaction();
        Product product = session.get(Product.class,id);
        txn.commit();
        session.close();
        return product;
    }

    public void updateProductPrice(long id, double price){
        Session session = factory.openSession();
        Transaction txn = session.beginTransaction();

        Product p = session.get(Product.class, id);
        if (p != null) {
            p.setPrice(price);
        }

        txn.commit();
        session.close();
    }


    public void deleteProduct(long id){
        Session session = factory.openSession();
        Transaction txn = session.beginTransaction();

        Product p = session.get(Product.class, id);
        if (p != null) {
            session.delete(p);
        }

        txn.commit();
        session.close();
    }


}
