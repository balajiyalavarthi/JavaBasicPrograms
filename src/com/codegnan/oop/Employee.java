package com.codegnan.oop;

public class Employee {
	 private int empId;
	 private String name;
	 private double salary;
	
	
	public int getEmpId() {
		return empId;
	}


	public void setEmpId(int empId) {
		this.empId = empId;
	}


	


	public Employee(int empId, String name, double salary) {
		super();
		this.empId = empId;
		this.name = name;
		this.salary = salary;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public double getSalary() {
		return salary;
	}


	public void setSalary(double salary) {
		if(salary >0) {
			this.salary = salary;
		}else {
			System.out.println("Salary must be positive");
		}
		
	}
	
	public void displayDetails() {
		System.out.println("Employee details : ");
		System.out.println("salary : "+getEmpId());
		System.out.println("Name : "+getName());
		System.out.println("salary : "+getSalary());
	}
	
	
	
}
