package com.java.basics;

public class StudentInformation {
     int id;
     String name;
     String course;
     void displayDetails() {
    	 System.out.println("studentid: "+ id);
    	 System.out.println("studentname: "+ name);
    	 System.out.println("course: " + course);
     }
	public static void main(String[] args) {
		StudentInformation s1 = new StudentInformation();
        s1.displayDetails();
	}

}
