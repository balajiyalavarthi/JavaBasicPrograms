package com.codegnan.arrays;

import java.util.Scanner;

public class MostRepeatedNumber {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter size of the array : ");
		int arraySize = input.nextInt();
		
		//array initialization
		int[] numbers = new int[arraySize];
		
		for(int i=0; i<numbers.length; i++) {
			System.out.println("Enter element "+(i+1)+" : ");
			numbers[i] = input.nextInt();
		}
		int res =0;
		for(int number = 1;number < (numbers.length);number++) {
			if(numbers[number]==numbers[number-1]) {
				res = number;
			}
		}
		System.out.println("Result is : "+numbers[res]);
		input.close();
		
	}

}
