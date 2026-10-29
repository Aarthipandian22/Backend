package com.java.basics;

public class Atmwithdrawal {
    
	public static void main(String[] args) {
		int correctPIN = 1234;
		int enteredPIN = 1234;
		double balance = 5000;
		double amount = 2000;
		if(enteredPIN != correctPIN) {
			System.out.println("IncoorectPIN");
		}else if(amount > balance) {
			System.out.println("Insufficient balance");
		}else {
			balance = balance-amount;
			System.out.println("withdrwal successful");
			System.out.println("Remaining balance: "+balance);
		}

	}

}
