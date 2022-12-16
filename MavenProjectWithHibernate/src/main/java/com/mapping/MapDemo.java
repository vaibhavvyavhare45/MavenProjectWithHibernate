package com.mapping;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MapDemo {
	public static void main(String[] args) {
		
		SessionFactory factory=new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		
		//create question object
		Question q1=new Question();
		q1.setQuesId(101);
		q1.setQues("what is java?");
		
		//creating answer object
		Answer a1=new Answer();
		a1.setAnsId(10);
		a1.setAnswer("java is object oriented language.");
		a1.setQuestion(q1);
		q1.setAnswer(a1);
		
		Question q2=new Question();
		q2.setQuesId(102);
		q2.setQues("what is collection framework in java?");
		
		//creating answer object
		Answer a2=new Answer();
		a2.setAnsId(20);
		a2.setAnswer("Collection framwork is an java API.");
		a2.setQuestion(q2);
		q2.setAnswer(a2);
		
		//save session
		Session s=factory.openSession();
		Transaction tx=s.beginTransaction();
		s.save(q1);
		s.save(a1);
		s.save(q2);
		s.save(a2);
		
	
		
		
		
		tx.commit();
		//fetching data..
		
		Question newQues1=(Question)s.get(Question.class, 101);
		System.out.println(newQues1.getQues());
		System.out.println(newQues1.getAnswer().getAnswer());
		
		Question newQues2=(Question)s.get(Question.class, 102);
		System.out.println(newQues2.getQues());
		System.out.println(newQues2.getAnswer().getAnswer());
		
		
		s.close();
		
		factory.close();
	}

}
