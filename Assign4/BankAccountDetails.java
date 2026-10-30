 package com.java.basics;

class Bankaccount {


private String accountHolder;
private double balance;

// Constructor
Bankaccount(String accountHolder, double balance) {
    this.accountHolder = accountHolder;
    this.balance = balance;
}

// Getter
public double getBalance() {
    return balance;
}

// Deposit method
public void deposit(double amount) {
    if (amount > 0) {
        balance = balance + amount;
        System.out.println("Deposited: " + amount);
    } else {
        System.out.println("Invalid deposit amount");
    }
}

// Withdrawal method
public void withdraw(double amount) {
    if (amount <= 0) {
        System.out.println("Invalid withdrawal amount");
    } else if (amount <= balance) {
        balance = balance - amount;
        System.out.println("Withdrawal successful: " + amount);
    } else {
        System.out.println("Insufficient balance");
    }
}

// Display account details
public void displayDetails() {
    System.out.println("Account Holder: " + accountHolder);
    System.out.println("Initial Balance: " + balance);
}

}

public class BankAccountDetails {


public static void main(String[] args) {

    Bankaccount account = new Bankaccount("Arun", 5000);

    account.displayDetails();

    account.deposit(2000);

    account.withdraw(1500);

    account.withdraw(10000);

    System.out.println("Final Balance: " + account.getBalance());
}


}

