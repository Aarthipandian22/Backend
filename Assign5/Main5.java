package com.java.basics;

class Person {

    String name;
    int age;

    Person(String name, int age) {

        this.name = name;
        this.age = age;

        System.out.println("Person constructor called");
    }
}

class Student2 extends Person {

    int rollNumber;

    Student2(String name, int age, int rollNumber) {

        super(name, age);

        this.rollNumber = rollNumber;

        System.out.println("Student constructor called");
    }

    void displayDetails() {

        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Roll Number: " + rollNumber);
    }
}

public class Main5 {

    public static void main(String[] args) {

        Student2 s = new Student2("Arun", 20, 101);

        System.out.println();

        s.displayDetails();
    }
}