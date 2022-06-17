package com.example.demo.Modelwithmongodp;



import javax.persistence.Id;

import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Person {
	
	
	@Id
	private int madtharId;
	private String mname;
	private int mage;
	private long mmobileno;
	public int getMadtharId() {
		return madtharId;
	}
	public void setMadtharId(int madtharId) {
		this.madtharId = madtharId;
	}
	public String getMname() {
		return mname;
	}
	public void setMname(String mname) {
		this.mname = mname;
	}
	public int getMage() {
		return mage;
	}
	public void setMage(int mage) {
		this.mage = mage;
	}
	public long getMmobileno() {
		return mmobileno;
	}
	public void setMmobileno(long mmobileno) {
		this.mmobileno = mmobileno;
	}
	public Person(int madtharId, String mname, int mage, long mmobileno) {
		super();
		this.madtharId = madtharId;
		this.mname = mname;
		this.mage = mage;
		this.mmobileno = mmobileno;
	}
	
	public Person() {}
	
	

}
