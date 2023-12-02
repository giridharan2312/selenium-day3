package org.college;

public class Student extends College{
	private void studentName() {
		System.out.println("name");
	}
	private void studentDept() {
		System.out.println("dept");
	}
	private void studentId() {
		System.out.println("id");
	}
	
	public static void main(String[] args) {
		Student std = new Student();
		
		std.studentName();
		std.studentDept();
		std.studentId();
		
		std.collegeCode();
		std.collegeName();
		std.collegeRank();
		
		std.deptName();
		
		std.hostelName();
	}
		 
}
