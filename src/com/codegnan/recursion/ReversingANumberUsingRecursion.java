package com.codegnan.recursion;

import java.util.Scanner;

public class ReversingANumberUsingRecursion {

	int result = 0;

	public int reverseNumber(int n) {

		if (n == 0) {
			return result;
		}
		result = result * 10 + n % 10;
		return reverseNumber(n / 10);
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int num = input.nextInt();

		ReversingANumberUsingRecursion object = new ReversingANumberUsingRecursion();
		int result = object.reverseNumber(num);
		System.out.println("Reversed number: " + result);
		input.close();
	}
}
