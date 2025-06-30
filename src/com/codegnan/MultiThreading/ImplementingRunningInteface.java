package com.codegnan.MultiThreading;

/*
 *                           How to implement a runnable interface ?
 * In this approach create a class and implement runnable interface 
 * present in java.lang.Runnable package.
 * 
 * As you implelents runnable interface now you can provide implementation
 * of Run() method.so that we can execute same logic by creating method.
 * 
 * Now you can implelement a Runnable interface so your class become implementation of thread class reference to that thread.
 * And pass that implementaion class referance to that thread that thread can start your user defined run method
 */


/*
 *                     What is the best approcah to define a thread ?.
 * 
 * Among two ways of defining a thread implementing runnable approach is always recommended.
 * 
 * Because, In the first approach our class extends the thread class. 
 * 
 * There is no chance of extending any another class we are missing inheritance benefit.
 * 
 * But in the second approach while implemtning runnable interface
   we can extend some other class also hence implementing runnable mechanism is always recommended.
   
 */
public class ImplementingRunningInteface implements Runnable{

	public void run() {
		for(int i=0 ;  i<=10; i++) {
			System.out.println(i);
		}
	}
	
	public static void main(String[] args ) {
		ImplementingRunningInteface obj =  new ImplementingRunningInteface();
		
		Thread thread =  new Thread();
//		thread.run();
		thread.start();
		for(int i=20 ;  i>=10; i--) {
			System.out.println(i);
		}
		
	}

}
