package com.codegnan.constructors;

public class BoxDemo {

	public static void main(String[] args) {
		//default constructor
		Box o  =  new Box();
		System.out.println(o.boxVolume());
		
		//multiple parameter constrcutor
		Box o1 = new Box(10,5,5);
		System.out.println(o1.boxVolume());
		
		//single parameter constructor
		Box o2 = new Box(7);
		System.out.println(o2.boxVolume());
		
		//copy constructor
		Box o3 =  new Box(o2);
		System.out.println(o3.boxVolume());
	}

}
