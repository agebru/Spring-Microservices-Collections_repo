package com.client.repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.client.model.Order;
import com.client.model.Student;

public class StudentRepository {

	public static Map<Integer,Student> studentmap;
	static {
		studentmap=new HashMap<Integer,Student>();
		studentmap.put(1, new Student(11,"Belay",20));
		studentmap.put(2, new Student(22,"Mehari",30));
		studentmap.put(3, new Student(33,"Mussie",22));
		studentmap.put(4, new Student(44,"Selam",25));
		studentmap.put(5, new Student(55,"Titi",15));
		
	}
	
	
	
	public static List<Student> getStudents(){
		return new ArrayList<>(studentmap.values());
	}
	
	public static Student getOne(int studentId) {
		Student student=null;
		Set<Integer> keysets=studentmap.keySet();
		for(Integer i:keysets) {
			student=studentmap.get(i);
			if(student.getStudentId()==studentId) {
				return student;
			}
					}
		 throw new IllegalArgumentException();
	}
}
