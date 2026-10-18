package com.java.basics;

public class AccountDetails {
       int accountnumber;
       String holdername;
       Double balance;
	//    No Parameter constructor
       AccountDetails(){
    	   accountnumber = 1001;
    	   holdername = "Priya";
    	   balance = 5000.0;
       }
      void displayAccount() {
    	   System.out.println("accountnumber: "+accountnumber);
    	   System.out.println("holdername: "+holdername);
    	   System.out.println("balance: "+balance);
       }
	public static void main(String[] args) {
	   AccountDetails a1 = new AccountDetails();
       a1.displayAccount();
	}

}
