package com;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EmployeeOps {
	
	public static void main(String[] args) {
		
		Employee e1=new Employee(76, "AKg", 6000, "Male");
		Employee e2=new Employee(23, "Hdf", 1000, "Female");
		Employee e3=new Employee(11, "Sah", 4000, "Male");
		Employee e4=new Employee(87, "Jkj", 3000, "Male");
		Employee e5=new Employee(11, "Bjh", 2000, "Female");
		
		Employee e6=new Employee(12, "Gsd", 5000, "Female");
		
		List<Employee> employees = Arrays.asList(e1,e2,e3,e4,e5,e6);
		
		//employees.add(e6); // error
		
		//System.out.println(employees);
		
		// 1. convert employees into stream
		
		 Stream<Employee> emps = employees.stream();
		
		//employees.stream().forEach(System.out::println);
		
		// filter operations 
		
		// list only emps whose salary is >=5000 and store them in a collection
		// use filter method
		
		
		 List<Employee> filter1 = emps.filter(emp->emp.getSalary()>=5000).collect(Collectors.toList());
		
		 
		 //filter1.forEach(System.out::println);
		 Employee.displayList(filter1);
		 
		 System.out.println("------------------------------------------------------");
		 
		// employees.forEach(System.out::println);
		 
		 // filter method in detail : filter works wit with stream obj
		 
		 List<Employee> filter2 = emps.filter(emp->emp.getGender().equals("Female")).collect(Collectors.toList());
		
		 Employee.displayList(filter2);
		 
		 
		 
		long count = emps.filter(emp->emp.getGender().equals("Female"))
		.count();
		
		
		System.out.println(count);

		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
