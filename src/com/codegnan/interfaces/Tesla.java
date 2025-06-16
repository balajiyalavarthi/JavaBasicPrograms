package com.codegnan.interfaces;

public class Tesla implements Car {

	@Override
	public void turnDirection(String direction) {
		
		if(direction.equalsIgnoreCase("left")) {
			System.out.println("Turned left");
		}else {
			if(direction.equalsIgnoreCase("right")) {
				System.out.println("Turned Right");
			}
		}	
	}

	@Override
	public void acclerator(int points) {
		if(points >=100) {
			System.out.println("Overspeed");
		}else {
			if(points>0 && points <=100) {
				System.out.println("Accelerated "+points+" points");
			}
		}
		
	}

	@Override
	public void stop() {
		System.out.println("Tesla stopped");
		
	}
	
	public void checkWheels() {
		System.out.println("Tesla has 4 wheels ");
	}
	
	public void checkCarType() {
		System.out.println("Tesla is an automated car");
	}
	
	



	}
