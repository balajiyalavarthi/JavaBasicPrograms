package com.codegnan.fundamentals;

import java.util.Scanner;

public class CheckOddOREven {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter your number : ");
		int number = input.nextInt();
		input.close();
		String res = number%2 == 0?"Even":"Odd"; 
		System.out.println("Result : "+res);
	}

}
