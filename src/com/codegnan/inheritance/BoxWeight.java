package com.codegnan.inheritance;

public class BoxWeight extends Box {

	double weight;

	/*
	 * BoxWeight class is a child class of Box class. Now boxWeight class have
	 * rights to access the properties of Box class like l, w , h
	 */

	BoxWeight(double weight) {
		this.weight = weight;
	}

	BoxWeight(double l, double h, double w, double weight) {

		super(l,w,h); //calls the parent class constructor with three parameters
		
		/*
		 * Q: What happens if we don't mention super keyword without parameters ?
		 * A: super(); calls the default constrcutor available in parent class.
		 * 
		 * Q: What if there is no default constructor is initialized in parent class then what happens ? 
		 * A: Then jvm raises a compile error.
		 * 
		 */
//		super();
		this.weight = weight;
	}

}
