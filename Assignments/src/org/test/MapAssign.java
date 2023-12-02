package org.test;

import java.util.*;


public class MapAssign {
	public static void main(String[] args) {
		// Create a user-defined Map
		Map<String, Employee> employeeDetails = new TreeMap<>();

		// Define details for 10 employees
		Employee[] employees = {
				new Employee("1001", "John Doe", "1234567890", "123 Main St, Cityville", "1990-05-15", "2020-01-10",
						"john.doe@email.com", "Male", "50000"),
				new Employee("1002", "Jane Smith", "9876543210", "456 Oak Ave, Townsville", "1988-10-25", "2019-08-20",
						"jane.smith@email.com", "Female", "60000"),
				new Employee("1003", "Jane Smith", "9876543210", "456 Oak Ave, Townsville", "1988-10-25", "2019-08-20",
						"jane.smith@email.com", "Female", "60000"),
				new Employee("1004", "Jane Smith", "9876543210", "456 Oak Ave, Townsville", "1988-10-25", "2019-08-20",
						"jane.smith@email.com", "Female", "60000"),
				new Employee("1005", "Jane Smith", "9876543210", "456 Oak Ave, Townsville", "1988-10-25", "2019-08-20",
						"jane.smith@email.com", "Female", "60000"),
				new Employee("1006", "Jane Smith", "9876543210", "456 Oak Ave, Townsville", "1988-10-25", "2019-08-20",
						"jane.smith@email.com", "Female", "60000"),
				new Employee("1007", "Jane Smith", "9876543210", "456 Oak Ave, Townsville", "1988-10-25", "2019-08-20",
						"jane.smith@email.com", "Female", "60000"),
				new Employee("1008", "John Doe", "1234567890", "123 Main St, Cityville", "1990-05-15", "2020-01-10",
						"john.doe@email.com", "Male", "50000"),
				new Employee("1009", "John Doe", "1234567890", "123 Main St, Cityville", "1990-05-15", "2020-01-10",
						"john.doe@email.com", "Male", "50000"),
				new Employee("1010", "John Doe", "1234567890", "123 Main St, Cityville", "1990-05-15", "2020-01-10",
						"john.doe@email.com", "Male", "50000"),
				// Add details for other employees here
		};

		// Insert details for each employee into the Map
		for (Employee employee : employees) {
			employeeDetails.put(employee.getEmpId(), employee);
		}

		// Print the Map
		for (Map.Entry<String, Employee> entry : employeeDetails.entrySet()) {
			String empId = entry.getKey();
			Employee employee = entry.getValue();

			System.out.println("Employee ID: " + empId);
			System.out.println("Name: " + employee.getName());
			System.out.println("Phone: " + employee.getPhone());
			System.out.println("Address: " + employee.getAddress());
			System.out.println("Date of Birth: " + employee.getDob());
			System.out.println("Date of Joining: " + employee.getDoj());
			System.out.println("Email: " + employee.geteMail());
			System.out.println("Gender: " + employee.getGender());
			System.out.println("Salary: " + employee.getSal());
			System.out.println();
		}
	}
}