package com.codegnan.recursion;

import java.util.Scanner;

public class Print1ToN {
	
	public static int countDown(int n) {
		if(n==1) {
			return 1;
		}
		System.out.print(n+"...");
		n--;
		return countDown(n);
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number to start count down : ");
		int countDown = input.nextInt();
		
		System.out.println(countDown(countDown));

	}

}
