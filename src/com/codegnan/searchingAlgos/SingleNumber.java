package com.codegnan.searchingAlgos;

public class SingleNumber {

	public static int singleNumber(int[] nums) {
		int ans = nums[0];
		int sum = 0;
		for (int i = 1; i < nums.length - 1; i++) {
			if (i % 2 == 0) {
				sum += nums[i];
			} else {
				sum -= nums[i];
			}
		}
		System.out.println("Sum : "+sum);
		ans = ans + sum;
		return ans;
	}

	public static void main(String[] args) {
		int[] arr = { 2, 2, 1 };
		
		System.out.println(singleNumber(arr));

	}

}
