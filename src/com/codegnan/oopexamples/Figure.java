package com.codegnan.oopexamples;

public class Figure {
	// instance variables
	double dim1;
	double dim2;

	public Figure(int dim1, int dim2) {
		this.dim1 = dim1;
		this.dim2 = dim2;
	}

	//Overriden method
	public double area() {
		System.out.println("Area not calculated");
		return 0;
	}
}
