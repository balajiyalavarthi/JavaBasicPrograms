package com.codegnan.MultiThreading;

/*
 * ----------------------------------------------------------------------------------------------------
 * 									   Synchronisation
 * ----------------------------------------------------------------------------------------------------
 * 
 * Synchronisation is a keyword applicable for methods and blocks not for variables and classes.
 * If a method or block is declared as synchronised only one thread is executes that method or block on the given object.
 * The main advantage of synchronisation is we can resolve data inconsistency problem.
 * the main disadvantage of synchronised keyword is waiting time of a thread.
 * It effects the performance of the thread.
 * 
 * Hence,  if there is no specific purpose dont use synchronised keyword.
 * 
 * 
 * Internally synchronised concept is implemented by a  LOCK concept.
 * Every object in java has unique LOCK 
 * whenever we are using a synchronised keyword then  LOCK() concept comes to the picture.
 * IF a thread wants to execute any synchronized method on the given project first it has to get the LOCK of the object
 * Once a thread got lock of the object then it is allowed to execute any synchronised method of that object.
 * 
 * In synchronised method exceution completed then automatically thread releases the lock.
 * 
 * While a thread executing any synchronised method the remaining threads are not allowed to execute any synchron ised method on that object simultanoeusly
 * but the reamaining threads allow to execute on synchronised method at the same time.
 *  
 * Lock Concept implemented based on the object but not based on method.
 * 
 * special points : 
 * 
 * In java Multi Threading concept, synchronisation is possible through JVM.
 * 
 * Disadvantage : By using synchronisation in threads concept waiting time will be more than actual.
 * 
 * 
 */
public class Synchronisation {
	public void threadMethod() {
		for(int i = 0 ; i<=5; i++) {
			System.out.println(Thread.currentThread().getName());
		}
	}

}
