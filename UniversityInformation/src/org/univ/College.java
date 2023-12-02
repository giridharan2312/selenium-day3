package org.univ;

public class College extends University{
	@Override
	public void ug() {
		//super.ug();
		System.out.println("New ug course");
	}
	@Override
	public void pg() {
		//super.pg();
		System.out.println("New pg course");
	}
	public static void main(String[] args) {
		College clg = new College();
		clg.ug();
		clg.pg();
	}

}
