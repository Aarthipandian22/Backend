package com.java.basics;

public class StudentResult {
     int total;
     double average;
     String grade;
     int calculateTotal(int m1, int m2, int m3, int m4, int m5) {
    	 total = m1+m2+m3+m4+m5;
    	 return total;
     }
     double calculateAverage(int total) {
    	 average = total/5.0;
    	 return average;
     }
     String calculategrade(double average) {
    	 if(average >= 90) {
    		 grade = "A";
    	 } else if(average >= 80) {
    		 grade = "B";
    	 } else if(average >= 70) {
    		 grade = "C";
    	 } else {
    		 grade = "fail";
    	 }
    	 return grade;
     }
     void displaydetails() {
    	 System.out.println("Total: "+ total);
    	 System.out.println("Average: "+ average);
    	 System.out.println("grade: "+grade);
     }
	public static void main(String[] args) {
		StudentResult Student = new StudentResult();
   	 Student.calculateTotal(85, 78, 92, 88, 77);
   	 Student.calculateAverage(Student.total);
   	 Student.calculategrade(Student.average);
   	 Student.displaydetails();

	}

}
