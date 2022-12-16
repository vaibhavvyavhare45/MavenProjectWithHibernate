package com.warrior.MavenProjectWithHibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class FetchDemo {

	public static void main(String[] args) {

		// get() and load()

		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		Session session = factory.openSession();
		// get student id-101
		Student s = (Student) session.load(Student.class, 101);// load() method not found object the throws
																// ObjectNotFoundException
		System.out.println(s);

		Student s1 = (Student) session.get(Student.class, 102);// this method return null if object is not found in
																// cache
		System.out.println(s1);

		Address a1 = (Address) session.get(Address.class, 1);
		System.out.println(a1.getStreet() + ":" + a1.getCity());

		session.close();
		factory.close();

	}

}
