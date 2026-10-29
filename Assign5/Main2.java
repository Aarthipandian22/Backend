package com.java.basics;
class vehicle{
	void start() {
		System.out.println("vehicle is starting");
	}
	void stop() {
		System.out.println("vehicle is stopping");
	}
}
class car extends vehicle{
	void displaytype() {
		System.out.println("Type: car");
	}
}
class bike extends vehicle{
	void displaytype() {
		System.out.println("Type: bike");
	}
}
public class Main2 {
   
	public static void main(String[] args) {
		car c = new car();
		c.displaytype();
		c.start();
		c.stop();

		bike b = new bike();
		b.displaytype();
		b.start();
		b.stop();
	}

}
