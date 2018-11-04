package com.enticho.main.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.enticho.domain.Student;
import com.enticho.domain.StudentRegistrationReply;
import com.enticho.repo.StudentRegistration;

@RestController
public class StudentRegistrationController {
	
	 
	 @RequestMapping(method = RequestMethod.POST, value="/register/student")
	  public StudentRegistrationReply registerStudent(@RequestBody Student student) { 

	       System.out.println("In registerStudent");

	        StudentRegistrationReply stdregreply = new StudentRegistrationReply();           

	        StudentRegistration.getInstance().addStudent(student);

	        //We are setting the below value just to reply a message back to the caller

	        stdregreply.setName(student.getName());

	        stdregreply.setAge(student.getAge());

	        stdregreply.setRegistrationNumber(student.getRegistrationNumber());

	        stdregreply.setRegistrationStatus("Successful");

	        return stdregreply;

	}
	 
	 @RequestMapping(method = RequestMethod.PUT, value="/update/student/{registrationNumber}")
	 public StudentRegistrationReply updateStudent(@PathVariable("registrationNumber") String registrationNumber,@RequestBody Student student) {
		 
		 StudentRegistration.getInstance().upDateStudent(registrationNumber,student);
		 
		 StudentRegistrationReply replyStudent=new StudentRegistrationReply();
		 replyStudent.setName(student.getName());
		 replyStudent.setAge(student.getAge());
		 replyStudent.setRegistrationNumber(student.getRegistrationNumber());
		 replyStudent.setRegistrationStatus("Updated successfully");
		 return replyStudent;
	 }

	 @DeleteMapping("delete/student/{registrationNumber}")
	 public List<Student> responseAfterDeletingStudent(@PathVariable("registrationNumber") String registrationNumber){		 
		 Student deleteStudent = StudentRegistration.getInstance().deleteStudent(registrationNumber);
		 System.out.println("Deleted: "+deleteStudent);
		 return  StudentRegistration.getInstance().getStudentRecords();
	 }


}
