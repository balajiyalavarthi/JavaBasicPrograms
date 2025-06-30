package com.codegnan.MultiThreading;

/*
 * 						***** The methods to prevent a Thread Execution *****
 * 
 * 
 * By using the following methods we can prevent a thread execution.
 * 
 * 1. yield() method 
 * 2. join() method
 * 3. sleep() method
 * 
 *						          *****	yield() method *****
 *
 *yield() method causes to pause current executing thread and 
 *gives a chance remaining waiting threads of the same priority 
 *
 *If all threds have a low priority or if there is no waiting threads then 
 *the same thread will be continued its execution.
 *
 *If several waiting threads have the low priority 
 *we cannot expect which thread gets a chance for execution.
 *
 *The thread which is yielded when it get chance once again is decided by thread scheduler
 *
 *                                 ****     join() method   ****
 * If a thread wait until completing some another thread task then we should go for join() method.
 *
 *
 *                                 ****    sleep() method
 *If a thread don't want to perform any action or any operation then we should go for sleep method().
 *public static native void sleep(long ms) throws InterruptedException
 */

public class PreventThreadExecution implements Runnable {
	// yield() method
//			@Override
//			public void run() {
//				for(int i= 0; i<10; i++) {
//					Thread.yield();
//					System.out.println("Child");
//				}
//			}
	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			try {
				
				Thread.sleep(1000);
				System.out.println("Wait thread B");
			}catch(InterruptedException e ) {
				System.out.println("Interrupted Exception");
			}
		}
	}

	public static void main(String[] args) {

		PreventThreadExecution prevent = new PreventThreadExecution();
		Thread thread = new Thread(prevent);
		
		
//		yield()
		thread.run();
//		thread.start();
//		for (int i = 0; i < 10; i++) {
//			System.out.println("Parent");
//		}
		
//		join() method
		System.out.println("Thread A Task Completed");
		for(int i =0; i< 10; i++) {
			System.out.println("Thread B executing");
		}

	}

}
