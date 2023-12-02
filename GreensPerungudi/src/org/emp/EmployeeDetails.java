package org.emp;

public class EmployeeDetails extends CompanyDetails {
	public EmployeeDetails() // default constructor in child class
	{
		this(10);
		System.out.println("List of Ëmployee details - default constructor in child class");
	}
	public EmployeeDetails(int id) {
		this("giri@gmail.com");
		System.out.println("Child constructor with id : "+ id);
	}
	public EmployeeDetails(String email) {
		System.out.println("Child constructor with String Email : " +email);
	}

	private void employeeId() {
		System.out.println("Employee ID ");
	}

	private void employeeName() {
		System.out.println("Employee Name");
	}

	public static void main(String[] args) {
//		EmployeeDetails empDetails = new EmployeeDetails();
//		EmployeeDetails emp1 = new EmployeeDetails(1);
//		EmployeeDetails emp2 = new EmployeeDetails("giri@gmail.com");
//		CompanyDetails cmp = new CompanyDetails(20);		
//		empDetails.employeeId();
//		empDetails.employeeName();
//		
		EmployeeDetails empDetails = new EmployeeDetails();
	}
}
