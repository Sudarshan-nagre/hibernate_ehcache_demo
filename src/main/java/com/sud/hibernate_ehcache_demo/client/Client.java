package com.sud.hibernate_ehcache_demo.client;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.sud.hibernate_ehcache_demo.entity.Student;
import com.sud.hibernate_ehcache_demo.util.LocalConfiguration;

public class Client 
{
    public static void main( String[] args )
    {
       Session session = LocalConfiguration.getLocalSessionAnnotation();
       
       Transaction tx = session.beginTransaction();
       
       Student st = new Student();
       st.setName("Ganesh");
       st.setMobile("9887766543");
       st.setAdd("Pune");
       st.setEmail("Ganesh@gmail.com");
       
       session.save(st);
       tx.commit();
       session.close();
       System.out.println("Done !!!");
    }
}
