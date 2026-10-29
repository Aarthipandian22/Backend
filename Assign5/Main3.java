package com.java.basics;
class BankAccount2{
	String accountholder;
	double balance;

void displayBankdetails() {
	System.out.println("Account holder: "+accountholder);
	System.out.println("Balance: "+balance);
}
}
class savingsaccount extends BankAccount2{
	double interestrate;
	void displaysavingsdetails() {
		displayBankdetails();
		System.out.println("Interest: "+interestrate+"%");
	}
}
class PremiumSavingsAccount extends savingsaccount{
	String benefits;
	void displaypremiumdetails() {
		displaysavingsdetails();
		System.out.println("Benefits: "+benefits);
	}
}
public class Main3 {
    public static void main(String[] args) {
    	PremiumSavingsAccount p = new PremiumSavingsAccount();
    	p.accountholder = "Aarthi";
    	p.balance = 50000;
    	p.interestrate = 6.5;
    	p.benefits = "Free Debit Card";
    	p.displaypremiumdetails();
    }
}
