package com.enticho.repo;



import java.util.ArrayList;
import java.util.List;

import com.enticho.domain.Student;

public class StudentRegistration {
	private List<Student> students;
	private static StudentRegistration studreg=null;
	
	private StudentRegistration() {
		students=new ArrayList<Student>();
	}
	
	public static StudentRegistration getInstance() {
		if(studreg==null) {
			studreg=new StudentRegistration();
			return studreg;
		}
		return studreg;
	}
	
	public void addStudent(Student student) {
		students.add(student);
		}
	
	
	
	public String upDateStudent(String  registrationNumber,Student std) {
		
		for(Student st: students) {
			if(st.getRegistrationNumber().equals(registrationNumber)) {
				
			students.set(students.indexOf(st) ,std);	
			}
		}
		return "Record updated Successfully";
	}
	
	
	
	public Student deleteStudent(String registrationNumber) {
		Student studentToDelete=null;
		for(Student student:students) {
			if(student.getRegistrationNumber().equals(registrationNumber)) {
				studentToDelete = student;
			}
		}
		
		students.removeIf(student->student.getRegistrationNumber().equalsIgnoreCase(registrationNumber));		
		return studentToDelete;
		
		
	}
	
	public List<Student> getStudentRecords(){
		return students;
	}
	
	
	

}
