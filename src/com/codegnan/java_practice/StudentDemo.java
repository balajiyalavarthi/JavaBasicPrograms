package com.codegnan.java_practice;

import java.util.ArrayList;

public class StudentDemo {

	public static void main(String[] args) {
		
		ArrayList<Student> studentsList = new ArrayList<Student>();
		Student s1 = new Student();
		
		Student s2 = new Student(2, "balaji", 100);
		Student s3 = new Student(3, "balu", 100);
		Student s4 = new Student(4, "yalavarthi", 100);
		
		
		
		studentsList.add(s1);
		studentsList.add(s2);
		studentsList.add(s3);
		studentsList.add(s4);
		
		
		for (Student student : studentsList) {
			System.out.println(student);
		}
	}

}
