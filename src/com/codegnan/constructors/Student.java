package com.codegnan.constructors;

import java.util.Scanner;

public class Student {
	
	//instance variables
	String name;
	int rollno;
	int[] marks;
	
	//size of the array
	int size;
	
	// default constructor to intialize the variables to default
	Student() {
		this.name = "Unknown";
		this.rollno = 0;
		this.marks =  new int[] {0, 0, 0};
	}
	
	//parameterized constructor
	Student(String name, int rollno, int[] marks) {
		//
		Scanner input = new Scanner(System.in);
		
		this.name = name;
		this.rollno = rollno;
		
		//user enters number of subjects here
		System.out.println("Enter number of subjects : ");
		this.size =  input.nextInt();
		
		//new array is intialized with number of subjects
		this.marks = new int[this.size];
		
		//takes user marks of each subject
		for(int i= 0; i<size; i++) {
			System.out.println("Enter subject "+(i+1)+" marks : ");
			this.marks[i] = input.nextInt();
		}
		
		input.close();
	}
	
	// method to display the basic details of user
	public void displayDetails() {
		
		System.out.println("Name : " + name);
		System.out.println("Roll number : " + rollno);

		for (int subject : marks) {
			System.out.print("Subject : ");
			System.out.println(subject);
		}
	}

	
	//calculates sum of each subject marks
	public int calculateTotal() {
		int total = 0;
		
		for (int i : marks) {
			total += i;
		}
		
		return total;
	}
	
	//calculates average of the subject marks
	public double calculateAverage() {
		
		double avg = calculateTotal() / this.size;

		return avg;
	}

}
