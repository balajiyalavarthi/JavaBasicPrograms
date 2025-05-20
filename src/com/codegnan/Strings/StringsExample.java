package com.codegnan.Strings;

public class StringsExample {

	public static void main(String[] args) {
		String s1 = new String("balu");
		String s2 = new String("balu");
		String s3 = "balu";
		String s4 = "balu";
		
		System.out.println(s1 == s2);
		System.out.println(s2 == s3);
		System.out.println(s3 == s4);
		System.out.println(s1.equals(s3));
		System.out.println(s3.equals(s4));
		
		
	}

}
