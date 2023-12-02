package org.edu;

public class Arts extends Education{
	public void bSc() {
		System.out.println("B.sc");
	}

	public void bEd() {
		System.out.println("B.ed");
	}

	public void bA() {
		System.out.println("B.A");
	}

	public void bBa() {
		System.out.println("BBA");
	}
	@Override
	public void ug() {
		//super.ug();
		System.out.println("override ug method");
	}
	@Override
	public void pg() {
		//super.pg();
		System.out.println("override pg method");
	}


	public static void main(String[] args) {
		Arts art = new Arts();
		art.ug();
		art.pg();	
	}
	
}
