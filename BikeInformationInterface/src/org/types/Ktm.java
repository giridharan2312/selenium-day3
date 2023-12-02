package org.types;

import org.bike.Bike;

// Child class

public class Ktm implements Bike,Spec {

	@Override
	public void cost() {
		System.out.println("cost is 2L");
	}

	@Override
	public void colour() {
		System.out.println("Colour is Black");
	}
	@Override
	public void speed() {
		System.out.println("Speed is 100km/hr");
		
	}
	@Override
	public void type() {
		System.out.println("Speed is 100km/hr");
		
	}
	
	@Override
	public void specific() {
		System.out.println("Spec can be called from another class");
	}


	public static void main(String[] args) {
		Ktm info = new Ktm();

		info.cost();
		info.colour();
		info.speed();
		
		info.type();
		info.specific();
	}

	
	
}
