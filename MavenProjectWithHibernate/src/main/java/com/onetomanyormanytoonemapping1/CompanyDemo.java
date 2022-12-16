package com.onetomanyormanytoonemapping1;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class CompanyDemo {
	public static void main(String[] args) {
		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		// creating Employee object
		Employee e1 = new Employee();
		e1.setEid(102);
		e1.setEname("marish Mokal");
		
		//creating project object
		Project p1=new Project();
		p1.setPmid(3);
		p1.setPmname("login module");
		p1.setEmp(e1);
		//e1.setPro(p1);
		
		Project p2=new Project();
		p2.setPmid(5);
		p2.setPmname("sign in module");
		p2.setEmp(e1);
		
		List<Project> li=new ArrayList<>();
		li.add(p1);
		li.add(p2);
		
		e1.setPro(li);

		Session s = factory.openSession();
		Transaction tx = s.beginTransaction();
		// save sessionss
		s.save(e1);
		s.save(p1);
		s.save(p2);
		//fetching data but don't forget to replace create to update at the time of fetching data 
//		Employee e=(Employee)s.get(Employee.class, 102);
//		System.out.println(e.getEid());
//		for(Project p:e.getPro()) {
//			System.out.println(p.getPmname());
//		}

		tx.commit();
		s.close();
		factory.close();
	}

}
