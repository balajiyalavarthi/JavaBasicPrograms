package com.codegnan.searchingAlgos;

import java.util.Scanner;

public class AgonisticOrderBinarySearch {

	public static int decendingOrderBinarySearch(int[] arr, int target) {
		
		int start= 0;
		int end= arr.length- 1;
		int mid;
		
		while(start<= end) {
			mid= start+ (end- start)/2;
			if(target> arr[mid]) {
				end= mid- 1;
			}else {
				if(target< arr[mid]) {
					start = mid+1;
				}else {
					return mid;
				}
			}
		}
		
		return -1;
	}
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int[] nums = {80, 76, 45, 32, 11, 5, 2, 1};
		
		System.out.println("Enter target element to search  : ");
		int target = input.nextInt();
		
		System.out.println(decendingOrderBinarySearch(nums, target));
		
		input.close();
	}
}

