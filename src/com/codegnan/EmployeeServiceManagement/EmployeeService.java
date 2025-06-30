package com.codegnan.EmployeeServiceManagement;

import java.util.List;


import com.codegnan.EmployeeExceptionHandling.EmployeeNotFoundException;
import com.codegnan.EmployeePackageDTO.Employee;


public interface EmployeeService {

	public void addEmmployee(Employee employee);

	public List<Employee> getAllEmployee();

	public Employee getEmployeeById(int id) throws EmployeeNotFoundException;

	public Employee updateEmployee(Employee employee) throws EmployeeNotFoundException;

	public void deleteEmployee(int id) throws EmployeeNotFoundException;
}
