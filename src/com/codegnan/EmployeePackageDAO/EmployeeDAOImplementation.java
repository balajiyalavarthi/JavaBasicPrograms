package com.codegnan.EmployeePackageDAO;


import java.util.*;

import com.codegnan.EmployeeExceptionHandling.EmployeeNotFoundException;
import com.codegnan.EmployeePackageDTO.*;
public class EmployeeDAOImplementation implements EmployeeDAO {

	
	//employeeList is created to store all employee objects
	List<Employee> employeeList =  new ArrayList<>();
	
	
	//Add employee object to the employeeList
	@Override
	public void save(Employee employee) {
		employeeList.add(employee);
		
	}

	//returns all employee details available in employeeList
	@Override
	public List<Employee> findAll() {
		
		return employeeList;
	}

	
	
	@Override
	public Employee findById(int id) throws EmployeeNotFoundException {
		for(Employee e: employeeList) {
			if(e.getId() == id) {
				return e;
			}
		}
		throw new EmployeeNotFoundException("Employee with id: "+id+" not found");
	}

	@Override
	public Employee update(Employee employee) throws EmployeeNotFoundException {
		for(int i = 0; i<employeeList.size(); i++) {
			if(employeeList.get(i).getId() == employee.getId()) {
				employeeList.set(i, employee);
				return employee;
			}
		}
		throw new EmployeeNotFoundException("Employee with id "+employee.getId()+" is not available cannot update");
	}

	@Override
	public void deleteByID(int id) throws EmployeeNotFoundException {
		boolean found = false;
		for(int i =0; i<employeeList.size(); i++) {
			if(employeeList.get(i).getId() == id) {
				employeeList.remove(i);
				found = true;
			}
			
			
		}
		
		if(!found) {
			throw new EmployeeNotFoundException("Employee with id "+id+" not available cannot delete");
		}
		
	}

}
