package com.codegnan.Streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Mapping {

	/*
	 * if we want to create a seperate new object for every object present inside the collection 
	 * based on our requirement 
	 */
	
	public static void main(String[] args) {
		
		
		List<Integer> numbers = Arrays.asList(2, 7, 9, 8, 4, 5, 1);
		List<Integer> nums = numbers.stream().map(i -> i*10).collect(Collectors.toList());
		
		System.out.println("Modified nums : "+nums);

	}
	
	// Convert list of strings to uppercase
	// Exract the length of each string in a list
	// Convert a list of integers to there square roots
	// Convert list of strings to there first character
	// Add a prefix to each element each element in a list of strings
	// Convert of list of integers to there binary representation

}
