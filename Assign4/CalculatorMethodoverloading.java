package com.java.basics;
class Calculator{
	int add(int a, int b) {
		return a+b;
	}
	double add(double a, double b){
		return a+b;
	}
}
public class CalculatorMethodoverloading {

	public static void main(String[] args) {
		Calculator c = new Calculator();
        System.out.println("Integer addition: "+c.add(5, 6));
        System.out.println("Dcimal addition: "+c.add(2.5, 3.5));
	}

}
