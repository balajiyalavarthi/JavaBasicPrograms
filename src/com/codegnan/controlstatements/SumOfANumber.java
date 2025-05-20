package com.codegnan.controlstatements;

import java.util.Scanner;

public class SumOfANumber {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		// takes number from end user.
		System.out.println("Enter a number : ");
		int num = input.nextInt();
		
		int total = 0;
		input.close();
		
		while(num > 0) {
			int last_digit = num%10;
			total+=last_digit;
			num = (int)num/10;
		}
		
		System.out.println();
		System.out.println("Sum of digits : "+total);
	}

}
