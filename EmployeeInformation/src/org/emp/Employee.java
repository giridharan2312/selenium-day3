package org.emp;
import org.client.Client;
import org.company.Company;
import org.project.Project;

public class Employee {

	private void empName() {
		System.out.println("empName");
	}

	public static void main(String[] args) {
		Employee empy = new Employee();
		empy.empName();
		
		Company cmpy = new Company();
		cmpy.companyName();
		
		Client cli = new Client();
		cli.clientName();
		
		Project prj = new Project();
		prj.projectName();
	}

}
//QUESTION 6:
//-----------
//     Project   :EmployeeInformation
//
//     Package   :org.emp
//     Class     :Employee
//     Methods   :empName()
//
//     Package   :org.company
//     Class     :Company
//     Methods   :companyName()
//
//     Package   :org.client
//     Class     :Client
//     Methods   :clientName()
//
//     Package   :org.project
//     Class     :Project
//     Methods   :projectName()
//Description:
//Create an object for all 4 classes  inside the Employee class
//and call all classes methods also follow the all coding standards.
