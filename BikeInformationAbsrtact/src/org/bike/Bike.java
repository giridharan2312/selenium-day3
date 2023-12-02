package org.bike; 

// parent class
// for abstract class we cannot create object
public abstract class Bike {
	
	public abstract void cost();  // abstract methods

	public abstract void colour();
	
	public abstract void speed();

	public void type()  // non - abstract methods
	{ 
		System.out.println("type is 2 wheeler");
	}
	
}


//contain both abstarct and non abstract methods - Abstartc class
