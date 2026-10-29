package com.java.basics;

class Employee4 {

    String name;
    double salary;

    void displayEmployee4() {
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
    }
}

class Developer4 extends Employee4 {

    String programmingLanguage;

    void displayDeveloper4() {
        displayEmployee4();
        System.out.println("Programming Language: " + programmingLanguage);
    }
}

class Tester extends Employee4 {

    String testingTool;

    void displayTester() {
        displayEmployee4();
        System.out.println("Testing Tool: " + testingTool);
    }
}

public class Main1 {

    public static void main(String[] args) {

        Developer4 d = new Developer4();

        d.name = "Arun";
        d.salary = 40000;
        d.programmingLanguage = "Java";

        System.out.println("Developer Details:");
        d.displayDeveloper4();

        System.out.println();

        Tester t = new Tester();

        t.name = "Priya";
        t.salary = 35000;
        t.testingTool = "Selenium";

        System.out.println("Tester Details:");
        t.displayTester();
    }
}