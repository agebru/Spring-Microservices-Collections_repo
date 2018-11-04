package com.me.coreJava;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Stream;

import com.me.coreJava.repo.OfficeRecord;

public class OfficeApplication {

	

	public static void main(String[] args) {
		
		
		// return all employees working in officeNumber: DL-1020
		
		//Office office = OfficeRecord.Alloffices().get(10);
		//System.out.println(office);
		int numEmployees=0;
		
		// how many Employees work in office DL-1020
		Map<Integer, Office> alloffices = OfficeRecord.Alloffices();
		
		
		
		for(Entry<Integer,Office> officeMap:alloffices.entrySet()) {
			 Integer key = officeMap.getKey();
			 Office officeValue = officeMap.getValue();
			 if(officeValue.getOfficeNumber().equals("DL-1020")) {
				 
				 numEmployees= officeValue.getEmployees().size();
				officeValue.getEmployees().stream().forEach(System.out::println);
				break;
			 }
			
		}
		
		System.out.println("Number of Employees in Department: DL-1020 ==> "+numEmployees);
		
		
		
		
		// return all employees working in OfficeNumber: DL-1030
          System.out.println("\n Employees Working in DL-1030");
		for(Entry<Integer,Office> officeMap:alloffices.entrySet()) {
			 Integer key = officeMap.getKey();
			 Office officeValue = officeMap.getValue();
			 if(officeValue.getOfficeNumber().equals("DL-1030")) {
				 
				 numEmployees= officeValue.getEmployees().size();
				officeValue.getEmployees().stream().forEach(System.out::println);
				break;
			 }
			
		}
		
		System.out.println("Number of Employees in Department: DL-1030 ==> "+numEmployees);
		
		
		
		// Display the salaries of Employees working in Office DL-1020 and their Bonus salaries
		System.out.println("\nAll Offices in DL-1030\n============================");
		Map<Integer, Office> allOfficesMap = OfficeRecord.Alloffices();
		List<Office> officesList=new ArrayList<Office>(allOfficesMap.values());
	
		 Office office = officesList.stream().filter(off->off.getOfficeNumber().equals("DL-1030")).findFirst().get();
		 List<Employee> employees = office.getEmployees();
		 employees.stream().forEach(System.out::println);
		 
		 // find All employees Bonus working in DL-1030
		 
		  for(Employee em:employees) {
			 System.out.println(em.getFirstName()+" ==> Bonus: "+em.employeeAnnualBonus() +" Total Salary: "+em.totalSalaryWithBonus()); 
		  }
		
		
		
		
		
		
	}

}

