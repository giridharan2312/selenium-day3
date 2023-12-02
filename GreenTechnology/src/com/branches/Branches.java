package com.branches;

public class Branches  {
	protected void chennai() {
		System.out.println("chennai branch");
	}

	protected void bangalore() {
		System.out.println("bangalore branch");
	}

	protected void mumbai() {
		System.out.println("mumbai branch");
	}

	public static void main(String[] args) {
		Branches print = new Branches();
		print.bangalore();
		print.chennai();
		print.mumbai();
		
		
		
//		print.omr();
//		print.perungudi();
//		print.tambaram();
//		
//		print.instituteName();
//		
//		ChennaiBranch branches = new ChennaiBranch();
//    	branches.omr();
		
	}
}
