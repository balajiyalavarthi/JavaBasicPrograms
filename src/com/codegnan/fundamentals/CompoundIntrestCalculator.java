package com.codegnan.fundamentals;

import java.util.Scanner;

public class CompoundIntrestCalculator {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("------ Compound Interest Calculator -----");
		System.out.println("Enter principal amount : ");
		double principal = input.nextDouble();
		System.out.println("Enter Rate of intrest : ");
		double roi = input.nextDouble();
		
		roi = roi/100;
		
		System.out.println("Enter time period in months : ");
		int months = input.nextInt();
		
		double years = months/12;
		
		System.out.println("years : "+years);
		
		System.out.println("Description of n value");
		System.out.println("to calculate compound intrest Anually enter 1");
		System.out.println("to calculate compound intrest Half yearly enter 2");
		System.out.println("to calculate compound intrest Quarterly enter 4");
		System.out.println("to calculate compound intrest Monthly enter 12");
		System.out.println("to calculate compound intrest Weekly enter 52");
		System.out.println("to calculate compound intrest Daily enter 365");
		System.out.println();
		System.out.println("Enter n value : ");
		int n = input.nextInt();
		
		
		double amount = principal*Math.pow((1+(roi/n)),years*n);
		double compoundIntrest = amount - principal;
		System.out.println("Compound intrest : "+(int)compoundIntrest);
		System.out.println("Amount including compound intrest : "+(int)amount);
		input.close();
	}

}
