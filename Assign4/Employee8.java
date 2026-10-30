package com.java.basics;
class Employee6{
    void responsibility() {
    	System.out.println("Employees have general responsibilities");
    }
}
class Developer8 extends Employee6{
	@Override
	void responsibility() {
		System.out.println("Developer will write and test the code");
	}
}
class Manager8 extends Employee6{
	@Override
	void responsibility() {
		System.out.println("Manager is reponsive for managing the team");
	}
}
	

public class Employee8 {
    
	public static void main(String[] args) {
		Developer8 d = new Developer8();
		Manager8 m = new Manager8();
		d.responsibility();
        m.responsibility();
	}

}
