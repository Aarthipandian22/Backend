package com.java.basics;

public class LoginAttempt {

	public static void main(String[] args) {
		String correctpassword = "java123";
		String[] passwords = {"hello","world","java123"};
		int attempts = 0;
		while(attempts<3){
			String enteredpassword = passwords[attempts];
			attempts++;
			if(enteredpassword.equals(correctpassword)) {
				System.out.println("Login successfull");
			}else {
				System.out.println("Invalid password");
			}
		}

	}

}
