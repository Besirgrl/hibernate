package com.tpe.hb.basicannotations;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class RunnerSave {

    public static void main(String[] args) {

        Configuration config = new Configuration().configure("hibernate.cfg.xml").
                addAnnotatedClass(Student.class);

        SessionFactory sf = config.buildSessionFactory();

        Session session = sf.openSession();




    }


}
