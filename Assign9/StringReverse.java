package com.java.basics;

public class StringReverse {

    public static void main(String[] args) {
        String str = "java is easy";
        String reversed = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            char ch = str.charAt(i);
            reversed += ch;
        }

        System.out.println(reversed);
    }
}