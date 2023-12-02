package org.emp;

public class CompanyDetails {
	public CompanyDetails() // default constructor in parent class
	{
		System.out.println("Company Details - default constructor in parent class");
	}
	public CompanyDetails(int id)
	{
		System.out.println("Parent Company id constructor : " + id );
	}
}
