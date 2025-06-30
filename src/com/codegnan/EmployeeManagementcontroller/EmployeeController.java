package com.codegnan.EmployeeManagementcontroller;

import com.codegnan.EmployeePackageDTO.Employee;


import com.codegnan.EmployeePackageDAO.EmployeeDAOImplementation;
import com.codegnan.EmployeeExceptionHandling.EmployeeNotFoundException;
import com.codegnan.EmployeePackageDAO.EmployeeDAO;
import com.codegnan.EmployeeServiceManagement.EmployeeService;
import com.codegnan.EmployeeServiceManagement.EmployeeServiceImplementation;
import java.util.*;

public class EmployeeController {

	public static void main(String[] args) {
		EmployeeService service =  new EmployeeServiceImplementation();
		
		service.addEmmployee(new Employee(001, "Balu", 10_00_000));
		service.addEmmployee(new Employee(002, "Arjun", 2_00_000));
		service.addEmmployee(new Employee(003, "Siddarth", 3_00_000));
		service.addEmmployee(new Employee(004, "Nandha", 5_00_000));
		service.addEmmployee(new Employee(005, "Mugdha", 7_00_000));
		
		System.out.println("         ALL EMPLOYEES         ");
		System.out.println("===============================");
		List<Employee>employees = service.getAllEmployee();
		
		for(Employee emp : employees) {
			System.out.println(emp);
		}
		
		//
		System.out.println("Get Employee details for ID 2");
		
		try {
			Employee emp  = service.getEmployeeById(5);
			System.out.println("Employee Details : "+emp);
		}catch(EmployeeNotFoundException e) {
			e.printStackTrace();
		}
		
		//
		
		System.out.println("Update the employee details");
		
		try {
			Employee updatedEmployee = service.updateEmployee(new Employee(001,"Balu", 12_00_000));
			System.out.println("Employee details updated successfully");
			System.out.println(updatedEmployee);
			
		} catch (EmployeeNotFoundException e) {
			
			e.printStackTrace();
		}
		
		//Delete Employee with Id
		try {
			service.deleteEmployee(4);
			System.out.println("Deleted Successfully");
		} catch (EmployeeNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//
		for(Employee emp : employees) {
			System.out.println(emp);
		}
		
		
		
		
	

	}

}
