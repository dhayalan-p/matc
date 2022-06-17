package com.example.demo.Modelwithmongodp;


import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Employee {
	@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private String mempName;
	private String mrole;
	
	
	
	public Employee(int Id, String mempName, String mrole) {
		super();
		this.id = Id;
		this.mempName = mempName;
		this.mrole = mrole;
	}



	public Employee() {}



	public int getId() {
		return id;
	}



	public void setId(int Id) {
		this.id = Id;
	}



	public String getMempName() {
		return mempName;
	}



	public void setMempName(String mempName) {
		this.mempName = mempName;
	}



	public String getMrole() {
		return mrole;
	}



	public void setMrole(String mrole) {
		this.mrole = mrole;
	}
	

}
