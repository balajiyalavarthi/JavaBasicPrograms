package com.codegnan.arrays;

public class TwoDimensionalArray {

	public static void main(String[] args) {
		//2d array construction
		
		int[][] nums = new int[4][5];
		
		int i,j = 0;
		int val = 0;
		
		for(i =0;i<4;i++) {
			for(j =0;j<4;j++) {
				nums[i][j] = val;
				val++;
			}
		}
			
			for(i =0;i<4;i++) {
				for(j =0;j<4;j++) {
					System.out.print(nums[i][j]+" ");
				}
				System.out.println();
			}

	}

}
