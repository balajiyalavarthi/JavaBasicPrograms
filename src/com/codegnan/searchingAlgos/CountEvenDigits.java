package com.codegnan.searchingAlgos;

import java.util.Scanner;

public class CountEvenDigits {

	public static int mainAns(int[] nums) {
		int count = 0;

		for(int num: nums) {
		if (even(num) % 2 == 0) {
			count++;
		}
		}
		return count;
	}

	public static int even(int num) {
		String val = String.valueOf(num);
		return val.length();
	}

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int[] nums = { 1, 30, 200, 5000, 70000, 400000 };

		System.out.println(mainAns(nums));
		input.close();
	}

}
