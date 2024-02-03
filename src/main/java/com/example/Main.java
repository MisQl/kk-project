package com.example;

import org.hibernate.SessionFactory;

public class Main {

    public static void main(String[] args) {
        SessionFactory sessionFactory = HibernateUtils.getSessionFactory();
        System.out.println("Hello world!");
    }
}