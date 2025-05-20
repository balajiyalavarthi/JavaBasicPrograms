package com.codegnan.controlstatements;

import java.util.Scanner;

public class CountOfANumber {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int num = input.nextInt();
		int temp = num;
		int count = 0;
		
		while(temp > 0) {
			temp = (int)temp/10;
			count++;
		}
		
		System.out.println("Number of digits in "+num+" are : "+count);
		input.close();
	}

}
