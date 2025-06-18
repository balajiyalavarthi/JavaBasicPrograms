package exceptionHandling;

import java.util.Scanner;

public class ArrayIndexOutOfBoundsExceptionHandling {

	// Write a method that accesses an array element at a given index.
	// Handle ArrayIndexOutOfBoundsException.

	public static int showArrayElements(int[] arr, int index) {

		try {
			int element = arr[index];
			return element;

		} catch (ArrayIndexOutOfBoundsException e) {
			return -1;
		}
	}

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Enter Array size : ");
		int size = input.nextInt();

		int[] arr = new int[size];

		for (int i = 0; i < size; i++) {
			System.out.println("Enter element " + i+" : ");
			arr[i] = input.nextInt();
		}

		System.out.println("Enter a indexnumber less than " + arr.length + " : ");
		int index = input.nextInt();

		int result = showArrayElements(arr, index);

		if (result >= 0) {
			System.out.println("Element at index " + index + " is " + result);
		} else {
			System.out.println("Array index out of bounds exception");
		}

		input.close();

	}

}
