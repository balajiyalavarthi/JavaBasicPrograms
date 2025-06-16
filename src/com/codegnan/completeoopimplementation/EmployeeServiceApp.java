package com.codegnan.completeoopimplementation;

public class EmployeeServiceApp {

	public static void main(String[] args) {
		EmployeeServiceImpl employeeService = new EmployeeServiceImpl();

////		emp.addEmployee();
//		System.out.println("All employee list  : ");
////		System.out.print(emp.getAllEmployeeDetails());
//		
		/*Adding employees
		-----------------------------------------------------------------------*/
		
		employeeService.addEmployeeManually(new Employee(1, "Balaji", 200000));
		employeeService.addEmployeeManually(new Employee(2, "Arjun", 300000));
		employeeService.addEmployeeManually(new Employee(3, "Siddarth", 400000));
		employeeService.addEmployeeManually(new Employee(4, "Nandhan", 500000));
		employeeService.addEmployeeManually(new Employee(5, "Mugdha", 600000));
		
		/*-----------------------------------------------------------------------
		Display All employees details*/
		System.out.println("All employees list");
		for (Employee employee : employeeService.getAllEmployeeDetails()) {
			System.out.println(employee);
		}
		/*-----------------------------------------------------------------------
		/Get employee details through id*/
		System.out.println("Get employee details through id : ");
		Employee FindIdService = employeeService.getEmployeeById(2);

		if (FindIdService == null) {
			System.out.println("No Employee found ");
		} else {
			System.out.println("Employee  found");
			System.out.println(FindIdService);
		}
		/*Delete employee details through id
		------------------------------------------------------------------------*/
		System.out.println("Deleting employee by id ");
		Employee DeleteEmployeeService = employeeService.deleteEmployee(5);
		if (DeleteEmployeeService == null) {
			System.out.println("Employee not found");
			System.out.println("Following are the employees details Check the input id");
			for (Employee employee : employeeService.getAllEmployeeDetails()) {
				System.out.println(employee);
			}
		} else {
			System.out.println(DeleteEmployeeService);
		}
		/*Update employee details through id
		------------------------------------------------------------------------*/
		System.out.println("Update employee by id : ");
		
		

	}

}
