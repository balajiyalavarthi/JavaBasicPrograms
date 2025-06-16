package com.codegnan.oop;

public class ConstructorOverloadingDemo {

	public static void main(String[] args) {
		ConstructorOverloading o1= new ConstructorOverloading();
		o1.volume();
		
		ConstructorOverloading o2= new ConstructorOverloading(10,20,20);
		o2.volume();

		ConstructorOverloading o3= new ConstructorOverloading(10);
		o3.volume();
	}

}
