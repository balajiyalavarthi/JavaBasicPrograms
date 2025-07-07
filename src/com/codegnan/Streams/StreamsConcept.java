package com.codegnan.Streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsConcept {

	/*
	 * Streams  : 
	 * 
	 * The process objects of the collection.
	 * 
	 * What are the differences between java.util.Streams and java.io.streams ? 
	 * 
	 * java.util.Streams is builed to process the objects from collections it represents 
	 * a stream of obkects from the collections.
	 * 
	 * But java.io.Streams is builded meant for processing binary and character data with respect to file
	 * it represent a stream of binary data or character data from the file
	 * 
	 * 
	 * What are the differences betweeen collections and streams ? 
	 * 
	 * we can create a stream object to the collection by using stream method of the collection interface
	 * Stream method is a default method added to the collection in 1.8 version
	 * 
	 * How to create a Stream or syntax of stream ?
	 * 
	 * Stream sc = c.stream;
	 * 
	 * Stream is an interface present in java.util.Stream once we get the stream by using that stream we can process 
	 * objects of the collection.
	 * 
	 * We can process the objects in the following two ways : 
	 * 
	 * 1. Configuration : 
	 * We can configure either by using filter and map mechanism.
	 * 
	 * Filtering  : 
	 * we can configure a filter, to filter elements from the collectionbased on some boolean conditions.
	 * 
	 * 
	 * 2. Processing : 
	 * 
	 * 
	 */
	
	
	
	//Filter example : 
	public static void main(String[] args) {
		
		List<Integer> nums =  new ArrayList<>();
		
		for(int i= 1; i< 10; i++) {
			nums.add(i);
			System.out.println(i);
		}
		
		System.out.println(" Value  : "+nums.get(0));
		
		List<Integer> even  =  nums.stream().filter(i -> i%2 ==0).collect(Collectors.toList());
		
		System.out.println(" even numbers list : "+even);
		
		
		List<String> names = Arrays.asList("java", "programs", "new ", "Topic");
		
		
		List<String> namesStartsWithJ = names.stream()
				.filter(name -> name.startsWith("j"))
				.collect(Collectors.toList());
		
		System.out.println(namesStartsWithJ);
		
		
        // Assignment
		// filter positive numbers
		// fitler palindrome from as list of strings
		// filter employees ith salary greater than certain amount
		// filter words longer than 4
		// filter numbers greater than the average
		// filter non-empty strings
		// filter out null values from the list
		// filter students with marks greater than or equal to 80
		// filter positive numbers and sort them in descending order.
		
		

	}

	
}
