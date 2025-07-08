package com.codegnan.searchingAlgos;

public class PeakIndexInMountainArray {

	public static int search(int[] nums) {
		
		for(int i = 0; i< nums.length; i++) {
			if(nums[i+1] < nums[i]) {
				return nums[i];
			}
		}
		return -1;
	}
	public static void main(String[] args) {
		int[] nums = {0,2,1,0};

		System.out.println(search(nums));
	}

}
