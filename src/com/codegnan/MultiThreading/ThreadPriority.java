package com.codegnan.MultiThreading;

/*
 *                                      Thread priorities
 * 
 * The valid range of a priorities are 1 to 10 but not (0-10) where 1 is the minimum  and 10 gets maximum priority
 * thread class defines following constants to represent some standard priorities.
 * 
 * 
 * 1.Thread.MIN_PRIORITY (1)
 * 2.Thread.MAX_PRIORITY (10)
 * 3.Thread.NORM_PRIORITY (5)
 * 
 * 
 * NOTE : There are no constants that represents like Thread.Low_PRIORITY and THREAD.HIGH_PRIORITY
 * 
 * Thread Scheduler uses this priorities while allocating cpu.
 * The thread which have highest priority gets a change to execute first.
 * If two threads are having the same priority then w cannot expect which thread excutes first it depends upon thread scheduler this phenomena is known as vendor dependent.
 * we can set and get priority of a thread by using following methods : 
 * public final int getPriority();
 * public final int setPriority();
 * 
 * The allowed values are 1-10, otherwise we get a run time exception says "IllegalArguementException";
 * 
 */
public class ThreadPriority implements Runnable {

	@Override
	public void run() {
		
	}
	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getPriority());
		
		ThreadPriority obj = new ThreadPriority();
		Thread thread =  new Thread(obj);
		
		System.out.println(thread.getPriority());
		thread.setPriority(9);
		System.out.println(thread.getPriority());
		
		
		ThreadPriority obj1 = new ThreadPriority();
		Thread thread1 =  new Thread();
		System.out.println(thread1.getName()+"   "+thread1.getPriority());
		thread1.setPriority(2);
		System.out.println(thread1.getName()+"    "+thread1.getPriority());
		System.out.println(thread1.MAX_PRIORITY);
		System.out.println(thread1.MIN_PRIORITY);
	}
	

}
