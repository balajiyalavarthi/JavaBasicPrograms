package com.codegnan.constructors;

public class StudentDemo {

	public static void main(String[] args) {
		
		//Creating object of default constructor
		Student defaultStudent =  new Student();
		
		//checking default constructor
		System.out.println(defaultStudent.name);
		
		//Creating a object for parameterized constructor
		Student studentOne = new Student("balaji", 173, new int[3]);
		
		studentOne.displayDetails();
		System.out.println(studentOne.calculateTotal());
		System.out.println(studentOne.calculateAverage());
		
	}

}
