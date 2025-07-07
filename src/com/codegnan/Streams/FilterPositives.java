package com.codegnan.Streams;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;
//Assignment
		// filter positive numbers *
		// fitler palindrome from as list of strings 
		// filter employees with salary greater than certain amount
		// filter words longer than 4 *
		// filter numbers greater than the average *
		// filter non-empty strings 
		// filter out null values from the list *
		// filter students with marks greater than or equal to 80 
		// filter positive numbers and sort them in descending order. *
public class FilterPositives {

	public static void main(String[] args) {
		List<Integer> list =  Arrays.asList(-1, 2, 1, -9, -4, 3, 10);		
		
		List<Integer> positiveList = list.stream().filter(i-> i>=0).collect(Collectors.toList());

		System.out.println(positiveList);
		
		Collections.sort(positiveList, Comparator.reverseOrder());
		
		
		System.out.println("Positive list in a descending order");
		System.out.println(positiveList);
		
		
		
		
		// filter numbers greater than the average
		
		
		List<Integer> nums =  Arrays.asList(1, 2, 3, 4, 5, 6, 10);
		int sum= 0;
		
		for(int num: nums) {
			sum+=num;
		}
//		System.out.println(sum);
		int avg = sum/nums.size();
//		System.out.println(avg);
		
		
		List<Integer> numsGtrThanAvg = nums.stream().filter(i -> i>avg).collect(Collectors.toList());
		
		
		System.out.println("list greater than average "+avg);
		System.out.println(numsGtrThanAvg);
		
		
		
		
		
		
		List<String> words = Arrays.asList("apple", null, "coco", " bat",null,  "gun", "iron", "sweet", null);
		
		List<String> wordsWithoutNull = words.stream().filter(Objects::nonNull).collect(Collectors.toList());
		
		System.out.println("Words list without null values : ");
		System.out.println(wordsWithoutNull);
		
		
		System.out.println("Words with length greater than 4 ");
		List<String> wordsWith4Length = wordsWithoutNull.stream().filter(word-> word.length()>=4).collect(Collectors.toList());
		System.out.println(wordsWith4Length);
	}
	
	

}
