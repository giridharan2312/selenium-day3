package com.greens;

import com.branches.ChennaiBranch;
import com.institute.GreensTech;

public class Courses extends ChennaiBranch{

	protected void printCourseJava() {

		System.out.println("java");

	}

	protected void printSelenium() {
		System.out.println("Selenium");
	}

	protected void printAutomation() {
		System.out.println("Automation");
	}

	public static void main(String[] args) {
		Courses print = new Courses();
		print.printAutomation();
		
		ChennaiBranch branches = new ChennaiBranch();
    	print.omr();
		
		print.printCourseJava();
		print.printSelenium();
	}
}
