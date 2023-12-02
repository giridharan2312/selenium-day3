package org.emp;

public class Employee {

	public void empId(int id) {
		System.out.println("empId : " + id );
	}
	public void empId(String id) {
		System.out.println("empId : " + id );
	}
	public void empId(long id) {
		System.out.println("empId : " + id );
	}
	
	public static void main(String[] args) {
		Employee empId = new Employee();
		empId.empId(12345);
		empId.empId("EMP101");
		empId.empId(1234567890L);
	}
}


//QUESTION 2:
//------------
//     Project   :EmployeeDetails
//     Package   :org.emp
//     Class     :Employee 
//     Methods   :empId()
//
//Description
//You have to overload the method empId() based on
//different datatype in arguments.
