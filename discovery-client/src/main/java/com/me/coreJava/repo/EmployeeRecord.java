package com.me.coreJava.repo;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import com.me.coreJava.Address;
import com.me.coreJava.Employee;
import com.me.coreJava.Employer;

public class EmployeeRecord {
	private static Map<Integer,Employee> employeeMap=new HashMap<Integer,Employee>();
	
	static {
		
		//1st Employee
		Employee emp1=new Employee();
		         emp1.setEmployeeNumber(111);
		         emp1.setFirstName("Emmanuel");
		         emp1.setSalary(110000.0);
		         emp1.setEmployer(getTCSEmployer());
		         emp1.addAddress(new Address(55211,"Santa Barbara"));
		         emp1.addAddress(new Address(14300,"Raintree Dr"));
		         
		         
		    // 2nd Employee
		        Employee emp2=new Employee();
		         emp2.setEmployeeNumber(115);
		         emp2.setSalary(80000.0);
		         emp2.setFirstName("Hagos");
		         emp2.setEmployer(getTCSEmployer());
		         emp2.addAddress(new Address(20401,"sandy spring dr"));
		         emp2.addAddress(new Address(60127,"atlanta st ")); 
		         emp2.addAddress(new Address(60148,"Mariatta st ")); 
		   
		
		         
		         // 3rd Employee
		         Employee emp3=new Employee();
		         emp3.setEmployeeNumber(200);
		         emp3.setFirstName("Nathan");
		         emp3.setSalary(40000.0);
		         emp3.setEmployer(getInfosysEmployer());
		         emp3.addAddress(new Address(12300,"Holcom bridge dr"));
		         emp3.addAddress(new Address(40021,"North spring st ")); 
		         emp3.addAddress(new Address(50016,"college park st ")); 
		         emp3.addAddress(new Address(80151,"peachtree st ")); 
		
		         
		         
		         // 4th Employee
		         Employee emp4=new Employee();
		         emp4.setEmployeeNumber(205);
		         emp4.setSalary(20000.0);
		         emp4.setFirstName("Melat");
		         emp4.setEmployer(getGoogleEmployer());
		         emp4.addAddress(new Address(20117,"Mountain values"));
		         emp4.addAddress(new Address(30145,"California office ")); 
		         
		
		
		employeeMap.put(1, emp1);
		employeeMap.put(2, emp2);
		employeeMap.put(3, emp3);
		employeeMap.put(4, emp4);
	}
	
	public static Employer getTCSEmployer() {
		return new Employer("tcs","TCS");
	}
	
	public static Employer getInfosysEmployer() {
		return new Employer("infsys","InfoSYS");
	}
	public static Employer getGoogleEmployer() {
		return new Employer("google","Google");
	}
	
	public static Employer getdetltaEmployer() {
		return new Employer("delta","Delta");
	}
	
	
	public static Map<Integer,Employee> getAllEmployees(){
		return employeeMap;
	}
	
	
	public static Employee getEmployee(int empNumber){
		Employee emp=null;
		Set<Integer> keys=employeeMap.keySet();
		for(Integer i:keys) {
			if(employeeMap.get(i).getEmployeeNumber()==empNumber) {
				emp=employeeMap.get(i);
				return emp;
			}
		}		throw new IllegalArgumentException("Employee Record with Id "+empNumber+" Not Found");
	}

}
