package com.codegnan.arrays;

public class MatchFirstAndLast {

	public static boolean matchTerms(int[] nums1, int[] nums2) {

		if (nums1.length == 0 || nums2.length == 0) {
			
			System.out.println("Empty array");
			System.out.println();
			return false;
			
		} else {
			if (nums1.length == 1 || nums2.length == 1) {

				if (nums1[0] == nums2[0]) {
					
					System.out.println("Match terms founded in both arrays");
					System.out.println();
					return true;

				} else {
					
					return false;
					
				}
			}
		}

		if (nums1[0] == nums2[0] || nums1[nums1.length - 1] == nums2[nums2.length - 1]) {
			
			System.out.println("Match terms founded in both arrays");
			System.out.println();
			return true;
		}
		
		System.out.println("No first and last terms matched in both arrays");
		System.out.println();
		
		return false;
	}

	public static void main(String[] args) {
		int [][][] testcases = {
				{
					{1,2,3},{7,3}
				},
				{
					{2,4,8,5},{4,5}
				},
				{
					{4,5},{6,8}
				},
				{
					{8},{8}
				}
				
		};
		
		for(int i=0; i<testcases.length; i++) {
			int[] arr1 = testcases[i][0];
			int[] arr2 = testcases[i][1];
			System.out.println("result is : " + matchTerms(arr1, arr2));
		}

		
	}

}
