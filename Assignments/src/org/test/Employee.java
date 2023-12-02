package org.test;

public class Employee {
		private String empId;
		private String name;
		private String phone;
		private String address;
		private String dob;
		private String doj;
		private String eMail;
		private String gender;
		private String sal;

		// Constructor
		public Employee(String empId, String name, String phone, String address, String dob, String doj, String eMail,
				String gender, String sal) {
			this.empId = empId;
			this.name = name;
			this.phone = phone;
			this.address = address;
			this.dob = dob;
			this.doj = doj;
			this.eMail = eMail;
			this.gender = gender;
			this.sal = sal;
		}

		// Getters
		public String getEmpId() {
			return empId;
		}

		public String getName() {
			return name;
		}

		public String getPhone() {
			return phone;
		}

		public String getAddress() {
			return address;
		}

		public String getDob() {
			return dob;
		}

		public String getDoj() {
			return doj;
		}

		public String geteMail() {
			return eMail;
		}

		public String getGender() {
			return gender;
		}

		public String getSal() {
			return sal;
		}
	}


