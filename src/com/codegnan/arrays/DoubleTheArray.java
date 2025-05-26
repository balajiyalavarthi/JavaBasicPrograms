package com.codegnan.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class DoubleTheArray {
	
	//method to double the size of the array
	public static int[] sizeDoublingArray(int[] arr) {
		
		//base case to handle arrays with size 0
		if(arr.length == 0) {
			System.out.println("Empty array");
			return new int[0];
		}
		//initialising new array with twice the size of original array
		int[] doubledArray = new int[arr.length * 2];
		
		// storing the last element of the array
		int last_element = arr[arr.length-1];
		
		//replacing the lastelemnt of the new array with old one
		doubledArray[doubledArray.length-1] = last_element;
		
		return doubledArray;
	}
	

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		//end user enters size of the array
		System.out.println("Enter the size of array : ");
		int size =  input.nextInt();
		
		//initializing the array
		int[] nums =  new int[size];
		
		//user enters each element
		for(int i=0; i<size;i++) {
			System.out.println("Enter element "+(i+1)+" : ");
			nums[i] = input.nextInt();
		}
//		
//		for(int num:nums) {
//			System.out.println(num);
//		}
		//stroing the result of sizeDoublingArray method
		int[] resultArray = sizeDoublingArray(nums);
		
		//displaying the result by using to string method.
		System.out.println("The resultant array is : ");
		System.out.println(Arrays.toString(resultArray));
		input.close();
	}

}
