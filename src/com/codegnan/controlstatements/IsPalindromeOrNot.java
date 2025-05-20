package com.codegnan.controlstatements;

import java.util.Scanner;

public class IsPalindromeOrNot {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		//end user enters a number
		System.out.println("Enter a number : ");
		int num  = input.nextInt();
		
		//assigning num value to duplicate because num becomes 0 after sometimes
		int duplicate = num;
		int reverseNum = 0;
		
		//main loop
		while(duplicate > 0) {
			int lastDigit = duplicate%10;
			reverseNum = reverseNum*10 + lastDigit;
			duplicate /=10;
			
			System.out.println(duplicate);
		}
		//checking palindrome or not
		
		if(num == reverseNum) {
			System.out.println("Given number is palindrome number");
		}else {
			System.out.println("Not a palindrome number");
		}
		
		input.close();
	}

}
