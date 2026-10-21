package com.java.basics;

public class EmployeeSalary {
      String employeename = "Aarthi";
      double grosssalary;
      double netsalary;
//      gross salary
      double calculatesalary(double basicsalary, double allowance) {
    	  grosssalary = basicsalary + allowance;
    	  return grosssalary;
      }
      double calculateNetsalary(double grosssalary, double deductions) {
    	  netsalary = grosssalary - deductions;
    	  return netsalary;
      }
      
      void displayDetails() {
    	  System.out.println("employee name: " + employeename);
    	  System.out.println("grosssalary: " + grosssalary);
    	  System.out.println("netsalary: "+netsalary);
      }
	public static void main(String[] args) {
		EmployeeSalary emp = new EmployeeSalary();
		emp.calculatesalary(25000, 5000);
        emp.calculateNetsalary(emp.grosssalary, 2000);
        emp.displayDetails();
	}

}
