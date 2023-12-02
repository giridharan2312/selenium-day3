package com.greens;

public class HelloWorld {
	
	private void printHelloWorld() {
		System.out.println("HelloWorld");
	}
	private void printWelcome() {
		System.out.println("hello welcome to java world");
		
	}
	
	private void printDay() {
		System.out.println("welcome to day1");
	}
	//ClassName objectName = new ClassName();   // new - keyword - object create - memory
	//objectNAME.methodName():  // object calls method to perform action
	
	public static void main(String[] args) {
		HelloWorld print=new HelloWorld();        //memory created
		print.printHelloWorld();                // method call 
		print.printDay();
		print.printWelcome();
		print.printDay();
	}
	
	
	
	
	
}
