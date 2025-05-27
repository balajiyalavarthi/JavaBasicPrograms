package com.codegnan.arrays;

import java.util.Scanner;

public class LinearSearch {

	public static int search(int[] arr, int target) {
		for(int i=0; i<arr.length; i++) {
			
			if(arr[i] == target) {
				return i;
			}	
		}
		return -1;
	}
	public static void main(String[] args) {
		int[] nums = {1,9,2,8,3,7,4,6};
		Scanner input = new Scanner(System.in);
		System.out.println("Enter target value  : ");
		
		int target = input.nextInt();
		int result = search(nums, target);
		
		if(result > 0) {
			System.out.println("Element found at : "+result);
		}else {
			System.out.println("Element not found");
		}
		input.close();
	}

}
