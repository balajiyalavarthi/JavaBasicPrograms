package com.codegnan.searchingAlgos;

import java.util.Arrays;
import java.util.Scanner;

public class FloorOfANumber {

	
	
	
public static int findFloorOptimized(int[] arr, int target) {
		
	
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
		
		
		return arr[end];
	}


	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
		
		System.out.println("Enter a number to find ceil of a number : ");
		int target= input.nextInt();
		
		
		System.out.println("Enter size of the array : ");
		int size= input.nextInt();
		
		
		int[] nums= new int[size];
		
		for(int i= 0; i<= nums.length-1 ;i++) {
			nums[i]= input.nextInt();
		}
		
		System.out.println(Arrays.toString(nums));
		
		
		System.out.println("floor of given number is : "+findFloorOptimized(nums, target));

		input.close();
		
	}

}
