package com.codegnan.Streams;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsProcessing {

	
	/*
	 * 
	 * Processing
	 * 1. processing by collect method
	 * 2. processing by count() method
	 * 3. processing by sorted() method
	 * 4. processing by min() and max() methods
	 * 5. foreach() method
	 * 6. toArray(0)
	 * 7. Stream.of() method.
	 * 
	 */
	public static void main(String[] args) {
		List<String> words = Arrays.asList("Aaaaaa", "Baaaa", "Ccc", "Dddddaaaa", "Eeeeeeeee","F");

		long count = words.stream().filter(word->word.length() > 7).count();
		System.out.println("Words with letters more than 7 : "+count);
		
		
		List<String> NotSortedWords = Arrays.asList("Aaaaaa", "Baaaa", "Ccc", "Dddddaaaa", "Eeeeeeeee","F");
		
		List<String> AscSortedWords = NotSortedWords.stream().sorted().collect(Collectors.toList());
		
		System.out.println("Ascending order list : "+AscSortedWords);
		List<String> DscSortedWords = NotSortedWords.stream().collect(Collectors.toList());
		
		
		System.out.println("Descending order list : ");
		Collections.sort(DscSortedWords, Comparator.reverseOrder());
		
		
		
		// for each method
		
		// it doesn't return any value
		words.stream().forEach(word-> System.out.println(word));
		
		
		//to array() method
		
		
		List<String> letters = Arrays.asList("Aaaaaa", "Baaaa", "Ccc", "Dddddaaaa", "Eeeeeeeee","F");
		String[] wordsArray = letters.stream().toArray(String[]:: new);
		
		System.out.println("Words Array : ");
		System.out.println(Arrays.toString(wordsArray));
		
		
	}

}
