package com.codegnan.arrays;

import java.util.Scanner;

public class MInElementFinderInRotatedArray {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		//end user enters array size
		System.out.println("Enter array size : ");
		int n= input.nextInt();
		
		//end user enters elements into array
		System.out.println("Enter elements in to array : ");
		int[] nums= new int[n];
		
		for(int i= 0; i< n; i++) {
			System.out.println("Enter element "+(i+1)+" : ");
			nums[i]= input.nextInt();
		}
		
		
	}

}
