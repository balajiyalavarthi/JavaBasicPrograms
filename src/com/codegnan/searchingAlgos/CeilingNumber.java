package com.codegnan.searchingAlgos;

import java.util.Scanner;

public class CeilingNumber {
	
	//My approach is halfway binary linear search
	
	public static int findCeilBrute(int[] nums, int target) {
		
		//BruteForce or balaji's approach
		int start= 0;
		int end= nums.length- 1;
		
		int mid= start+ (end- start)/ 2;
		
		if(target== nums[mid]) {
			return nums[mid];
		}
		
		if(target > nums[mid]) {
			
		for(int i= mid; i<= end; i++)  { // 9, 14, 16, 18
			int ceil = nums[mid];
			
			if(nums[i]>= target) {
				
				ceil= nums[i];
//				System.out.println("I am ceil "+ceil);
				return ceil;
				
			}	
		}
		}else {
			int subPoint= mid-1;
			for(int i= 0 ; i<= subPoint ; i++) { // 2, 3, 5
				int ceil= nums[0];
				
				if(nums[i]>= target) {
					
					ceil= nums[i];
//					System.out.println("I am ceil "+ceil);
					return ceil;
					
				}	
			}
		}
		return -1;
	}
	
	
	
	//
	public static int findCeilOptimized(int[] arr, int target) {
		
		int start= 0;
		int end= arr.length;
		
		int mid;
		
		while(start<= end) {
			mid= start+ (end- start)/ 2;
			
			if(target== arr[mid]) {
				return arr[mid];
			}else {
				if(target< arr[mid]) {
					end= mid- 1;
				}else {
					start= mid+ 1;
				}
			}
		}
		
		
		return arr[start];
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		//            0  1  2  3  4   5   6
		int[] nums = {2, 3, 5, 9, 14, 16, 18};
		
		System.out.println("Enter a target element to find ceiling : ");
		int target = input.nextInt();
		
//		System.out.println("Ceil of "+target+" is "+findCeilBrute(nums, target));
		System.out.println("Ceil of "+target+" is "+findCeilOptimized(nums, target));
		
		input.close();
	}

}
