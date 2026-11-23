package com.java.basics;
import java.util.Map;
import java.util.HashMap;
public class EmployeeHashMap {

	public static void main(String[] args) {
	   Map <Integer,String> Employees = new HashMap<>();
       Employees.put(101, "Aarthi");
       Employees.put(102,"Raja");
       Employees.put(103, "nivi");
	System.out.println(Employees);
    Employees.put(101, "Sabi");
    System.out.println(Employees);
}
}
