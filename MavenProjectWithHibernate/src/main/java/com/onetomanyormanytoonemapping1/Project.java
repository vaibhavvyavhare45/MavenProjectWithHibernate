package com.onetomanyormanytoonemapping1;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;

@Entity
public class Project {
	@Id
	@Column(name = "pro_id")
	private int pmid;
	
	private String pmname;
	
	//@OneToOne(mappedBy = "pro")
	@ManyToOne
	private Employee emp;

	public int getPmid() {
		return pmid;
	}

	public void setPmid(int pmid) {
		this.pmid = pmid;
	}

	public String getPmname() {
		return pmname;
	}

	public void setPmname(String pmname) {
		this.pmname = pmname;
	}

	public Employee getEmp() {
		return emp;
	}

	public void setEmp(Employee emp) {
		this.emp = emp;
	}

	public Project() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Project(int pmid, String pmname) {
		super();
		this.pmid = pmid;
		this.pmname = pmname;
	}

}
