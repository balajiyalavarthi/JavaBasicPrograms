package com.codegnan.fileIOStreams;

import java.io.Serializable;

public class EmployeeSerializable implements Serializable {

	int empId;
	String empName;
	double empSalary;
	String empLocation;

	public EmployeeSerializable(int empId, String empName, double empSalary, String empLocation) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empSalary = empSalary;
		this.empLocation = empLocation;
	}

	@Override
	public String toString() {
		return "EmployeeSerializable [empId=" + empId + ", empName=" + empName + ", empSalary=" + empSalary
				+ ", empLocation=" + empLocation + "]";
	}
	
	public void display() {
		System.out.println("Employee ID : "+empId);
		System.out.println("Employee Name : "+empName);
		System.out.println("Employee Salary : "+empSalary);
		System.out.println("Employee Location : "+empLocation);
	}

}
