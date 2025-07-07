package com.codegnan.Assertions;

public class AssertionsBasics {

	/*
	 * The most common way of debugging is using a sosout statements but, The main disadvanatges of sops is
	 * after fixing the bug compulosory we should delete extra added sops otherwise those sops also will be executed 
	 * at runtime which impacts performance if the system and disturbs login mechanism
	 * to overcome this problem orcale introduced Assertions concept.
	 * 
	 * "  The main advantage of Assertions over sops is based on over requirements we can enable or 
	 * disable assertions and by
	 * default assertions are disabled hence after fixing bug it is not required to delete 
	 * assert statements explilcitly. "
	 * 
	 * The main objective of assertions is to perform debugging usually we can perform 
	 * debugging either in development environment or test environment but not in production environment
	 * hence assertions concept is applicable for development and testing environments
	 *  but not for the production.
	 *  
	 *  
	 *  Types of Assert statements : 
	 *  1. Simple version
	 *  2. arguement version
	 *  
	 *  Simple version  :
	 *  ----------------
	 *  Syntax :  assert(b);     // b means boolean type
	 *  if b is true our assumption is correct and continue rest of the program normally 
	 *  if b is false our assumption fails hence stops the program execution by raising assertion error
	 *  
	 *  Arguemented version :
	 *  assertion()
	 *  
	 *  
	 */
	public static void main(String[] args) {
		System.out.println("A");
		System.out.println("A");
		System.out.println("A");
		System.out.println("A");
		System.out.println("A");
		assert(10 > 10):"debug pointer 1";
		System.out.println("A");
		System.out.println("A");
		System.out.println("A");
		System.out.println((10+10 == 21) == true);
		System.out.println("A");
		System.out.println("A");
		assert(10 > 10):"debug pointer 12";
	}
}
