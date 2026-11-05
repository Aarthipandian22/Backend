package com.java.bascis;

public class NumberChangingpyramid {

	public static void main(String[] args) {
     int n=2;
     for(int i=1; i<=3;i++) {
    	 for(int j=1; j <= i+1;j++) {
    		 System.out.print(n+" ");
    		 n++;
    	 }
    	 System.out.println();
     }

	}

}
