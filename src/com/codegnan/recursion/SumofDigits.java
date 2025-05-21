package com.codegnan.recursion;

import java.util.Scanner;

public class SumofDigits {

	public int DigitsSum(int n) {
		int sum = 0;
		while (n > 0) {
			int lastDigit = n % 10;
			sum +=lastDigit;
			n /=10;
		}
		return sum;
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int num = input.nextInt();
		
		SumofDigits object = new SumofDigits();
		System.out.println("Sum of the digits in "+num+" is "+object.DigitsSum(num));
	}

}
