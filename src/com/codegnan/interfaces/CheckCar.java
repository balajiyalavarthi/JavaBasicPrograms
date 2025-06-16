package com.codegnan.interfaces;

public class CheckCar {

	public static void main(String[] args) {
		Car1 checkCar1 = new Car1();
		
		checkCar1.watchMovie();
		checkCar1.listenMusic();
		checkCar1.turn();
		checkCar1.left();
		checkCar1.right();
		
		// accessing only vehicle methods
		System.out.println("----------Checking car 2--------------");
		Vehicle checkCar2=  checkCar1;
		checkCar2.left();
		checkCar2.right();
		checkCar2.turn();
		
		System.out.println("----------Checking car 3--------------");
		Entertainment checkCar3=  checkCar1;
		checkCar3.watchMovie();
		checkCar3.listenMusic();
	}

}
