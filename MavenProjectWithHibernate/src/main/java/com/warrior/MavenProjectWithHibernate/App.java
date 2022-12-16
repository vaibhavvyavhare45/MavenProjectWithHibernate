package com.warrior.MavenProjectWithHibernate;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args)throws IOException {
		System.out.println("start project....");
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
//		System.out.println(factory);
//		System.out.println(factory.isClosed());
//		System.out.println("project is ended....");
		
		Student st=new Student();
		st.setSid(102 );  
		st.setSname("pranav");
		
		st.setCity("kolhapur");
		System.out.println(st);
		
		//creating Address object
		Address a=new Address();
		a.setStreet("Street2");
		a.setCity("Pune");
		a.setOpen(true);
		a.setAddedDate(new Date());
		a.setX(1726.245);
		
		
		
		Session session=factory.openSession();
		Transaction tx=session.beginTransaction();
		session.save(st);
		session.save(a);
		System.out.println("Done");
		tx.commit();
		//session.getTransaction().commit();
		session.close();
		

	}
}
