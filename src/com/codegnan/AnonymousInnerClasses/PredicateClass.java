package com.codegnan.AnonymousInnerClasses;

import java.util.function.Predicate;

/*
 * Predicate is a function with a single arguement and return boolean value.
 * To implement predicate functions in java oracle introduced predicate interface in java 1.8 version.
 * Predicate interface present in java.util.function package.
 * It is a functional interface it conatains only one method i.e., is test() method.
 */




public class PredicateClass {

	public static void main(String[] args) {
		
		Predicate<Integer> isGreaterThan10 = (i)-> i >10;
		
		System.out.println(isGreaterThan10.test(10));
		System.out.println(isGreaterThan10.test(12));
		System.out.println(isGreaterThan10.test(1));
		System.out.println(isGreaterThan10.test(5));
		
		
	}
}
