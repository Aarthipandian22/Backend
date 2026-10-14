package com.java.basics;

public class ElectricityBill {

    void calculateBill(int units) {

        double bill = 0;  // Local variable

        if (units <= 100) {
            bill = units * 2;
        }
        else if (units <= 200) {
            bill = (100 * 2) + ((units - 100) * 3);
        }
        else {
            bill = (100 * 2) + (100 * 3)
                    + ((units - 200) * 5);
        }

        System.out.println("Units consumed: " + units);
        System.out.println("Electricity bill: ₹" + bill);
    }

    public static void main(String[] args) {

        ElectricityBill e = new ElectricityBill();

        e.calculateBill(250);
    }
}

