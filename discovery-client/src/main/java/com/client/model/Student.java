package com.client.model;

public class Student {
	private int studentId;
	private String firstName;
	private int age;
	
	public Student() {
		
	}

	public Student(int studentId, String firstName, int age) {
		super();
		this.studentId = studentId;
		this.firstName = firstName;
		this.age = age;
	}

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

}
