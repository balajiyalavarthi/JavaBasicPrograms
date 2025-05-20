package com.codegnan.arrays;

import java.util.Scanner;

public class SumOfArray {

	public static void main(String[] args) {
		Scanner input =  new Scanner(System.in);
		
		System.out.println("Enter number of elements : ");
		int size = input.nextInt();
		
		int[] numbers = new int[size];
		System.out.println("Enter numbers :" );
		
		for(int i=0; i<size; i++) {
			System.out.println("Enter element "+(i+1)+": ");
			numbers[i] = input.nextInt();
		}
		
		int total = 0;
		
		for(int number:numbers) {
			total+=number;
		}
		
		System.out.println("Sum of entered elements is : "+total);
		input.close();
	}

}
