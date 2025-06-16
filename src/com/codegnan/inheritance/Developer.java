package com.codegnan.inheritance;

public class Developer extends Employee{

	String programmingLanguage;
	
	Developer(String name, double salary, String programmingLanguage){
		this.name= name;
		this.salary=  salary;
		this.programmingLanguage= programmingLanguage;
	}
	
	public void displayDetails() {
		System.out.println("Developer name : "+name);
		System.out.println("Developer salary : "+salary);
		System.out.println("Developers language : "+programmingLanguage);
	}
	
}
