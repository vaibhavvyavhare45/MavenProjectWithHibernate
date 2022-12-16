package com.warrior.MavenProjectWithHibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class EmbedDemo {
	public static void main(String[] args) {
		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		Student stud1 = new Student();

		stud1.setSid(1001);
		stud1.setSname("marish mokal");
		stud1.setCity("raygad");
		Certificate certi1 = new Certificate();
		certi1.setCourse("java");
		certi1.setDueration("6 months");
		stud1.setCerti(certi1);
		Student stud2 = new Student();

		stud2.setSid(1002);
		stud2.setSname("Ram vyavhare");
		stud2.setCity("Washim");
		Certificate certi2 = new Certificate();
		certi2.setCourse("python");
		certi2.setDueration("4 months");

		stud2.setCerti(certi2);
		Session s = factory.openSession();
		
		Transaction tx=s.beginTransaction();
		//objects save
		s.save(stud1);
		s.save(stud2);
		
		
		tx.commit();
	
		
		s.close();
		factory.close();
	}

}
