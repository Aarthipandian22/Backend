package com.java.basics;

public class BankOperation {
    double deposit(double balance, double amount) {
    	balance = balance + amount;
    	return balance;
    }
    double withdraw(double balance, double amount) {
    	if(balance >= amount) {
    		balance = balance - amount;
    		return balance;
    	} else {
    		System.out.println("Insufficient balance");
    		return balance;
    	}
    }
    void checkBalance(double balance) {
    	System.out.println("current balance: "+ balance);
    }
    void displayTransactionSummary(
    		double initialBalance,
    		double depositAmount,
    		double withdrawalAmount,
    		double finalBalance) {
    	System.out.println("Initial Balance: "+initialBalance);
    	System.out.println("Deposited: "+ depositAmount);
    	System.out.println("withdraw: "+withdrawalAmount);
    	System.out.println("Final Balance: "+finalBalance);
    }
	public static void main(String[] args) {
		BankOperation bank = new BankOperation();
		double initialBalance = 5000.0;
		double depositAmount = 2000.0;
        double withdrawalAmount = 1500.0;
        double balance = bank.deposit(initialBalance, depositAmount);

        bank.checkBalance(balance);

        balance = bank.withdraw(balance, withdrawalAmount);

        bank.checkBalance(balance);

        bank.displayTransactionSummary(
                initialBalance,
                depositAmount,
                withdrawalAmount,
                balance);
	}

}
