package com.codegnan.arrays;

public class MissingNumFinder {
	public static int NumFinder(int[] nums) {
		int n = nums.length+1;
		int actualSum = 0;
		int expectedSum = n* (n+ 1)/ 2;
		
		for(int num: nums) {
			actualSum +=num;
		}
		
		int missedNum = expectedSum - actualSum;
		return missedNum;
	}

	public static void main(String[] args) {
		int[] arr = {1,2,3,4};
		System.out.println("Missing number is : "+NumFinder(arr));
	}

}
