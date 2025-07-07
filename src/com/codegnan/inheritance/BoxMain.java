package com.codegnan.inheritance;

public class BoxMain {

	public static void main(String[] args) {
		
		
		Box box1 = new Box(); // calls the default constructor in box class
		System.out.println(box1.l+" "+box1.w+" "+box1.h+" ");
		
		Box box2 =  new Box(10); // calls the constructor with one parameter in parent class
		System.out.println(box2.l+" "+box2.w+" "+box2.h+" ");
		
		Box box3 =  new Box(10, 20 , 40); // calls the constructor with three parameters in parent class
		System.out.println(box3.l+" "+box3.w+" "+box3.h+" ");
		
		Box box4 =  new Box(box3); // calls the constrcutor with parameter of box object
		System.out.println(box4.l+" "+box4.w+" "+box4.h+" ");
		
		/*
		 * BoxWeight class
	    */
		
		BoxWeight box5 = new BoxWeight(100);
		System.out.println(box5.l+" "+box5.w+" "+box5.h+" "+box5.weight);

		//In the above code Boxweight is accessing the properties of Box class.
		
		BoxWeight box6 =  new BoxWeight(10, 20, 30 ,40);
		System.out.println(box6.l+" "+box6.w+" "+box6.h+" "+box6.weight);
		
		
	}
}
