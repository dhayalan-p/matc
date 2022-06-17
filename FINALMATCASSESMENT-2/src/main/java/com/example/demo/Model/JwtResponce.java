package com.example.demo.Model;

import java.util.List;

public class JwtResponce {
	
	private static final long serialVersionUID = -8091879091924046844L;
	private String jwttoken;

	

	public void JwtResponse(String jwttoken) {
		this.jwttoken = jwttoken;
	}

	public String getToken() {
		return this.jwttoken;
	}
	public JwtResponce(String jwttoken) {
		super();
		this.jwttoken = jwttoken;
	}
	public JwtResponce() {}

	public JwtResponce(String jwt, Long id, String username, String email, List<String> roles) {
		// TODO Auto-generated constructor stub
	}
}
