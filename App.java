package crud.hibernate;

import org.hibernate.SessionFactory;


import org.hibernate.Session;

import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App
{
    public static void main( String[] args ) {

//        //to add the data
//        College college=new College();
//        college.setCId(1002);
//        college.setName("BVCk");
//        college.setDepartment("CSE");
//
//        SessionFactory factory=new Configuration()
//                .addAnnotatedClass(crud.hibernate.College.class)
//                .configure("hibernate.cfg.xml")
//                .buildSessionFactory();
//        Session session=factory.openSession();
//        Transaction transaction=session.beginTransaction();
//        session.persist(college);
//        transaction.commit();
//        session.close();
//        factory.close();

        //to update the data
//        College c1 = new College();
//        c1.setCId(1002);
//        c1.setName("TKIET");
//        c1.setDepartment("CSE");
//
//        SessionFactory factory = new Configuration()
//                .addAnnotatedClass(crud.hibernate.College.class)
//                .configure("hibernate.cfg.xml")
//                .buildSessionFactory();
//        Session session = factory.openSession();
//        Transaction transaction = session.beginTransaction();
//        session.merge(c1);
//        transaction.commit();
//        session.close();
//        factory.close();

        //to fetch the data using find/get
//        SessionFactory factory = new Configuration()
//                .addAnnotatedClass(crud.hibernate.College.class)
//                .configure("hibernate.cfg.xml")
//                .buildSessionFactory();
//        Session session = factory.openSession();
//        Transaction tx = session.beginTransaction();
//        College c2=session.find(College.class,1002);
//        tx.commit();
//        System.out.println(c2);
//        session.close();
//        factory.close();

        //to delete the data
        SessionFactory factory = new Configuration()
                .addAnnotatedClass(crud.hibernate.College.class)
                .configure("hibernate.cfg.xml")
                .buildSessionFactory();
        Session session = factory.openSession();
        Transaction tx = session.beginTransaction();
        College c=session.find(crud.hibernate.College.class,1002);
        if(c!=null)
        {
            session.remove(c);
            System.out.println("Data deleted successfully");
        }
        else{
            System.out.println("Data not deleted");
        }
        tx.commit();
        session.close();
        factory.close();
    }
}

//revised