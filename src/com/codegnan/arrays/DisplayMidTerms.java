package com.codegnan.arrays;

public class DisplayMidTerms {

	public static int findingMidTerms(int[] nums1, int[] nums2) {
		
		if(nums1.length >1 && nums2.length > 1) {
			for(int i=1; i<nums1.length-1; i++) {
				int nums1midterm =  nums1[i];
				System.out.print(nums1midterm);
				System.out.print(" ");
			}
			
			for(int j= 1; j<nums2.length-1; j++) {
				int nums2midterm =  nums2[j];
				System.out.println();
				System.out.print(nums2midterm);
				System.out.print(" ");
			}
			
			
		}
		
		return 0;
		
	}
	
	public static void main(String[] args) {
		int[] arr1 = {1,2,3,9,0};
		int[] arr2 = {3,4,5,9,0};
		System.out.println(findingMidTerms(arr1, arr2));
	}

}
