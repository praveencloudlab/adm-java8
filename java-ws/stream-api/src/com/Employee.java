package com;

import java.util.List;
import java.util.stream.Stream;

public class Employee {
	private int empId;
	private String empName;
	private double salary;
	private String gender;
	
	public Employee() {
		// TODO Auto-generated constructor stub
	}

	public Employee(int empId, String empName, double salary, String gender) {
		this.empId = empId;
		this.empName = empName;
		this.salary = salary;
		this.gender = gender;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", salary=" + salary + ", gender=" + gender + "]";
	}
	
	
	public static void display(Stream<Employee> emps) {
		emps.forEach(System.out::println);
	}
	
	public static void displayList(List<Employee> emps) {
		emps.forEach(System.out::println);
	}
	
	

}
