package com.codegnan.controlstatements;

import java.util.Scanner;

public class CheckDivisibleBy5 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int num = input.nextInt();
		input.close();
		
		if(num% 5 == 0) {
			System.out.println(num+" "+" is divisible by 5");
		}else {
			System.out.println("Not divisible by 5");
		}
	}

}
