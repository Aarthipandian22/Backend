package com.java.bascis;

public class CountPositiveNegativeZero {

	public static void main(String[] args) {
		int [] arr = {3,4,6,-8,-9,-5,0};
	int positive = 0;
	int negative = 0;
	int zero = 0;
	for(int i=0;i<arr.length;i++) {
		if(arr[i]>0) {
			positive++;
		} else if(arr[i]<0){
			negative++;
		}else {
			zero++;
		}
	}
System.out.println("Positive number: "+positive);
System.out.println("Negative number: "+negative);
System.out.println("zero: "+zero);
	}

}
