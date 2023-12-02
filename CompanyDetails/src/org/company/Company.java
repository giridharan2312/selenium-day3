package org.company;

public class Company{
	public void companyName(String Name) {
		System.out.println("company name: " + Name );
	}
	public void companyName(String Name1, String Name2) {
		System.out.println(" 1st company name: " + Name1 + ", 2nd company name : " +Name2);
	}
	public void companyName(String Name3 , String Name4 , String Name5) {
		System.out.println(" 3rd company name: " + Name3 + ", 4th company name: " + Name4 + ", 5th company name: " + Name5 );
	}

	public static void main(String[] args) {
		Company inf = new Company();
		inf.companyName(" new company ");
		inf.companyName(" new company 1", "new company 2");
		inf.companyName(" new company 3", "new company 4", " new company 5");
	}

}

//
//QUESTION 3:
//------------
//   Project     :CompanyDetails
//   Package     :org.company
//   Class       :CompanyInfo
//   Methods     :companyName()
//
//Description
//You have to overload the method companyName() based on different Number of arguments.
