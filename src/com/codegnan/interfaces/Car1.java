package com.codegnan.interfaces;

public class Car1 implements Vehicle,Entertainment{

	@Override
	public void listenMusic() {
		System.out.println("Car1 has music option");
		
	}

	@Override
	public void watchMovie() {
		System.out.println("Car1 has movie option");
		
	}

	@Override
	public void turn() {
		
		System.out.println("Car1 turning");
		
	}

	@Override
	public void left() {
		System.out.println("Car1 turning left");
		
	}

	@Override
	public void right() {
		
		System.out.println("Car1 turning right");
		
	}

}
