package com.warrior.MavenProjectWithHibernate;

import jakarta.persistence.Embeddable;

@Embeddable
public class Certificate {
	private String course;
	private String dueration;
	
	public Certificate() {
		super();
	}

	public Certificate(String course, String dueration) {
		super();
		this.course = course;
		this.dueration = dueration;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	public String getDueration() {
		return dueration;
	}

	public void setDueration(String dueration) {
		this.dueration = dueration;
	}
	
	
	
	
	
	
	
	

}
