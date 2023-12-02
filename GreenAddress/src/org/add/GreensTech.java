package org.add;

public class GreensTech {
	
	private void greensOmr(int id) {                                      //data-types overloading
		System.out.println("Student id : " + id); 
	}

	private void greensOmr(String id) {                                   //data-types overloading
		System.out.println("Student id : " + id);
	}
	
	private void greensOmr(String name, int id) {						  //data-type-order overloading
		System.out.println("Student name : " + name + ", Student id  : " + id);
	}
	private void greensOmr(int id, String name) {                         //data-type-order overloading
		System.out.println("Student id  : " + id + ", Student name : " + name);
	}
	
	private void greensOmr(int id, String name , long phoneNo) {          //data-type-count overloading
		System.out.println("Student id  : " + id + ", Student name : " + name + ", Ph Num : " + phoneNo);
	}
	
	
	public static void main(String[] args) {
		GreensTech gt = new GreensTech();
		
		gt.greensOmr(1234);
		gt.greensOmr("EMP1234");
		gt.greensOmr("Dhinesh", 2001);
		gt.greensOmr(1001, "kumar");
		gt.greensOmr(1001, "dharsan" , 9876543210L);
	}
}

//QUESTION 5:
//-----------
//     Project   :GreensAddress
//     Package   :org.add
//     Class     :GreensTech
//     Methods   :greensOmr()
//
//Description
//You have to overload the method greensOmr() based on order,type,number.
