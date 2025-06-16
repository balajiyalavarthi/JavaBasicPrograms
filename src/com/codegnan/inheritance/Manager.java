package com.codegnan.inheritance;

public class Manager extends Employee{

	String department;
	public Manager(String name,double salary, String department){
		this.name= name;
		this.salary=  salary;
		this.department= department;
	}
	
	public void displayDetails() {
		System.out.println("Manager name  : "+ name);
		System.out.println("Manager salary : "+ salary);
		System.out.println("Manager department : "+department);
	}
	
}
