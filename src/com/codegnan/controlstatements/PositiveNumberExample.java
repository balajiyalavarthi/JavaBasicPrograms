package com.codegnan.controlstatements;

import java.util.Scanner;

public class PositiveNumberExample {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int num = input.nextInt();
		input.close();
		
		if(num > 0) {
			System.out.println("The number "+num+" "+"is Positive");
		}else {
			System.out.println("There is no Specific code to execute.");
		}
		
	}

}
