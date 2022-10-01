package com.syntax.thursdayclass;

public class Employee {
	String name;
	String id;
	String department;
	double salary;
	String shift;
	
	void work() {
		System.out.println(name+" is workin "+shift+" shift");
	}
	void takeLeaves() {
		System.out.println(name+ "is going on a leave");
	}
	
	public static void main(String [] args) {
		Employee emp1=new Employee();
		emp1.name="John";
		emp1.id="456";
		emp1.department="IT";
		emp1.salary=200000;
		emp1.shift="evening";
		emp1.work();
		
		Employee emp2=new Employee();
		emp2.name="Adam";
		emp2.department="Sales";
		emp2.salary=150000;
		emp2.shift="Morning";
		emp2.work();
		
		
	}

}
