package com.syntax.thursdayclass;

public class Phone {

	String make;
	String model;
	String color;
	int storage;
	double size;
	boolean cheap;
	void call() {
		System.out.println("calling...");
	}
	void takePicture() {
		System.out.println("Taking pictures...");
	}
	public static void main(String[]args) {
		Phone iphone=new Phone();
		iphone.make="apple";
		iphone.model="Iphone 14";
		iphone.color="Black";
		iphone.storage=128;
		iphone.size=6.8;
		iphone.cheap=false;
		System.out.println("Make "+iphone.make+" Model "+iphone.model);
		
		Phone samsung=new Phone();
		samsung.make="Samsung";
		samsung.model="S22 Ultra";
		samsung.color="Grey";
		samsung.cheap=false;
		
		System.out.println(iphone.make);
		System.out.println(samsung.make);
		 
	}
}
