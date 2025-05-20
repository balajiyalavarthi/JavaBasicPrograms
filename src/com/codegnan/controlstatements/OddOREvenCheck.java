package com.codegnan.controlstatements;

import java.util.Scanner;

public class OddOREvenCheck {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a number : ");
		int num = input.nextInt();
		
		char ch;
		do {
			
		if(num%2 == 0) {
			
			System.out.println(+num+" is Even number");		
		}else {
			
			System.out.println(+num+" is Odd number");
		}
		
		System.out.println("Enter 'y' to continue and enter 'n' to continue : ");
		ch = input.next().charAt(0);
		
		}while(ch == 'y');
		
		System.out.println("Exited!");
	}
}
