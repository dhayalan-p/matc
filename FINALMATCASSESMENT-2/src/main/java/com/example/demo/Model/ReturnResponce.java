package com.example.demo.Model;

public class ReturnResponce {
	
	private static final long serialVersionUID = -8091879091924046844L;
	private String jwttoken;
	public String getJwttoken() {
		return jwttoken;
	}
	public void setJwttoken(String jwttoken) {
		this.jwttoken = jwttoken;
	}
	public ReturnResponce(String jwttoken) {
		super();
		this.jwttoken = jwttoken;
	}

	
	public ReturnResponce() {}
	
}
