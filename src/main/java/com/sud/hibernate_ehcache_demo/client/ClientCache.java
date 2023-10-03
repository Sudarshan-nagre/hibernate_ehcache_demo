package com.sud.hibernate_ehcache_demo.client;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.sud.hibernate_ehcache_demo.entity.Student;
import com.sud.hibernate_ehcache_demo.util.LocalConfiguration;

public class ClientCache {

	public static void main(String[] args) {
		Session session = LocalConfiguration.getLocalSessionAnnotation();

		Transaction tx = session.beginTransaction();
		
		Student st = session.load(Student.class, 1);
		System.out.println("RollNo : "+st.getRollNo()+"\nName : "+st.getName());
		
		session.evict(st);
		System.out.println("Data from cache --------------");
		System.out.println(session.contains(st));
		st = session.get(Student.class, 1);
		System.out.println("RollNo : "+st.getRollNo()+"\nName : "+st.getName());
		
		session.getTransaction().commit();
		session.close();
		
	}

}
