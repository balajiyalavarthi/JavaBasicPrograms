package com.codegnan.controlstatements;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number to find factorial of a number : ");
		int num = input.nextInt();
		int result = 1;
		for(int i=num; i >0; i--) {
			result = result*i;	
		}
		System.out.println("The factorial of "+num+" is : "+result);
		input.close();
	}

}
