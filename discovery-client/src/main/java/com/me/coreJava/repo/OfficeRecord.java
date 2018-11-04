package com.me.coreJava.repo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import com.me.coreJava.Address;
import com.me.coreJava.Employee;
import com.me.coreJava.Office;

public class OfficeRecord {

	private static Map<Integer,Office> officeMap=new HashMap<>();
	static {
		
		
		// first offie
		Office mainOffice=new Office();
		mainOffice.setLocation("Main building");
		mainOffice.setOfficeNumber("DL-1020");
		mainOffice.setEmployees(new ArrayList<Employee>(EmployeeRecord.getAllEmployees().values()));
		
		officeMap.put(10, mainOffice);
		
		
		
		// second office
		
		Office creditOffice=new Office();
		creditOffice.setLocation("Credit building");
		creditOffice.setOfficeNumber("DL-1030");
		
		Map<Integer,Employee> creditOfficeMap=EmployeeRecord.getAllEmployees();
		
		
		Map<Integer,Employee> newCreditOfficeMap=new HashMap<>();
		 for(Entry<Integer,Employee> entry:creditOfficeMap.entrySet()) {
			Integer keyVal=entry.getKey();
			if(keyVal==3) {
				Employee emp=entry.getValue();
				emp.setFirstName("Kunom");
				emp.setSalary(70000.5);
				emp.getAddresses().set(1, new Address(30010,"Alpharetta street"));
				emp.getAddresses().set(2, new Address(30020,"Alpharetta bridge"));
				
				newCreditOfficeMap.put(keyVal, emp);
			}
			
			else if(keyVal==4) {
				Employee emp=entry.getValue();
				emp.setFirstName("Belay");
				emp.setSalary(30000.5);
				emp.getAddresses().set(0, new Address(1111,"belay street"));
				
				newCreditOfficeMap.put(keyVal, emp);
				
			}
			 
		 }		
		creditOffice.setEmployees(new ArrayList<Employee>(newCreditOfficeMap.values()));
		
		officeMap.put(20, creditOffice);
		
		
	}
	
	
	public static Map<Integer,Office> Alloffices(){
		return officeMap;
	}
	
	
}
