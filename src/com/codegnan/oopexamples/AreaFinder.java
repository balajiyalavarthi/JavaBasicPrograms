package com.codegnan.oopexamples;

public class AreaFinder {

	public static void main(String[] args) {
		Figure defaultArea =  new Figure(1, 8);
		System.out.println(defaultArea.area());

		Rectangel rectangleArea = new Rectangel(1, 8);
		System.out.println(rectangleArea.area());
		
		Triangle TriangleArea = new Triangle(1, 8);
		System.out.println(TriangleArea.area());
		System.out.println("........................");
		Figure figureReference;
		figureReference= rectangleArea;
		System.out.println(figureReference.area());
		figureReference= TriangleArea;
		System.out.println(figureReference.area());
		figureReference =figureReference;
		System.out.println(figureReference.area());
		
		
		
		
	}

}
