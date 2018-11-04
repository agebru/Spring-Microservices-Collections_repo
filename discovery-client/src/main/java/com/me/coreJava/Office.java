package com.me.coreJava;

import java.util.ArrayList;
import java.util.List;

public class Office {
	
	private String officeNumber;
	private String location;	
	private List<Employee> employees;
	
	public Office() {
		
	}
	
	
	public void addEmployee(Employee employee) {
		if(employees==null) {
			employees=new ArrayList<>();
		}
		employees.add(employee);
	}

	public Office(String officeNumber, String location, List<Employee> employees) {
		super();
		this.officeNumber = officeNumber;
		this.location = location;
		this.employees = employees;
	}


	public String getOfficeNumber() {
		return officeNumber;
	}

	public void setOfficeNumber(String officeNumber) {
		this.officeNumber = officeNumber;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public List<Employee> getEmployees() {
		return employees;
	}

	public void setEmployees(List<Employee> employees) {
		this.employees = employees;
	}


	@Override
	public String toString() {
		return "Office [officeNumber=" + officeNumber + ", location=" + location + ", employees=" + employees + "]";
	}


	
	
	
	

}
