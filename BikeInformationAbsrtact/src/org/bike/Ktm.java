package org.bike; 

// Child class

public class Ktm extends Bike {

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

	public static void main(String[] args) {
		Ktm info = new Ktm();

		info.cost();
		info.colour();
		info.speed();
	}

}
