package com.me.coreJava;

public class Employer {
	private String employerId;
	private String name;

	
	public Employer() {
		
	}
	
	
	public Employer(String employerId, String name) {
		super();
		this.employerId = employerId;
		this.name = name;
	}


	public String companyInformation() {
		return " ABC compay";
	}

	public String getEmployerId() {
		return employerId;
	}

	public String getName() {
		return name;
	}


	@Override
	public String toString() {
		return "Employer [employerId=" + employerId + ", name=" + name + "]";
	}
	
	
	
	
}
