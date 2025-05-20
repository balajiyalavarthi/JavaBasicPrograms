package com.codegnan.Strings;

public class StringMethods {

	public static void main(String[] args) {
		
		
		String word = new String("Wild cheetah");
		//
		System.out.println("CharAt : "+word.charAt(6));
		//
		System.out.println("index : "+word.indexOf('h'));
		//
		System.out.println("Last index of : "+word.lastIndexOf('h'));
		//
		System.out.println("Length : "+word.length());
		//
		System.out.println("Starts with : "+word.startsWith(word));
		//
		System.out.println("Ends with : "+word.endsWith(word));
		//
		System.out.println("To lower Case : "+word.toLowerCase());
		//
		System.out.println("To upper Case : "+word.toUpperCase());
		//
		System.out.println("Sub String : "+word.substring(0,4));
		//
		System.out.println("Equals : "+word.equals("CHEEtah"));
		//
		System.out.println("Equals ignore case : "+word.equalsIgnoreCase("wild CHEEtah"));
		//
		System.out.println("Replace : "+word.replace('h', 'n'));
		//
		System.out.println("Trim : "+word.trim());
		//
		System.out.println("converting string to char array : "+word.toCharArray());
		//
		System.out.println("Subsequence : "+word.subSequence(5,word.length()));
		//
		System.out.println("Split : "+word.split(word));
		
		
	}
	
}
