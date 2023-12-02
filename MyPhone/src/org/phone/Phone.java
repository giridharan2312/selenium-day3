package org.phone;

public class Phone {
	private void phoneInfo(String model) {
		System.out.println("Model : " + model);
	}
	private void phoneInfo(String model, int id) {
		System.out.println("Model : " + model + ", Id: " +id);
	}
	private void phoneInfo(int id) {
		System.out.println("Id: " +id);
	}
	private void phoneInfo(int id, String model) {
		System.out.println("Id: " +id + ", Model : " + model);
	}
	public static void main(String[] args) {
		Phone info = new Phone();
		info.phoneInfo("samsung");
		info.phoneInfo("Nokia" , 1001);
		info.phoneInfo(12345);
		info.phoneInfo(2001,"vivo");
	
	}

}
//
//QUESTION 4:
//------------
//   Project     :MyPhone
//   Package     :org.phone
//   Class       :Phone
//   Methods     :phoneInfo()
//
//Description
//You have to overload the method phoneInfo() based on different datatype order in arguments.
