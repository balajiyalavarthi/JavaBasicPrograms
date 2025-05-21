package com.codegnan.recursion;

import java.util.Scanner;

public class SumOfTheDigitsUsingRecursion {

	public static int sumOfDigits(int n) {
		
		if(n == 0) {
			return 0;
		}
		
		return n%10 + sumOfDigits(n/=10);
	}
	public static void main(String[] args) {
		Scanner input =  new Scanner(System.in);
		System.out.println("Enter a number : ");
		int num = input.nextInt();
		
		System.out.println("Sum of the digits of "+num+" is : "+sumOfDigits(num));
	}

}
