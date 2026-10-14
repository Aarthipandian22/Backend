package com.java.basics;

public class StudentDetails {
          String name;
          int Rollnumber;
          void registration (String studentname, int Rollno) {
        	  name = studentname;
        	  Rollnumber = Rollno;
          }
          void Display() {
        	  System.out.println("Name:"+name);
        	  System.out.println("Rollno:"+Rollnumber);
          }
          public static void main(String[] args) {
        	  StudentDetails S1 = new StudentDetails();
        	  S1.registration("Aarthi", 101);
        	  S1.Display();
        	  StudentDetails S2 = new StudentDetails();
        	  S2.registration("suba", 102);
        	  S2.Display();
        	  StudentDetails S3 = new StudentDetails();
        	  S3.registration("vetri", 103);
        	  S3.Display();
          }
}
