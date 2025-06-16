package com.codegnan.completeoopimplementation;

import java.util.List;

public interface EmployeeService {

	public void addEmployee();
	
	public Employee addEmployeeManually(Employee employee);

	public Employee deleteEmployee(int id);

	public Employee updateEmployee(Employee employee);

	public Employee getEmployeeById(int id);

	public List<Employee> getAllEmployeeDetails();

}
