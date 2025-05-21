package com.codegnan.recursion;

public class PerimeterCalculator {
	//
	public static double rectanglePerimeter(double length, double width) {
		double perimeter = 2*(length + width);
		return perimeter;
	}
	//
	public static double squarePerimeter(double side) {
		double perimeter = 4*side;
		return perimeter;
	}
	//
	public static int trianglePerimeter(int a, int b, int c) {
		int perimeter = a+ b+ c;
		return perimeter;
	}
	//
	public static double circlePerimeter(double radius) {
		double pi = 3.146;
		double perimeter = 2*pi*radius;
		return perimeter;
	}
	public static void main(String[] args) {
		
		System.out.println("Perimeter of rectangle is : "+(int)rectanglePerimeter(10, 20));
		System.out.println("Perimeter of Square is : "+(int)squarePerimeter(4));
		System.out.println("Perimter of triangle is : "+(int)trianglePerimeter(40, 30, 30));
		System.out.println("Perimeter of circle is : "+(int)circlePerimeter(20));
	}

}
