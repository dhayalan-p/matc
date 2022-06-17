package com.example.demo.Model;



import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonManagedReference;


@Entity
public class Employee {
	@Id
	
	private int id;
	private String empName;
	private String password;
	private String email;
	 
	 @OneToMany(cascade = CascadeType.ALL)
	 @JoinColumn(name ="emp_id",referencedColumnName = "id")
	    public List<Address> Listaddress;
	


	
	
	@OneToOne(cascade = CascadeType.ALL, mappedBy = "employee")
    @JsonManagedReference
	public Person person;
	
	





	public Employee(int id, String empName, String password, String email, List<Address> listaddress, Person person) {
		super();
		this.id = id;
		this.empName = empName;
		this.password = password;
		this.email = email;
		Listaddress = listaddress;
		this.person = person;
	}



	
	public Employee() {}



	@Override
	public String toString() {
		return "Employee [id=" + id + ", empName=" + empName + ", password=" + password + ", email=" + email
				+ ", Listaddress=" + Listaddress + ", person=" + person + "]";
	}




	public int getId() {
		return id;
	}




	public void setId(int id) {
		this.id = id;
	}




	public String getEmpName() {
		return empName;
	}




	public void setEmpName(String empName) {
		this.empName = empName;
	}




	public String getPassword() {
		return password;
	}




	public void setPassword(String password) {
		this.password = password;
	}




	public String getEmail() {
		return email;
	}




	public void setEmail(String email) {
		this.email = email;
	}




	public List<Address> getListaddress() {
		return Listaddress;
	}




	public void setListaddress(List<Address> listaddress) {
		Listaddress = listaddress;
	}




	public Person getPerson() {
		return person;
	}




	public void setPerson(Person person) {
		this.person = person;
	}




}
