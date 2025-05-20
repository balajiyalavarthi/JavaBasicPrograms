package com.codegnan.fundamentals;

import java.util.Scanner;

public class SimpleIntrestCalculator {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Simple Intrest calculator : ");
		System.out.println("Enter your principla amount : ");
		double principal = input.nextDouble();
		System.out.println("Enter time period in years : ");
		int time = input.nextInt();
		System.out.println("Enter rate of intrest : ");
		double roi = input.nextDouble();
		
		input.close();
		
		double si = (principal*time*roi)/100;
		
		System.out.println("Simple interest : "+si);
		
		double amount = si+principal;
		System.out.println("Total amount including si : "+amount);
		

	}

}
