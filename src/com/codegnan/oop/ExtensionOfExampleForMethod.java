package com.codegnan.oop;

public class ExtensionOfExampleForMethod {

	public static void main(String[] args) {
		// Box1 volume
		ExampleForMethod obj = new ExampleForMethod();
		obj.height = 110.00;
		obj.width = 210.00;
		obj.length = 100.00;

		System.out.println();
		System.out.println("Height of the box is : " + obj.height);
		System.out.println("width of the box is : " + obj.width);
		System.out.println("Length of the box is : " + obj.length);
		System.out.println();
		obj.volumeCalculator();
		
		// Box1 volume
		ExampleForMethod obj2 = new ExampleForMethod();
		obj2.height = 30.00;
		obj2.width = 40.00;
		obj2.length = 90.00;

		System.out.println();
		System.out.println("Height of the box is : " + obj2.height);
		System.out.println("width of the box is : " + obj2.width);
		System.out.println("Length of the box is : " + obj2.length);
		System.out.println();
		obj2.volumeCalculator();

		WithparametersWithoutReturnType ob = new WithparametersWithoutReturnType();
		ob.BoxVolume(10, 20, 30);
	}

}
