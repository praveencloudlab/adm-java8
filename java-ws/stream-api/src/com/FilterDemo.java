
package com;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterDemo {
	
	public static void main(String[] args) {
		
		Employee e1=new Employee(76, "AKg", 6000, "Male");
		Employee e2=new Employee(23, "Hdf", 1000, "Female");
		Employee e3=new Employee(11, "Sah", 4000, "Male");
		Employee e4=new Employee(87, "Jkj", 3000, "Male");
		Employee e5=new Employee(11, "Bjh", 2000, "Female");
		
		Employee e6=new Employee(12, "Gsd", 5000, "Female");
		
		List<Employee> employees = Arrays.asList(e1,e2,e3,e4,e5,e6);
		
		//Stream<Employee> emps = employees.stream();
		
		List<Employee> filter1 = employees.stream().filter(emp->emp.getSalary()>=5000).collect(Collectors.toList());
		List<Employee> filter2 = employees.stream().filter(emp->emp.getGender().equals("Female")).collect(Collectors.toList());
		
		
		System.out.println(filter1);
		System.out.println(filter2);
		
		
		
		
		
		
		
		
		
		
		
	}

}
