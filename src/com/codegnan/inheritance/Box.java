package com.codegnan.inheritance;

public class Box {

	// instance variables or class variables
	double l;
	double w;
	double h;

	// for instance varibles instantiation is compulsory.
	// So, use constructors to instantaite the variables l, w, h.

	
	
	// empty constructor or default constructor
	Box() {
		super(); // calls the object class
		this.l = -1;
		this.w = -1;
		this.h = -1;
	}

	// Single parameter constructor.
	Box(double side) {
		this.l = side;
		this.w = side;
		this.h = side;
	}

	
	
	// constructor with multi parameters
	Box(double l, double w, double h) {
		this.l = l;
		this.w = w;
		this.h = h;
	}

	Box(Box b) {
		this.l = b.l;
		this.w = b.w;
		this.h = b.h;
	}

}
