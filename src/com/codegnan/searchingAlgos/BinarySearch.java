package com.codegnan.searchingAlgos;

import java.util.Scanner;

public class BinarySearch {

	public static int binarySearch(int[] arr, int target) {
		int start= 0;
		int end= arr.length - 1;

		int mid;

		while (start<= end) {
			mid= start+ (end- start)/ 2;
			if(target> arr[mid]) {
				start= mid+ 1;
			}else {
				if(target < arr[mid]) {
					end = mid- 1;
				}else {
					return mid;
				}
			}
		}
		
		return -1;
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int[] nums = {2, 5, 7, 8, 10, 71, 89};
		
		
		System.out.println("Enter a number to serach : ");
		int target = input.nextInt();
		
		System.out.println(binarySearch(nums, target));
		
		input.close();
	}

}
