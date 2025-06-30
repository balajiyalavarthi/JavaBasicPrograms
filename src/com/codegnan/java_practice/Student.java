package com.codegnan.java_practice;

import java.util.Scanner;

public class Student {

	
	int rno;
	String name;
	int marks;
	
	
	Student(){
		Scanner input = new Scanner(System.in);
		System.out.println("Enter Student roll number : ");
		this.rno = input.nextInt();
		System.out.println("Enter Student name : ");
		this.name = input.next();
		System.out.println("Enter Student marks : ");
		this.marks = input.nextInt();
	}
	
	
	
	
	public Student(int rno, String name, int marks) {
		super();
		this.rno = rno;
		this.name = name;
		this.marks = marks;
	}




	@Override
	public String toString() {
		return "Student [rno=" + rno + ", name=" + name + ", marks=" + marks + "]";
	}
	
	
	
}
