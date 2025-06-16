package com.codegnan.oop;

public class Rectangle {

	double length;
	double breadth;
	
	public void setDimensions(double l, double b) {
		length = l;
		breadth = b;
	}
	
	public double area() {
		return length*breadth;
	}
	
	public double perimeter() {
		return 2*(length+ breadth);
	}
	
	public void displayDetails() {
		System.out.println("Area of the given rectangle is : "+area());
		System.out.println("Perimeter of the given rectangle is : "+perimeter());
	}
}
