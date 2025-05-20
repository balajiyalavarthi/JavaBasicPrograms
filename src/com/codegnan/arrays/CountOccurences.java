package com.codegnan.arrays;

import java.util.Scanner;

public class CountOccurences {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter number of elements : ");
		int arraySize = input.nextInt();
		      
		int[] numbers = new int[arraySize];
		
		for(int i=0; i<arraySize; i++) {
			System.out.println("Enter element "+(i+1)+" : ");
			numbers[i] = input.nextInt();
		}
		
		int val =0;
		do {
			for(int i=1; i<numbers.length; i++) {
				if(numbers[i] == numbers[i-1]) {
					
				}
			}
		}while(val!=5);
		
		
		input.close();
	}

}
