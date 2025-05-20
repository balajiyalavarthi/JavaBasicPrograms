package com.codegnan.patterns;

public class Pattern1 {

	public static void main(String[] args) {
		int[][] nums =  new int[5][4];
		
		int i,j,k = 0;	
		
		
		for(i = 0; i<5; i++) {
			for(j = 0; j<i; j++) {
				nums[i][j] = k;
				k++;
			}
		}
		
		
		for(i = 0; i<5; i++) {
			for(j = 0; j<i; j++) {
				System.out.print(nums[i][j]+ " ");
			}
			System.out.println();
		}
		
	}

}
