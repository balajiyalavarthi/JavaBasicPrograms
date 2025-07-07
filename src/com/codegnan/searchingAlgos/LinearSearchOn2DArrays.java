package com.codegnan.searchingAlgos;

import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class LinearSearchOn2DArrays {

	
	public static int[] search(int[][] nums, int target) {
		
		for(int row= 0; row < nums.length; row++) {
			for(int col = 0; col< nums[row].length; col++) {
				if(nums[row][col] == target) {
					return new int[] {row, col};
				}
			}
		}
		return new int[] {-1, -1};
	}
	public static void main(String[] args) throws IOException {
		
		Scanner  input = new Scanner((System.in));
		int[][] arr = {
				{2, 5, 7, 9},
				{11, 13, 10, 90},
				{1, 3, 5, 7, 9},
				{100, 150, 200, 100, 50},
		};

		System.out.println("Enter target element to search : ");
		int target = input.nextInt();
		
		
		System.out.println("Targte is at  : "+Arrays.toString(search(arr, target)));
		input.close();
	}

}
