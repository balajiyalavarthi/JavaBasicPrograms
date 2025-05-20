package com.codegnan.controlstatements;

import java.util.Scanner;

public class MaxDigitInANumber {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a number : ");
		long num = input.nextLong();
		
		long max = 0;
		
		while(num > 0) {
			long lastDigit = num%10;
			if(lastDigit > max) {
				max = lastDigit;
			}
			num /=10;
		}
		System.out.println("Maximum number is : "+max);
		input.close();
	}

}
