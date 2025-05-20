package com.codegnan.controlstatements;

import java.util.Scanner;

public class MinimumDigitInANumber {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		//end user enters a number
		System.out.println("Enter a number : ");
		long num = input.nextLong();
		
		long min = 9;
		
		while(num > 0) {
			long lastDigit = num%10;
			if(lastDigit < min) {
				min = lastDigit;
			}
			num /=10;
		}
		
		System.out.println("Minimum number is : "+min);
		input.close();
	}

}
