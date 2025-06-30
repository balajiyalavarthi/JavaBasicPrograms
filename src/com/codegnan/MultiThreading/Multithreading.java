package com.codegnan.MultiThreading;

//*****************************************************************************************************
//                         *****    Extending Thread class ****
//-----------------------------------------------------------------------------------------------------
//
/*                                      Thread Scheduler 
 * If multiple threads are waiting to excute then 
 * which thread will be executed first is decided by
 * Thread Scheduler Thread scheduler is part of JVM
 *  
 * Hence in multi threading examples we cannot expect exact execution order and exact output.
 * 
 * 
 * */
//*****************************************************************************************************
/*
 *                  Differences betwenn run() method and start() method ?
 * In the case of start() method which is responsible for exceution of run() method.
 * But in the case of run() method no new thread is created it run like a  normal methods
 * 
 * After starting one thread we cannot restart the same thread, if we restart we get an exception "IllegalThreadException".
 * */

 
public class Multithreading extends Thread{
	

//	public void wish() {
//		System.out.println("Hello");;
//	}
	
	
	public void run() {
		for(int i= 0; i<= 10; i++) {
			System.out.println(i);
		}
	}
	
	public static void main(String[] args) {
		Multithreading obj =  new Multithreading();
//		obj.wish();
		
		//Thread 
		obj.start();
		
		//Thread
		for(int i=20; i>10; i--) {
			System.out.println(i);
		}
		
		
		/*
		 * 					     Multi threading and Start()Method
		 * 
		 *Type 1  : defining the thread by extending thread class.
		if we execute this program we cannot get a static 
		output beacuse both threads have same priority, 
		In this case, thread Scheduler takes charge to execute a thread, thread scheduler is places in JVM.
		
		if we call Start method then it creates a new thread thatswhy both threads have same priority.
		
		But if we call by actual method which is declared in the class 
		we get a same type of output constantly because it doesnot creates 
		a new thread it runs the actual statements i side the called method. */
		
		
		
		
		
		
		
	}

}
