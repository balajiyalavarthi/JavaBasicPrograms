package com.codegnan.searchingAlgos;

import java.util.Scanner;

public class AscOrDscBinarySearch {

	public static int search(int[] arr, int target) {
		
		
		int start = 0;
		int end = arr.length - 1;
		int mid;
		
		// to check if the given array is sorted in ascending or descending order.
		boolean isAsc = start <= end;
		
		
		
		while (start <= end) {
			mid = start + (end - start) / 2;

			
			// checkpoint for finding ascending or descending order
			if (isAsc == true) {
				
				
				//if arr is sorted in ascending order
				if (target > arr[mid]) {
						
					start = mid + 1;
				} else {
					if (target < arr[mid]) {
						end = mid - 1;
					}else {
						return mid;
					}
				}	
				
			} else {
				//if arr is sorted in descending order
				
				
				if (target < arr[mid]) {
					start = mid + 1;
				} else {
					if (target > arr[mid]) {
						end = mid - 1;
					}else {
						return mid;
					}
				}
			}
			
			
		}
		return -1;
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		
		
		int[] nums = { 2, 4, 5, 6, 7, 8, 9, 10};
		int[] nums2 = { 9, 10, 80, 100, 102, 111, 116 };

		
		
		System.out.println("Enter a target element 1 to search : ");
		int target = input.nextInt();
		System.out.println("Enter a target element 2 to search : ");
		int target1 = input.nextInt();
		
		
		
		System.out.println("Ascending order : "+search(nums, target));
		System.out.println("Descending order : "+search(nums2, target1));

		input.close();
	}

}
