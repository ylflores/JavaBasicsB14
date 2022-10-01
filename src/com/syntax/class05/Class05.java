package com.syntax.class05;

import java.util.Scanner;

public class Class05 {

	public static void main(String[] args) {
		
 Scanner input=new Scanner(System.in);
 System.out.println("Please enter your name");
  String name=input.next();
  System.out.println("How old are you "+name);
  int age=input.nextInt();
  System.out.println(name+" is "+age+" years old");
   
  System.out.println("How much money do you have?");
   double money=input.nextDouble();
   System.out.println(name+" has $"+money);
   System.out.println("What is your grade?");
   char grade=input.next().charAt(0);
   System.out.println(name+" has grade "+grade);
	
	
	}

}
