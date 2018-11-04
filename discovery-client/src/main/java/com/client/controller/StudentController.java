package com.client.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.client.model.Student;
import com.client.repository.StudentRepository;

@RestController
public class StudentController {
	
	
	@Autowired
	private Environment env;
	
	@RequestMapping(value="/students",method=RequestMethod.GET)
	public List<Student> findAll(){
		return StudentRepository.getStudents();
	}
	
	@RequestMapping(value="/students/{studentId}",method=RequestMethod.GET)
	public Student findone(@PathVariable("studentId") int studentId){
		return StudentRepository.getOne(studentId);
	}
	
	


}
