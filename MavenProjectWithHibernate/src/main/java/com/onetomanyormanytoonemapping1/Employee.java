package com.onetomanyormanytoonemapping1;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;

@Entity
public class Employee {
	@Id
	@Column(name = "emp_id")
	private int eid;
	
	private String ename;
//	@OneToOne
//	@JoinColumn(name = "pid")
//	private Project pro;
	
	@OneToMany(mappedBy = "emp")
	private List<Project> pro;
	
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	
	
	public List<Project> getPro() {
		return pro;
	}
	public void setPro(List<Project> pro) {
		this.pro = pro;
	}
	public Employee() {
		super();
	}
	public Employee(int eid, String ename, List<Project> pro) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.pro = pro;
	}

	
	
}
