package com.codegnan.recursion;

import java.util.Scanner;

public class BinarySearchUsingRecursion {

	public static int binarySearch(char[] arr,char target,int left, int right) {
		
		if(left> right) {
			return -1;
		}
		
		
		int mid = (left+right)/2;
		
		if(arr[mid] == target) {
			return  mid;
		}
		
		if(target < arr[mid]) {
			return binarySearch(arr, target, left, mid-1);
		}else {
			return binarySearch(arr, target, mid+1, right);
		}
			
	}
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter array size : ");
		int n =  input.nextInt();
		System.out.println();
		
		System.out.println("Enter array elements : ");
		char[] letters = new char[n];
		
		for(int letter= 0; letter<n; letter++) {
			System.out.println("Enter character "+(letter+1)+" : ");
			letters[letter] = input.next().charAt(0);
		}
		
		System.out.println("Enter a letter to searching the array : ");
		char target = input.next().charAt(0);
		
		int res = binarySearch(letters,target,0,letters.length);
		
		if(res >= 0) {
			System.out.println("Element found at : "+res);
		}else {
			System.out.println("element not  found.");
		}
	}

}
