package com.codegnan.recursion;

import java.util.Scanner;

public class FactorialUsingRecursion {

	public static int factorial(int n) {
		if(n == 0 || n== 1) {
			return 1;
		}
		
		int res = n*factorial(n-1);
		return res;
	}
	
	public static void main(String[] args) {
		
		Scanner input =  new Scanner(System.in);
		
		System.out.println("Enter a number : ");
		int num = input.nextInt();
		
		int result = factorial(num);
		System.out.println("Factorial of given number is  : "+result);
		input.close();
		
	}

}
