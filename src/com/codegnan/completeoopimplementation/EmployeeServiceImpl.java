package com.codegnan.completeoopimplementation;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeeServiceImpl implements EmployeeService {

	List<Employee> employeeList = new ArrayList<Employee>();
	
	// Adding employees manually
	@Override
	public Employee addEmployeeManually(Employee employee) {
		employeeList.add(employee);
		System.out.println("Employee added to list successfully "+employee);
		return employee;
	}

	
	// optional method
	// Adding employees through user input 
	@Override
	public void addEmployee() {

		// Scanner class
		Scanner input = new Scanner(System.in);

		// variable to stop or continue of taking employee inputs
		String command;

		// Using do while loop for getting multiple employees input
		do {
			// user enters employee id
			System.out.println("Enter employee id : ");
			int empId = input.nextInt();

			// user enters employee name
			System.out.println("Enter employee name : ");
			String empName = input.next();

			// user enters employee salary
			System.out.println("Enter employee salary : ");
			double empSalary = input.nextDouble();

			/*
			 * by using employee class constructor the id,name, salary will be initiated
			 */

			Employee employee = new Employee(empId, empName, empSalary);
			employeeList.add(employee);

			System.out.println("Employee added successfully!");
			System.out.println(employee);

			System.out.println("Do you want to add more employees enter 'y' ? if no enter quit : ");
			command = input.next();

		} while (!command.equals("quit"));

		input.close();

	}

	
	//deleting existing employees
	@Override
	public Employee deleteEmployee(int id) {
		for(Employee e:employeeList) {
			if(e.getId() == id) {
				employeeList.remove(id);	
				System.out.println("employee deleted");
			}
		}
		return null;
		
	}

	
	//returns employee Detials by taking id
	@Override
	public Employee getEmployeeById(int id) {
		for(Employee e:employeeList) {
			if(e.getId() == id) {
				return e;
			}
		}
		return null;
	}

	
	//updates employee details  based on id
	@Override
	public Employee updateEmployee(Employee employee) {
		
		return null;
	}

	
	//returns all employee details 
	@Override
	public List<Employee> getAllEmployeeDetails() {
		return employeeList;
	}


}
