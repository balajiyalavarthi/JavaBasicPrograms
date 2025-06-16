package com.codegnan.constructors;

public class Human {
	//instance variables
		String name;
		int age;
	//default constructor
	public Human() {
		System.out.println("I am Human 1");
	}
	
	//parameterized constructor
	Human(String firstname, int year, int weight) {
		this.name =  firstname;
		this.age =  year;
		System.out.println("I am Human 2");
		System.out.println("I am "+firstname+" and i am "+year+" old!");
		System.out.println("My weight is : "+weight);
	}
	
	
	
	Human(String name, int age) {
		this.name =  name;
		this.age= age;
		System.out.println("I am Human 3");
		System.out.println("I am "+name+" and i am "+age+" old!");
	}
	
}
