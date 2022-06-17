package com.example.demo.Confiq;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;

import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;

import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;

import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.core.userdetails.UserDetailsService;

import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;


@SuppressWarnings("deprecation")
@EnableWebSecurity

public class Jwt extends WebSecurityConfigurerAdapter{

	@Autowired
	private JwtAuthenticationEntryPoint jwtAuthenticationEntryPoint;

	@Autowired
	private UserDetailsService jwtUserDetailsService;

	@Autowired
	private AuthTokenFilter jwtRequestFilter;
	
	
	
	public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
		
		auth.userDetailsService(jwtUserDetailsService);
	}
	
	

	@Bean
	@Override
	public AuthenticationManager authenticationManagerBean() throws Exception {
		return super.authenticationManagerBean();
	}

	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http.csrf().disable()
		.authorizeRequests().antMatchers("/Dhayalan").permitAll()
		.antMatchers("/signin").permitAll()
		.antMatchers("/signup").permitAll()
		.antMatchers("/Dhayalan/addmysql").hasRole("ADMIN")
		.antMatchers("/Dhayalan/deletebymysql/{id}").hasRole("ADMIN")
		.antMatchers("/Dhayalan/updateingmysql").hasRole("ADMIN")
	
		.antMatchers("/Dhayalan/findmysql/{id}").hasAnyRole("ADMIN","USER")
		
		.antMatchers("/Dhayalan/findallmysql").hasAnyRole("ADMIN","USER")
		
		
		.anyRequest().permitAll().and().sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS);
		http.addFilterBefore(jwtRequestFilter, UsernamePasswordAuthenticationFilter.class);
	}
	}
	
	 
	
	
	
	
	
	
	
	
	
	
	