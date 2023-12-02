package org.emp;

import java.util.LinkedList;
import java.util.List;

public class Company {
	public static void main(String[] args) {
		EmployeeDetails e1 = new EmployeeDetails();
		e1.setEmpId(101);
		e1.setEmpName("rajesh");
		e1.setPhoneNumber(9876543210l);

		
		EmployeeDetails e2 = new EmployeeDetails();
		e2.setEmpId(102);
		e2.setEmpName("dharan");
		e2.setPhoneNumber(9876523410l);
		 
		EmployeeDetails e3 = new EmployeeDetails();
		e3.setEmpId(103);
		e3.setEmpName("kumar");
		e3.setPhoneNumber(9835743210l);
		
		List<EmployeeDetails> li = new LinkedList<EmployeeDetails>();
		li.add(e1);
		li.add(e2);
		li.add(e3);
		
		for(EmployeeDetails r:li) {
			System.out.println(r.getEmpId());
			System.out.println(r.getEmpName());
			System.out.println(r.getPhoneNumber());
		}
	}

}
 