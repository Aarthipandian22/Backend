package com.java.basics;
import java.util.Map;
import java.util.TreeMap;
public class StudentMap {

	public static void main(String[] args) {
		Map <Integer,String> Students = new TreeMap<>();
        Students.put(103, "Aarthi");
        Students.put(104,"Ram");
        Students.put(102, "Vishwa");
        System.out.println(Students);
	}

}
