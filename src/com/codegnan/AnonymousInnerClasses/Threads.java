package com.codegnan.AnonymousInnerClasses;

//class MyRunnable implements Runnable{
//
//	@Override
//	public void run() {
//		for (int i = 0; i < 10; i++) {
//			System.out.println(" Runnable class ");
//		}
//	}
//	
//}

public class Threads{
	public static void main(String[] args) {
		Runnable r =  new Runnable() {// anonymous inner class implementation
				@Override
				public void run() {
					for (int i = 0; i < 10; i++) {
						System.out.println(" Runnable class ");
					}
				}		
		};
		
		Thread thread =  new Thread(r);
		
		thread.start();
		
		for (int i = 0; i < 10; i++) {
			System.out.println(i+ " Thread class ");
		}
		
		
		
		
		
		
		Runnable r1 =()->{// with lambda expression implementation
				for (int i = 0; i < 10; i++) {
					System.out.println("r1 threads");
				}
			};
			
			Thread thread2 = new Thread(r1);
			
			thread2.start();
			
			
			
			
			
			
			
			
			// Direct thread implementation 
			// using anonymous inner class as  an object in thread reference
			
			Thread thread3 = new Thread(new Runnable(){

				@Override
				public void run() {
					for (int i = 0; i < 10; i++) {
						System.out.println(" Thread 3 implementation ");
					}
					
				}
				
			});
			
			thread3.start();
			
		}
	}
