package com.syntax.class07;

import java.util.Scanner;

public class HW5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner (System.in);
	String name = null;
	int n=1;
	while(n<=3) {
		System.out.println("Please enter your name");
	    name=input.nextLine();
	    n++;
	} 
	System.out.println("Good afternoon "+name);
		

	}

}
