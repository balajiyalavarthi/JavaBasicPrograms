package com.codegnan.oop;

public class GarbageTest {
	protected void finalize() {
		System.out.println("Garbage collector calls finalized method");
	}

	public static void main(String[] args) {

		GarbageTest obj = new GarbageTest();
		obj = null;
		System.gc();
		System.out.println("requesting garbage collection");
		System.out.println("end of main method");

	}

}
