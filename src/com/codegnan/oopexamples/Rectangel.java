package com.codegnan.oopexamples;

public class Rectangel extends Figure {

	public Rectangel(int dim1, int dim2) {
		super(dim1, dim2);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public double area() {
		System.out.print("Area of a rectangle : ");
		return dim1* dim2;
	}

	
}
