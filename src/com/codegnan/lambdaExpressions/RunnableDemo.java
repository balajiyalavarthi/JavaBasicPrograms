package com.codegnan.lambdaExpressions;

public class RunnableDemo {

	public static void main(String[] args) {
		Runnable r= ()->{
			for(int i = 0; i<5;i++) {
				System.out.println("hello");
			}
		};

		Thread t = new Thread(r);
		t.start();
	}

}
