package com.codegnan.controlstatements;

import java.util.Scanner;

public class EvenAndOddInANumber {

	public static void main(String[] args) {
		//end user enters a number
		Scanner input =  new Scanner(System.in);
		System.out.println("Enter a number : ");
		int num =  input.nextInt();
		
		while(num > 0) {
			int last_digit = num%10;
			
			
			if(last_digit %2 ==0) {
				System.out.println(last_digit+" (even) ");
				
			}else {
				System.out.println(last_digit+" (odd) ");
			}
			num /=10;
		}
		
		System.out.println("Loop completed");
		

	}

}
