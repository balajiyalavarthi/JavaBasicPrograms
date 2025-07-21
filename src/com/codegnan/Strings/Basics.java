package com.codegnan.Strings;

public class Basics {

	public static void main(String[] args) {
		int a = 10;
		/*
		 * here int a is a variable and a primitive datatype and it stores reference variable "a" in jvms stack
		 * memory pointing to its value in same stack memory.
		 */
		String name = "balu";
		// Q : What about Strings ?
		/*
		 * A : In the case of strings name is reference variable which points to a value
		 * "balu". And String is not a primitive datatype and it is actually an OBJECT.
		 */
		String naam = "balu";
		String naam1 = "balu";
		System.out.println("result of first case : "+(naam == naam1));// prints true because both 
		// references are pointing the same object "balu" in string pool.
		System.out.println(name);

		// Q : Why String is an Object in java ?
		// A : To provide different types of methods and functionalities to a string,
		// and to achieve  memory optimization in java, Strings are meant to be an Object.

		// Q : Explain memory optimization in java ?
		// A : In java Strings are stored at a seperate memory space inside jvm's heap
		// memory,
		// The memory space name is" String pooling ".String pooling points to same
		// value if we create multiple objects for the same reference value.
		// Suppose if we store a same value "balu" with different reference variables
		// like
		// name, firstName, studentName ; jvm doesn't create a new object every time for
		// each
		// and every reference when it stores the same object value. When we intialize
		// first
		// variable it stores jvm string pooling creates a new object in its memory
		// space, when
		// other strings with different reference names initialized with same object
		// value then pooling
		// points the all reference variables to the object value of first created
		// object.

		// Q : Why string pooling is introduced in java ?
		// A : For memory management purpose we use string pooling.

		// Q : In String pooling every reference with same object value points to the
		// same object,
		// If one reference needs to modified then every other reference has to be
		// changed? Is this is a
		// disadvantage of string pooling ? If not Explain ?
		// A : If multiple references points to the same object and one reference wants
		// to modify
		// its object value jvm creates a new object and points the same reference
		// object it doesn't
		// change previous value. THATS WHY IN JAVA STRINGS ARE IMMUTABLE , WHENEVER WE
		// TRY
		// MODIFY THE STRING OBEJCT VALUE JVM CREATES A NEW OBJECT, AND CHANGES THE
		// REFERENCE POINTING
		// TO MODIFIED NEW STRING OBJECT.

		// Q : Then how can we create two objects with same value ? Is it possible ?
		// A : Yes it is possible to create two objects with the same value. We have to
		// create objects
		// manually using String class.
		// Like this :
		
		String name1 = new String("Balu");
		String name2 = new String("Balu");
		
		System.out.println(name1 == name2); // false 
		System.out.println(name1.equals(name2)); //true
		
		// In the first case the output is false because name 1 and name 2 have same values but when 
		// i check the references of the objects are equal it prints false it clearly states that both 
		// references are  not pointing to the same object, Actually there are objects with same name.
		
		// Q : When we modify a string object it doesn't modify it creates a new object and 
		// points it to the reference Then what happens to the previous object it doesn't points 
		// to any other reference ? 
		// A : If a string object doesn't points to a reference in stack jvm's Garbage collector takes 
		// responsibility to destroy the object.
		

	}

}
