package com.codegnan.arrays;

public class ShoopingBasketCheckOut {
static int sum = 0;
	public static int SumScannedItems(int[] arr) {
		if(arr.length == 0) {
			return sum;
		}else {
			if(arr.length == 1) {
				sum = arr[0];
				return sum;
			}else {
				sum = arr[0] + arr[1];
				return sum;	
				
			}
			
		}
	}
	public static void main(String[] args) {
		int[][] testcases = {
				{},
				{1,2,3},
				{5,5},
				{10,10,10,10},
				{8}
		};
		
		for(int i=0;i<testcases.length; i++) {
			System.out.println("Test case "+(i+1)+" result : "+""+SumScannedItems(testcases[i]));
		}
		
		
	}

}
