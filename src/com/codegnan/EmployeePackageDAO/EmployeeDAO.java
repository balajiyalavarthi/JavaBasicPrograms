package com.codegnan.EmployeePackageDAO;

import java.util.List;


import com.codegnan.EmployeeExceptionHandling.EmployeeNotFoundException;
import com.codegnan.EmployeePackageDTO.*;


public interface EmployeeDAO {
	public void save(Employee employee);
	public List<Employee> findAll();
	public Employee findById(int id)throws EmployeeNotFoundException;
	public Employee update(Employee employee)throws EmployeeNotFoundException;
	public void deleteByID(int id) throws EmployeeNotFoundException;
}
