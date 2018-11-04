package com.enticho.domain;


public class Student {
	private String name;
	private int age;
	private String registrationNumber;

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

	public String getRegistrationNumber() {
		return registrationNumber;
	}

	public void setRegistrationNumber(String registrationNumber) {
		this.registrationNumber = registrationNumber;
	}



	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", registrationNumber=" + registrationNumber + "]";
	}
	
	
	

}