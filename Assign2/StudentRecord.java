package com.java.basics;

public class StudentRecord {
     int rollnumber;
     String name;
     int marks;
     StudentRecord(int rollnumber, String name, int marks){
    	 this.rollnumber=rollnumber;
    	 this.name=name;
    	 this.marks=marks;
     }
//     copy constructor
     StudentRecord(StudentRecord s){
    	 this.rollnumber=s.rollnumber;
    	 this.name=s.name;
    	 this.marks=s.marks;
     }
     void display() {
    	 System.out.println("rollnumber: " +rollnumber);
    	 System.out.println("name: " +name);
    	 System.out.println("marks: "+marks);
    	 System.out.println("----------");
     }
	public static void main(String[] args) {
		StudentRecord s1 = new StudentRecord(101,"Aarthi",85);
        StudentRecord s2 = new StudentRecord(s1);
        s2.marks=95;
        s1.display();
        s2.display();
	}

}
