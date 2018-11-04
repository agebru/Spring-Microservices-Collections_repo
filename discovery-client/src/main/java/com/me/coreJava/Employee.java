package com.me.coreJava;

import java.util.ArrayList;
import java.util.List;

public class Employee {
	private int employeeNumber;
	private String firstName;
	private double salary;
	private List<Address> addresses;
	private Employer employer;
	
	
	
	
	
	
	public Employee() {
		
	}
	
	
	public int getEmployeeNumber() {
		return employeeNumber;
	}

	public void setEmployeeNumber(int employeeNumber) {
		this.employeeNumber = employeeNumber;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public List<Address> getAddresses() {
		return addresses;
	}

	public void setAddresses(List<Address> addresses) {
		this.addresses = addresses;
	}

	public Employer getEmployer() {
		return employer;
	}

	public void setEmployer(Employer employer) {
		this.employer = employer;
	}

	// Employee Annual Bonus
	public double employeeAnnualBonus() {
		double annualBonus=0.0;
		
		String employerName=employer.getName();		
		switch(employerName) {
		case "TCS":
			annualBonus=this.salary*0.1;
			break;
		
		case "InfoSYS":
			annualBonus=this.salary*0.01;
			break;
		case "delta":
			annualBonus=this.salary*0.2;
			break;
		
		case "Google":
			annualBonus=this.salary*0.5;
			break;
			
		default:
			annualBonus=this.salary*0;
		}
	return 	annualBonus;
		
	
	}
	
	public double totalSalaryWithBonus() {
		return this.employeeAnnualBonus()+this.salary;
	}
	
	

	public void addAddress(Address address) {
		if(addresses==null) {
			addresses=new ArrayList<>();
		}
		addresses.add(address);
	}


	@Override
	public String toString() {
		return "Employee [employeeNumber=" + employeeNumber + ", firstName=" + firstName + ", salary=" + salary
				+ ", addresses=" + addresses + ", employer=" + employer + "]";
	}
	
	
	
	
	
}
