package com.java.basics;

public class EmployeeDetails {
     int Employeeid;
     String Employeename;
     Double Employeesalary;
//     parameterized constructor
     EmployeeDetails(int id, String name, Double salary) {
    	 Employeeid = id;
    	 Employeename = name;
    	 Employeesalary = salary;
     }
//     calculate annualsalary
     double calculateannualsalary() {
    	return Employeesalary * 12;
     }
     
	void displayDetails() {
		System.out.println("Employeeid: "+Employeeid);
		System.out.println("Employeename: "+Employeename);
		System.out.println("Employeesalary: "+Employeesalary);
        System.out.println("Annualsalary: "+calculateannualsalary());
	}
	public static void main (String[] args) {
		EmployeeDetails e1 = new EmployeeDetails( 101, "Arun", 25000.0 );
		EmployeeDetails e2 = new EmployeeDetails(102, "Divya", 35000.0);
		EmployeeDetails e3 = new EmployeeDetails( 103, "Kumar", 40000.0);
	
     e1.displayDetails();
     e2.displayDetails();
     e3.displayDetails();
	}
     
}
