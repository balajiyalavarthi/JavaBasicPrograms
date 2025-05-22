package com.codegnan.recursion;

import java.util.Scanner;

public class ArmstrongNumebr {
	
	// global static variables
	static int res = 0;
	static int count = 0;
	
	
	//method to count numberOfDigits in given num
	public static int numberOfDigits(int dnum) {
		if (dnum == 0) {
			return count;
		}
		count++;
		return numberOfDigits(dnum /= 10);
	}

	// method to calculate the armstrong value
	public static int armstrongNumberUsingRecursion(int n) {
		// Base case
		if (n == 0) {
			return res;
		}

		int last_digit = n % 10;
		res += Math.pow(last_digit, count);

		return armstrongNumberUsingRecursion(n /= 10);

	}

	public static void main(String[] args) {
		// end user enters a number
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number : ");
		
		
		int num = input.nextInt();
		int dnum = num;
		int dnum2 = num;
		
		
		count = numberOfDigits(num);
		res = armstrongNumberUsingRecursion(num);
		
		
		
		//cross checking the results
		
        //System.out.println("Count : "+count);
        //System.out.println("result : "+res);
        //System.out.println("num : "+num);
        //System.out.println("dnum : "+dnum);
        //System.out.println("dnum2 : "+dnum2);
		
		
		// checking wheather result is same as num
		if (res == dnum2) {
			System.out.println("Given Number is Armstrong number!");
		} else {
			System.out.println("Not an Armstrong number!");
		}

		input.close();
	}

}
