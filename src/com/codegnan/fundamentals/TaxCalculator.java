package com.codegnan.fundamentals;

import java.util.Scanner;

public class TaxCalculator {

	public static void main(String[] args) {
		Scanner input =new Scanner(System.in);
		
		System.out.println("Enter your Income : ");
		double income = input.nextDouble();
		
		double tax= income <=300000?0.5:(income>300000 &&income<=1000000)?0.10:(income>1000000 && income < 2000000)?0.15:0.14;
		System.out.println("Tax : "+tax);
		
		double taxAmount = income*tax;
		System.out.println("tax amount : "+taxAmount);
		
		double FinalAmount = income+taxAmount;
		
		System.out.println("Tax Amount to be paid : "+taxAmount);
		System.out.println("Final Amount to be paid : "+FinalAmount);
		input.close();
	}

}
