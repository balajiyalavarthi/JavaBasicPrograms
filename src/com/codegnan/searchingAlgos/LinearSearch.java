package com.codegnan.searchingAlgos;

import java.util.Scanner;

public class LinearSearch {

	public static int linearSearch1(int[] arr, int target) {

		int size = arr.length;
		for (int i = 0; i < size - 1; i++) {
			if (arr[i] == target) {
				return i;
			}
		}

		return -1;

	}

	public static int linearSearch2(int[] arr, int target) {

		int size = arr.length;
		for (int i = 0; i < size - 1; i++) {
			if (arr[i] == target) {
				return arr[i];
			}
		}

		return Integer.MIN_VALUE;

	}

	public static boolean linearSearch3(int[] arr, int target) {

		int size = arr.length;
		for (int i = 0; i < size - 1; i++) {
			if (arr[i] == target) {
				return true;
			}
		}

		return false;

	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter target element to perform linearSearch : ");
		int target = input.nextInt();

		int[] nums = { 34, 43, 56, 76, 67, 87, 89 };

		int result1 = linearSearch1(nums, target);
		int result2 = linearSearch2(nums, target);
		boolean result3 = linearSearch3(nums, target);

		System.out.println("Linear search result answer as index");
		System.out.println(result1);
		System.out.println("Linear search result actual answer");
		System.out.println(result2);
		System.out.println("Linear search result boolean value");
		System.out.println(result3);
		input.close();
		
	}

}
