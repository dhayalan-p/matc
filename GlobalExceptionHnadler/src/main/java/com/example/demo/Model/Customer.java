package com.example.demo.Model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class Customer implements Serializable{

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int cusid;
	private String name;
	private String address;
	public int getCusid() {
		return cusid;
	}
	public void setCusid(int cusid) {
		this.cusid = cusid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Customer(int cusid, String name, String address) {
		super();
		this.cusid = cusid;
		this.name = name;
		this.address = address;
	}

	@Override
	public String toString() {
		return "Customer [cusid=" + cusid + ", name=" + name + ", address=" + address + "]";
	}
	public Customer() {}
	public String orElse() {
		// TODO Auto-generated method stub
		return null;
	}




}
