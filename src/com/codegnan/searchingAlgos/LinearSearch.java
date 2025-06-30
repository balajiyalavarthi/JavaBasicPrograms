package com.codegnan.searchingAlgos;

import java.util.Scanner;

public class LinearSearch {

	public static int linearSearch(int[] arr, int target) {
		
		int size= arr.length;
		for(int i= 0; i< size- 1; i++) {
			if(arr[i] == target) {
				return i;
			}
		}
		
		return -1;
		
	}
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter target element to perform linearSearch : ");
		int target =  input.nextInt();
		
		int[] nums = {34, 43, 56, 76, 67, 87, 89};
		
		System.out.println(linearSearch(nums, target));

		
		input.close();
	}

}
