package com.tpe.hb.basicannotations;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class RunnerFetch {

    public static void main(String[] args) {

        Configuration config = new Configuration().configure("hibernate.cfg.xml").
                addAnnotatedClass(Employee.class);

        SessionFactory sf = config.buildSessionFactory();

        Session session = sf.openSession();


        // 1. GET METODU KULLANARAK FETCH
        // `get` metodu kullanılarak id=1001 olan öğrenci getiriliyor.


        // 2. SQL KULLANARAK FETCH
        // SQL sorgusu ile id=1002 olan öğrenci çekiliyor.


        // 3. HQL KULLANARAK FETCH
        // HQL ile id=1003 olan öğrenci çekiliyor.


        // 4. TÜM KAYITLARI ÇEKME
        // HQL kullanılarak tüm öğrenci kayıtları çekiliyor.


        // SQL ile tüm kayıtları çekme


        // 5. HQL İLE BELİRLİ KRİTERLERE GÖRE FETCH
        // Grade (not) değeri 98 olan öğrencilerin id ve isim bilgileri çekiliyor.


        // İsim bazlı fetch: İsmi 'Harry Potter' olan öğrenciler çekiliyor.


        // Tüm öğrencilerin sadece isimlerini çekmek: HQL ile.


        // Tüm öğrencilerin sadece isimlerini çekmek: SQL ile.


        // İşlemler tamamlandıktan sonra session ve session factory kapatılıyor.





    }//main



}//class
