package com.java.bascis;

public class SmallestArray {

	public static void main(String[] args) {
		int [] arr = {2,3,4,5,6};
		int smallest = arr[0];
		for(int i=0; i<arr.length;i++) {
			if(arr[i] < smallest) {
			  smallest = arr[i];
			}
			
		}
     System.out.println("Smallest number: "+smallest);
	}

}
