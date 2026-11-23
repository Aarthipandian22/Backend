package com.java.basics;
import java.util.Map;
import java.util.LinkedHashMap;
public class CommerceMap {

	public static void main(String[] args) {
	  Map <Integer,String> orders = new LinkedHashMap<>();
       orders.put(101, "Laptop");
       orders.put(102,"Fan");
       orders.put(103,"Airconditioner");
       System.out.println(orders);
	}

}
