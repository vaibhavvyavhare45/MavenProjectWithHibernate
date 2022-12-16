package com.warrior.MavenProjectWithHibernate;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity // (name="Student_details") //Hibernate consider the student as a entity//hql
		// hibernate qury language// entity means marking any class as an entity
//@Table  //or @Table(name="myStudents") //when table is created  the name of table is change is myStudent

public class Student {
	@Id // to make the primary key on id in student entity object
	//@Id is an marking any column for as an primary key
	private int sid;
	private String sname;
	private String city;
	
	private Certificate certi;

	public Student() {
		super();
	}

	public Student(int sid, String sname, String city) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.city = city;
	}

	public int getSid() {
		return sid;
	}

	public void setSid(int sid) {
		this.sid = sid;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}
	
	

	public Certificate getCerti() {
		return certi;
	}

	public void setCerti(Certificate certi) {
		this.certi = certi;
	}

	@Override
	public String toString() {
		return this.sid+":"+this.sname+":"+this.city;
	
	}

}
