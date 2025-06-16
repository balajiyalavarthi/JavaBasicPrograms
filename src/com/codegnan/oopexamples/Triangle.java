package com.codegnan.oopexamples;

public class Triangle extends Figure {

	public Triangle(int dim1, int dim2) {
		super(dim1, dim2);
		
	}

	@Override
	public double area() {
		System.out.print("Area of a triangle : ");
		return (dim1* dim2)/2;
	}
}

