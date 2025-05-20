package com.codegnan.controlstatements;

import java.util.Scanner;

public class IsLeapOrNot {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a year to check wheather it is leap or not : ");
		int year = input.nextInt();
		input.close();
		if(year% 4==0 || (year% 100 != 0 && year% 400 ==0)) {
			System.out.println(+year+ " is a leap year.");
		}
		else {
				System.out.println("Not a leap year");
			}
			
		}
	}


