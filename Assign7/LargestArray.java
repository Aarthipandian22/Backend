package com.java.basics;

public class LargestArray {

	public static void main(String[] args) {
		int[] arr = {2,3,4,5,6};
        int largest = arr[0];
        for(int i=0;i<arr.length;i++) {
        	if(arr[i] > largest) {
        	largest = arr[i];
        	}
        }
	System.out.println("Largest number: "+largest);
	}
}
