package com.codegnan.java_practice;

import java.util.Scanner;

public class ShapeShiftingChallenge {

	public double calculateArea(int radius) {
		double pi = Math.PI;
		double area = pi * radius * radius;
		return area;
	}

	public double calculateArea(int length, int width) {
		double area = length * width;
		return area;
	}

	public double calculateArea(double base, double height) {
		double area = 0.5 * base * height;
		return area;
	}

	public static void main(String[] args) {
		ShapeShiftingChallenge shape = new ShapeShiftingChallenge();
		System.out.println();
		System.out.println();
		System.out.println("   Area Calculator ");
		System.out.println(" Option 1 : Circle ");
		System.out.println(" Option 2 : Rectangle ");
		System.out.println(" Option 3 : Triangle ");
		System.out.println(" Option 4 : Exit ");
		
		System.out.println();
		Scanner input = new Scanner(System.in);
		System.out.println("Enter your choice : ");
		byte choice = input.nextByte();

		switch (choice) {

		case 1:
			System.out.println("Enter radius of the circle : ");
			int radius = input.nextInt();
			System.out.println("Area of circle is : " + shape.calculateArea(radius));
			break;
		case 2:
			System.out.println("Enter length of a rectangle : ");
			int length = input.nextInt();
			System.out.println("Enter width of a rectangle : ");
			int width = input.nextInt();
			System.out.println("Area of a rectangle is : " + shape.calculateArea(length, width));
			break;
		case 3:
			System.out.println("Enter base of  triangle : ");
			double base = input.nextDouble();
			System.out.println("Enter height of  triangle : ");
			double height = input.nextDouble();
			System.out.println("Area of triangle is : " + shape.calculateArea(base, height));
			break;

		case 4:
			System.out.println("Thank you");
			break;
		default :
			System.out.println("Invalid choice");
		}
		input.close();
	}

}
