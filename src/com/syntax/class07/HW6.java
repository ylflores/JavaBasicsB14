package com.syntax.class07;

import java.util.Scanner;

public class HW6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner input=new Scanner (System.in);
double coffee=5.5;
double money;
System.out.println("Please pay for your coffee");

do { 
	money=input.nextDouble();
if(money>coffee) {
	System.out.println("Please give less money");
}else if(money<coffee) {
	System.out.println("Please give more money");
}
} while(money!=coffee); {
	System.out.println("Enjoy your coffee");
	}
}
	}

