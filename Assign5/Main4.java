package com.java.basics;
class product{
	int productid;
	int price;

void displayproductdetails() {
	System.out.println("productid: "+productid);
	System.out.println("price: "+price);
}
}
class Electronics extends product{
	void displaycategory() {
		System.out.println("category:Electronics");
	}
}
class clothing extends product{
	void displaycategory() {
		System.out.println("category:clothing ");
	}
}
class books extends product{
	void displaycategory() {
		System.out.println("category:books");
	}
}
public class Main4 {

	public static void main(String[] args) {
		Electronics e = new Electronics();
        e.productid = 101;
        e.price = 4000;
        System.out.println("Electronice details");
        e.displayproductdetails();
        e.displaycategory();
        System.out.println();

        clothing c = new clothing();

        c.productid = 102;
        c.price = 1500;

        System.out.println("Clothing Details:");
        c.displayproductdetails();
        c.displaycategory();

        System.out.println();

        books b = new books();

        b.productid = 103;
        b.price = 500;

        System.out.println("Books Details:");
        b.displayproductdetails();
        b.displaycategory();
	}

}
