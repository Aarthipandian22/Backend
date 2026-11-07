package com.java.basics;

public class StringSwiss {

	public static void main(String[] args) {
	String str = "swiss";
	for (int i=1;i<str.length();i++) {
		char ch = str.charAt(i);
		int count =0;
		for(int j=1;j<str.length();j++) {
			if(ch == str.charAt(j)){
				count++;
			}
		}
			if(count ==1) {
				System.out.println(ch);
				break;
			}
		}
	}

	}


