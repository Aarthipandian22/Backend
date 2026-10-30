package com.java.basics;
class Student{
	String name;
	int age;
	Student(String name){
		this.name = name;
		this.age = 0;
	}
	Student(String name, int age){
		this.name = name;
		this.age = age;
	}
	void display() {
		System.out.println("Name: "+name);
		System.out.println("Age: "+age);
	}
}
public class StudentManagement {

	public static void main(String[] args) {
	Student s1 = new Student("Aarthi");
    Student s2 = new Student("Alice",21);
    s1.display();
    s2.display();
	}

}
