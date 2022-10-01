package com.syntax.thursdayclass;

public class Student {

	String name;
	String id;
	int age;
	double weight;
	char gender;
	
	void study() {
		System.out.println("Student is studying");
	}
	
	void deleteMessages() {
		System.out.println("Deleting mssages from Discord");
		
	}
	void eat() {
		System.out.println("Eating pizza");
	}
	
	public static void main(String [] args) {
		Student lizaObject=new Student();
		lizaObject.name="Liza";
		lizaObject.id="123";
		lizaObject.age=22;
		System.out.println(lizaObject.name);
		System.out.println(lizaObject.age );
		lizaObject.deleteMessages(); 
		
		Student student2=new Student();
		student2.name="Asma";
		student2.age=16;
		student2.weight=30;
		student2.gender='F';
		System.out.println(student2.name);
		student2.eat();
		
		
	}
	
	
}
