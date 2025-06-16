package com.codegnan.oop;

import java.util.Scanner;

public class CarRentalDemo {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		CarRentalSystem car1 =  new CarRentalSystem();
		System.out.print("Enter car model : ");
		car1.setModel(input.next());
		System.out.print("enter year : ");
		car1.setYear(input.nextInt());
		System.out.println("Manufacturing Details : ");
		System.out.println("Model : "+car1.getModel());
		System.out.println("Year : "+car1.getYear());
		

	}

}
