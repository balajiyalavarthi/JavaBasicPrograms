package com.codegnan.arrays;

import java.util.Scanner;

public class Average {

	public static void main(String[] args) {
		Scanner input  = new Scanner(System.in);
		
		System.out.println("Enter number of elements : ");
		int size = input.nextInt();
		
		int[] numbers = new int[size];
		System.out.println("Enter array elements : ");
		
		// taking each number from end user and storing it in numbers array index wisely
		for(int i=0;i<numbers.length;i++) {
			System.out.println("Enter element "+(i+1)+" : ");
			numbers[i] = input.nextInt();
		}
		
		int total = 0;
		
		for(int number:numbers) {
			System.out.println(number);
			total +=number;
		}
		int res = total/size;
		double average = res; 
		System.out.println("Total : "+total);
		System.out.println("Total average : "+average);
		
		input.close();
	}

}
