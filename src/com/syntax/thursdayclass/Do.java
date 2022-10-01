package com.syntax.thursdayclass;

public class Do {
String name;
String color;
String breed;
double weight;
int age;

void bark() {
	System.out.println("Barking....");
	
}

void sleep() {
	System.out.println("Dog is sleeping....");
}

public static void main(String[] args) {

	Do dog1= new Do();
	dog1.bark();
	dog1.sleep();
	
}
}
