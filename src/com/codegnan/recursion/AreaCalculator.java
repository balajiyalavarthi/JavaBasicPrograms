package com.codegnan.recursion;

public class AreaCalculator {
	//
	public static int squareAreaCalculator(int side) {
		int area = side * side;
		return area;
	}
	//
	public static double rectangleAreaCalcultor(double length, double width) {
		double area = length*width;
		return area;
	}
	//
	public void circleCalculator() {
		double radius = 10;
		double pi = 3.146;
		double area = pi*radius*radius;
		System.out.println("Area of circle is : "+area);
	}
	//
	public double triangleAreaCalculator(double base, double height) {
		double area = 0.5*base*height;
		return area;
	}

	public static void main(String[] args) {
		
		
		AreaCalculator object =  new AreaCalculator();
		//
		System.out.println("Area of sqaure is : "+squareAreaCalculator(10));
		//
		System.out.println("Area of traingle is : "+object.triangleAreaCalculator(10, 20));
		//
		object.circleCalculator();
		//
		System.out.println("Area of rectangle is : "+AreaCalculator.rectangleAreaCalcultor(10, 20));
		
	}

}
