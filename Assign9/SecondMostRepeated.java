package com.java.basics;

public class SecondMostRepeated {

    public static void main(String[] args) {

        String str = "aabbcccdddd";

        int max = 0;
        int secondMax = 0;

        char maxChar = ' ';
        char secondChar = ' ';

        for (int i = 0; i < str.length(); i++) {

            int count = 0;

            for (int j = 0; j < str.length(); j++) {

                if (str.charAt(i) == str.charAt(j)) {
                    count++;
                }
            }

            if (count > max) {

                secondMax = max;
                secondChar = maxChar;

                max = count;
                maxChar = str.charAt(i);

            } else if (count > secondMax && count < max) {

                secondMax = count;
                secondChar = str.charAt(i);
            }
        }

        System.out.println("Second most repeated character: " + secondChar);
        System.out.println("Frequency: " + secondMax);
    }
} 