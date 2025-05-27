package com.codegnan.arrays;

import java.util.Scanner;

public class BinarySearch {

	public static int search(int[] arr, int target) {
		
		int low = 0;
		int high = arr.length-1;
		
		while(low<= high) {
			
			
			int mid = low+high/2;
			
			if(arr[mid] == target) {
				return mid;
			}else {
				if(target <arr[mid]) {
					high = mid-1;
				}else {
					if(target > arr[mid]) {
						low= mid+1;
					}
				}
			}
			
			
		}
		return -1;
	}
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,6};
		Scanner input = new Scanner(System.in);
		System.out.println("Enter target value : ");
		int target = input.nextInt();
		
		int res= search(arr, target);
		
		if(res > 0) {
			System.out.println("Element found at : "+res);
		}else {
			System.out.println("Element not found");
		}
		input.close();

	}

}
