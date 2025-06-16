package com.codegnan.inheritance;

import java.util.Scanner;

public class EmployeesInfo extends Employees {
	  double salaryPeryear;
	
	
	public EmployeesInfo() {
		super("", "", 0);
		
	}
	
	public void inputDetails() {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter employee name : ");
		super.employeeName = input.next();
		
		System.out.println("Enter designation : ");
		super.designation = input.next();
		
		System.out.println("Enter years of experience : ");
		super.yoExp = input.nextInt();
		
		System.out.println("Enter salary per year : ");
		salaryPeryear = input.nextDouble();
		input.close();
	}
	
	public double calculateSalary() {
		return salaryPeryear*yoExp;
	}
	
	
	public void displayDetails() {
		double res = calculateSalary();
		System.out.println("Employee name : "+employeeName);
		System.out.println("Designation : "+designation);
		System.out.println("Years of Experience : "+yoExp);
		System.out.println("Salary per year : "+salaryPeryear);
		System.out.println("Salary : "+res);
	}



}
