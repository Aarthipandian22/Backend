package com.java.basics;

public class StudentGradeSystem {

	public static void main(String[] args) {
		int marks = 85;
		if(marks < 0 || marks > 100) {
			System.out.println("invalid marks");
		} else if (marks>=90) {
			System.out.println("Grade A");
		}else if(marks >= 75){
			System.out.println("Grade B");
		} else if (marks >= 50) {
			System.out.println("Grade c");
		}else {
			System.out.println("Fail");
		}

	}

}
