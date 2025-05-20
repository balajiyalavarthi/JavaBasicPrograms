package com.codegnan.arrays;

import java.util.Scanner;

public class ArrayInitializationUsingScanner {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter Array Size : ");
		int arraySize = input.nextInt();
		
		String[] names =  new String[arraySize];
		System.out.println("Enter your names  : ");
		for (int i =0; i  <(names.length); i++) {
			System.out.println("Enter "+(i+1)+"st name : ");
			names[i] = input.next();
		}
		
		for(String name: names) {
			System.out.println(name+" is recieved successfully");
		}
		input.close();
	}

}
