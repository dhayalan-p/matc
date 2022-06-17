package com.example.demo.Model;

public class EmployeeDto {
	
	private int Id;
	private String empname;
	
	private String Password;
	private String email;
	public EmployeeDto(int id, String empname, String password, String email, int adtharId, String name, int age,
			long mobileno) {
		super();
		Id = id;
		this.empname = empname;
		Password = password;
		this.email = email;
		this.adtharId = adtharId;
		this.name = name;
		this.age = age;
		this.mobileno = mobileno;
	}
	
	private int adtharId;
	private String name;
	private int age;
	private long mobileno;
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getEmpname() {
		return empname;
	}
	public void setEmpname(String empname) {
		this.empname = empname;
	}
	public String getPassword() {
		return Password;
	}
	public void setPassword(String password) {
		Password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getAdtharId() {
		return adtharId;
	}
	public void setAdtharId(int adtharId) {
		this.adtharId = adtharId;
	}
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
	

}
