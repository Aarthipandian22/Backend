package com.java.basics;

public class Shoppingcart {
    double totalamount;
    double discount;
    double finalamount;
    double calculatetotalamount(double p1, double p2, double p3) {
    	totalamount = p1+p2+p3;
    	return totalamount;
    }
    double calculatediscount(double total, String membership) {
    	if( membership.equalsIgnoreCase("gold")) {
    		discount= total * 0.20;
    	} else if (membership.equalsIgnoreCase("silver")) {
    		discount = total * 0.10;
    	}else {
    		discount = total * 0.05;
    	}
    	return discount;
    }
    double calculatefinalamount(double total, double discount) {
    	finalamount = total-discount;
    	return finalamount;
    }
    void displaydetails() {
    	System.out.println("Total Amount: " + totalamount);
    	System.out.println("Discount: " + discount);
    	System.out.println("Final Amount: " + finalamount);
    }
	public static void main(String[] args) {
		Shoppingcart cart = new Shoppingcart();
		cart.calculatetotalamount(2000, 1500, 500); 
		cart.calculatediscount(cart.totalamount, "Gold"); 
		cart.calculatefinalamount(cart.totalamount, cart.discount); 
		cart.displaydetails();

	}

}
