package com.codegnan.recursion;

import java.util.Scanner;

public class PrintNameNTimes {
	static int num=1;
	public static String repeatName(String word, int n) {
		if(num == n) {
			return word;
		}
		
		System.out.println(word);
		n--;
		return repeatName(word,n);
		
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter your name : ");
		String name = input.next();
		System.out.println("Enter number of times to print : ");
		int times = input.nextInt();
		
		System.out.println(repeatName(name, times));

	}

}
