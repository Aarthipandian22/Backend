package com.java.basics;

public class Product {
    int productid;
    String  productname;
    int productprice;
//    No argument parameter
    Product(){
    	productid = 101;
    	productname = "unknown";
    	productprice = 0;
    }
//    constructor with two parameter
    Product(int productid, String productname) {
    	this.productid = 102;
    	this.productname = "Fan";
    }
    Product(int productid, String productname, int productprice ){
    	this.productid = 103;
    	this.productname="washing machine";
    	this.productprice=25000;
    }
    void display() {
    	System.out.println("productid: "+ productid);
    	System.out.println("productname: "+productname);
    	System.out.println("productprice: "+productprice);
    	System.out.println("------------");
    }
	public static void main(String[] args) {
	   Product p1 = new Product();
       Product p2=new Product(102,"Fan");
       Product p3=new Product(103, "washing machine", 25000);
       
       p1.display();
       p2.display();
       p3.display();
	}
   
}
