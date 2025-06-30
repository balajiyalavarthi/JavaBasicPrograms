package com.codegnan.MultiThreading;

/*
 * What are the differences between yield() method and join() method and sleep() method ?
 * 
 */

public class SleepMethod implements Runnable {

	@Override
	public void run() {
		
	}
	public static void main(String[] args) {
		
		SleepMethod obj =  new SleepMethod();
		
		Thread thread =  new Thread(obj);
		
		System.out.println("One");
		try {
			thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("Two");
		try {
			thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
