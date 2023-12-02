package com.hier;

public class SubClass3 extends Base {
	public void subClassMethod3() {
		System.out.println("subclass 3");
	}

	public static void main(String[] args) {
		
		SubClass1 sb1 = new SubClass1();
		sb1.subClassMethod1();
		
		SubClass2 sb2 = new SubClass2();
		sb2.subClassMethod2();
		
		SubClass3 sb3 = new SubClass3();
		sb3.subClassMethod3();
	}
}
