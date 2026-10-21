package com.java.basics;

public class ElectricityBill2 {
 double calculateBill(int units) {
	 double bill = 0;
	  if (units > 200) {
		  bill = 200+300+(units-200)*5;
	  } else if (units > 100) {
		  bill = 200+(units-100)*3;
	  } else {
		  bill = units * 2;
	  }
	  return bill;
 }
 double addfixedcharge(double bill) {
	 return bill + 50;
 }
 void displayBill(double energycharge, double finalbill) {
	 System.out.println("Energy charge: "+energycharge);
	 System.out.println("finalbill: "+finalbill);
 }
	public static void main(String[] args) {
		ElectricityBill2 eb = new ElectricityBill2();
       double energycharge = eb.calculateBill(250);
       double finalbill = eb.addfixedcharge(energycharge);
       
       eb.displayBill(energycharge, finalbill);
	}

}
