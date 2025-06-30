package com.codegnan.EmployeeServiceManagement;

import java.util.List;


import com.codegnan.EmployeeExceptionHandling.EmployeeNotFoundException;
import com.codegnan.EmployeePackageDAO.EmployeeDAO;
import com.codegnan.EmployeePackageDAO.EmployeeDAOImplementation;
import com.codegnan.EmployeePackageDTO.Employee;

public class EmployeeServiceImplementation implements EmployeeService {

	EmployeeDAO employeeDao = new EmployeeDAOImplementation();
	
	@Override
	public void addEmmployee(Employee employee) {
		employeeDao.save(employee);
		System.out.println("Employee Added "+employee);
		
	}

	@Override
	public List<Employee> getAllEmployee() {
		
		return employeeDao.findAll();
	}

	@Override
	public Employee getEmployeeById(int id) throws EmployeeNotFoundException {
		
		return employeeDao.findById(id);
	}

	@Override
	public Employee updateEmployee(Employee employee) throws EmployeeNotFoundException {
		
		return employeeDao.update(employee);
	}

	@Override
	public void deleteEmployee(int id) throws EmployeeNotFoundException {
		employeeDao.deleteByID(id);
		
	}

}
