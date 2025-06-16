package com.codegnan.constructors;

public class Box {

	double length, breadth, height;
	
	//default constructor
	Box(){
		length = 10;
		breadth = 10;
		height = 10;
	}
	
	//multiple parameterized constructor
	Box(double length, double breadth, double height){
		this.length =  length;
		this.breadth =  breadth;
		this.height =  height;
	}
	
	// single parameterized constructor
	Box(double singleParameter){
		length= singleParameter;
		breadth= singleParameter;
		height= singleParameter;
	}
	
	//copy constructor
	Box(Box obj){
		length= obj.length;
		breadth= obj.breadth;
		height= obj.height;
	}
	
	
	public int boxVolume() {
		System.out.print("Volume of the box is  : ");
		return (int)(length*breadth*height);
	}
}
