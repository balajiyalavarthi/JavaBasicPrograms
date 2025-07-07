package com.codegnan.Streams;

import java.util.*;
import java.util.stream.Collectors;
public class MapOperations {


	
	    public static void main(String[] args) {
	    	
	    	
	    	
	        List<String> strings = Arrays.asList("apple", "banana", "candy", "duck", "eagle", "chicken");
	        List<Integer> numbers = Arrays.asList(4, 9, 16, 25);

	        
	        
	        List<String> upperCaseStrings = strings.stream()
	                .map(String::toUpperCase)
	                .collect(Collectors.toList());

	        System.out.println("Uppercase: " + upperCaseStrings);
	        
	        
	        
	        
	        
	        List<Integer> stringLengths = strings.stream()
	                .map(String::length)
	                .collect(Collectors.toList());

	        System.out.println("Lengths: " + stringLengths);
	        
	        
	        
	        
	        
	        List<Double> squareRoots = numbers.stream()
	                .map(Math::sqrt)
	                .collect(Collectors.toList());

	        System.out.println("Square roots: " + squareRoots);
	        
	        
	        
	        
	        
	        
	        List<Character> firstCharacters = strings.stream()
	                .map(s -> s.charAt(0))
	                .collect(Collectors.toList());

	        System.out.println("First characters: " + firstCharacters);
	        
	        
	        
	        
	        List<String> prefixedStrings = strings.stream()
	                .map(s -> "Item: " + s)
	                .collect(Collectors.toList());

	        System.out.println("Prefixed strings: " + prefixedStrings);
	        
	        
	        
	        
	        List<String> binaryNumbers = numbers.stream()
	                .map(Integer::toBinaryString)
	                .collect(Collectors.toList());
	        
	        System.out.println("Binary representations: " + binaryNumbers);

	        
	    }
	}


