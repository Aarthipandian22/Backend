package com.java.basics;

public class EmployeeCounter {
     String name;
     static int count=0;
     
     EmployeeCounter(String name) {
    	 this.name = name;
     }
     void Employeeregistration(){
    	 count++;
    	 System.out.println(name  +    "regsitered");
     }
     public static void main(String[] args) {
    	EmployeeCounter E1 = new EmployeeCounter("Aarthi");
    	 E1.Employeeregistration();
    	 EmployeeCounter E2 = new EmployeeCounter("veni");
    	 E2.Employeeregistration();
    	 EmployeeCounter E3 = new EmployeeCounter("hari");
    	 E3.Employeeregistration();
    	 System.out.println("Total Employee:" + count);
     }
     
}
