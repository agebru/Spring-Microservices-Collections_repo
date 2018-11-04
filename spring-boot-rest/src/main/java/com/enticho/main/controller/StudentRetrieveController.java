package com.enticho.main.controller;

import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.enticho.domain.Student;
import com.enticho.repo.StudentRegistration;

@RestController
public class StudentRetrieveController {
	
	
	@RequestMapping(method = RequestMethod.GET, value="/student/allstudent")
	  public List<Student> getAllStudents() {
		  return StudentRegistration.getInstance().getStudentRecords();

		  }

}
