package org.test;

public class A extends B {
	private A() {
		super(12);
		System.out.println("Default const...");
	}

	public static void main(String[] args) {
		A a = new A();
	}

}
