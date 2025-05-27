package com.codegnan.java_practice;

import java.util.Scanner;

public class FibonaciiSeries {
	static int num;
	public static int seriesGenerator(int fib0, int fib1, int i) {
		
		
		if(i > num) {
			return fib1;
		}
		System.out.println(fib0);
		
		
		int temp  = fib0;
		fib0 = fib1;
		fib1 = temp + fib1;
		
		
		
		
		
		
		return seriesGenerator(fib0, fib1, i+ 1);
		
	}

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number to print fibonacci series upto that number : ");
		num = input.nextInt();
		
		System.out.println("Series is : "+seriesGenerator(0, 1, 0));

	}

}
