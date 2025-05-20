package com.codegnan.controlstatements;

import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int num = input.nextInt();
		int res = 0;
		int duplicate = num;
		int duplicate1 = duplicate;
		int count =0;
		
		//counting Number of digits
		
		while(duplicate > 0) {
			duplicate /=10;
			count++;
		}
		// Armstrong main loop
		while(num > 0) {
			int lastDigit = num% 10;
			res = res + (int)Math.pow(lastDigit, count);
			
			num/=10;
		}
		
		if(duplicate1 == res) {
			System.out.println(+res+" Armstrong number");
		}else {
			System.out.println(+duplicate+" Not an Armstrong number.");
		input.close();
		}
	}

}
