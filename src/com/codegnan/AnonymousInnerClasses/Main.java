package com.codegnan.AnonymousInnerClasses;

class Popcorn {

	public void flavour() {
		System.out.println("plain popcorn");
	}
}

class SweetFlavour extends Popcorn{
	
	public void flavour() {
		System.out.println("Sweet popcorn");
	}
}

public class Main{
	public static void main(String[] args) {
//		SweetFlavour s = new SweetFlavour();
//		s.flavour(); // output  : Sweet popcorn
		
		// Doing same thing as above using an Anonymous Inner class
		
		SweetFlavour s  = new SweetFlavour(){ 
				public void flavour() {
					System.out.println("Sweet popcorn");
				}
				
		};
		s.flavour(); // output : Sweet popcorn
		
	}
}
