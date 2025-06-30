package com.codegnan.MultiThreading;

/*
 * 									Synchronised Block
 * Synchronised is applicable at block level if a method contains 100 lines of code 
 * if you want to synchronise only 10 lines of the code in a  method instead of synchronising whole method, 
 * we can simply use synchronised block.
 * Synchronised scope is less compared to methods.
 * 
 * Syntax : 
 * synchronised(Object){
 * 
 * }
 */
public class SynchronisedBlock {
	public void meth() throws InterruptedException {
		synchronized(this){
			System.out.println("Inside Block "+Thread.currentThread().getName());
		}
		Thread.sleep(1000);
		System.out.println("*");
		System.out.println("Meth method : "+Thread.currentThread().getName());
		System.out.println("*");
	}
}
