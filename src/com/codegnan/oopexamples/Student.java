package com.codegnan.oopexamples;

public class Student {
	String name;
	int age;
	
	Student(String name,int age ){
		this.name =  name;
		this.age = age;
	}
	
	
	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + "]";
	}


	public static void main(String[] args) {
		Student s1 = new Student("Balu", 22);
		System.out.println(s1);//com.codegnan.oopexamples.Student@5ca881b5

	}

}
