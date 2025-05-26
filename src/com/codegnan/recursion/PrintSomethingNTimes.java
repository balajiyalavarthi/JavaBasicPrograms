package com.codegnan.recursion;

import java.util.Scanner;

public class PrintSomethingNTimes {

	public static int repeatSomething(int num) {
		if(num == 10) {
			return 10;
		}
		System.out.println(num);
		num++;
		return repeatSomething(num);
	}
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int n= input.nextInt();
		System.out.println(repeatSomething(n));
		

	}

}
