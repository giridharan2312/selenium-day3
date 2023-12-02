package org.emp;

public class EmployeeDetails {
	public void employeeId(int id) {
		System.out.println("Employee ID : " + id);
	}
	public void employeeDetails(double salary , String email) {
		System.out.println("Salary : " + salary + " Email : " +email);
	}
	
	public static void main(String[] args) {
		EmployeeDetails empinfo = new EmployeeDetails();
		empinfo.employeeId(1512);
		empinfo.employeeDetails(12345.56 , "test@gmail.com");
	}
	
}
