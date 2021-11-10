package org.employee;
// class
public class EmployeeDetails {
	// method 1
	private void empName() {
		
		System.out.println("Employee name is : Anand");
	}
	// method 2
	private void empMob() {
		
		System.out.println("Employee mobile number is : 893927886");
	}
	// method 3
	private void empAdd() {
		
		System.out.println("Chennai");
	}
	// main method
	public static void main(String[] args) {
		// object
		EmployeeDetails e = new EmployeeDetails();
		// method call
		e.empName();
		e.empMob();
		
	}

}
