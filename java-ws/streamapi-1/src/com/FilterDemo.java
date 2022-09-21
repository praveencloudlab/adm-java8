package com;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalInt;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class FilterDemo {
	
	public static void main(String[] args) {
		
		List<Integer> numbers = Arrays.asList(1,10,45,87,12);
		
		
		/*
		List<Integer> even = numbers.stream().filter(n->(n%2==0))
				.map(n->n=n+10)
				.map(n->n*2)
				.map(n->n-5)
				.collect(Collectors.toList());
		List<Integer> odd = numbers.stream().filter(n->n%2!=0).collect(Collectors.toList());

		System.out.println(even);
		System.out.println(odd);
		
		System.out.println(numbers);
		*/
		
		//numbers.stream().filter(n->n>2); // conditions
		/*List<Integer> num1 = numbers.stream().map(n->n+10).collect(Collectors.toList()); // modification
		
		System.out.println(numbers);
		System.out.println(num1);
		*/
		
		//Stream Reduction
		
		OptionalInt reduced = IntStream.range(1, 4)
										.reduce((a, b) -> a + b); // reduced = 6 (1 + 2 + 3)
		
			//System.out.println(reduced);
		
			int reducedParams = Stream.of(1, 2, 3)
					  .reduce(10, (a, b) -> a + b, (a, b) -> {
					     return a + b;
					  }); 
			
			// System.out.println(reducedParams); // 16 (10 + 1 + 2 + 3)
			 
			 
			 // parallelStream
			 //----------------------
			 
			 
			 int reducedParallel = Arrays.asList(1, 2, 3).parallelStream()
					    .reduce(10, (a, b) -> a + b, (a, b) -> {
					       return a + b;
					    });
			 
			// System.out.println(reducedParallel);//10 + 1 = 11; 10 + 2 = 12; 10 + 3 = 13.. and (12 + 13 = 25; 25 + 11 = 36)
		
			 	
			 
			 
			 	Employee e1=new Employee(76, "AKg", 6000, "Male");
				Employee e2=new Employee(23, "Hdf", 1000, "Female");
				Employee e3=new Employee(11, "Sah", 4000, "Male");
				Employee e4=new Employee(87, "Jkj", 3000, "Male");
				Employee e5=new Employee(11, "Bjh", 2000, "Female");
				Employee e6=new Employee(12, "Gsd", 5000, "Male");
				
				List<Employee> emps = Arrays.asList(e1,e2,e3,e4,e5,e6);
				
				// display employee id only
				
				//emps.stream().forEach(System.out::println);
				//emps.forEach(emp->{
				//	System.out.println(emp.getEmpId());
				//});
				
				//emps.stream()
				//	.map(Employee::getEmpId)
				//	.forEach(System.out::println);
				
				// copy employee id's into a collection
				
				List<Integer> empIds = emps.stream()
				.map(Employee::getEmpId)
				//.limit(2)
				.collect(Collectors.toList());
				
				//System.out.println(empIds);
				
				// count number of employees
				
				//long count = emps.stream().count();
				//System.out.println(count);
				
				double salaryTotal = emps.stream()
						  			   .collect(Collectors.summingDouble(Employee::getSalary));
				
				//System.out.println(salaryTotal);
				
				
				List<Integer> asList = Arrays.asList(10,20,30);
				Integer total = asList.stream().collect(Collectors.summingInt(sum->sum));
				
				//System.out.println(total);
				
				emps.stream().mapToDouble(e->e.getSalary())
							.forEach(System.out::println);

				
				
				
	
	
	}

}
