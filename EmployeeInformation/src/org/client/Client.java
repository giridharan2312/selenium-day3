package org.client;

import org.company.Company;

public class Client extends Company{
	public static void clientName() {
		System.out.println("client name");
	}
	@Override
	public void companyName(){
		System.out.println("The company name is TCS"); //final method can't be overwritten
		//super.companyName();
	}
	public static void main(String[] args) {
		Client cli = new Client();
		cli.companyName();
		clientName();
		//Company.companyName(); //static method in other class - classname.method name
	}
	
	
}
