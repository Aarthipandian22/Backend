package com.java.basics;

public class AverageArray {

	public static void main(String[] args) {
		int [] arr = {1,2,3,4,5};
        int sum =0;
        int average = arr[0];
        for(int i=0; i<arr.length; i++) {
        	sum = sum+arr[i];
        	
        }
        double Average =(double) sum/arr.length;
        
        System.out.println("sum: "+sum);
        System.out.println("Average: "+Average);
	}

}
