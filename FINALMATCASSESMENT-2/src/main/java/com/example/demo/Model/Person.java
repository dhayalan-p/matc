package com.example.demo.Model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
public class Person {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long adtharId;
	private String name;
	private int age;
	private long mobileno;
	
	
	@OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id")
    @JsonBackReference     		
	
	public Employee employee;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public long getMobileno() {
		return mobileno;
	}
	public void setMobileno(long mobileno) {
		this.mobileno = mobileno;
	}
	
	
	
	public Person(Long adtharId, String name, int age, long mobileno) {
		super();
		this.adtharId = adtharId;
		this.name = name;
		this.age = age;
		this.mobileno = mobileno;
		
	}
	public Person() {}
	public Long getAdtharId() {
		return adtharId;
	}
	public void setAdtharId(Long adtharId) {
		this.adtharId = adtharId;
	}
	
	@Override
	public String toString() {
		return "Person [adtharId=" + adtharId + ", name=" + name + ", age=" + age + ", mobileno=" + mobileno
				+  "]";
	}
	public Employee getEmployee() {
		return employee;
	}
	public void setEmployee(Employee employee) {
		this.employee = employee;
	}
	
	
	
	}
	
	


