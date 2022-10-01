package com.syntax.class13;

import java.util.Scanner;

public class Task3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub\
		String mom;
		String dad;
		String baby = null;
		String fHalf;
		String sHalf;
		
		
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("Please enter mother's name");
		mom=scanner.next();
		System.out.println("Please enter father's name");
		dad=scanner.next();
		System.out.println("Are you expecting boy or a girl?");
		baby=scanner.next();
		

if(baby.equals("Boy")) {
	 fHalf=dad.substring(0,dad.length()/2);
	 sHalf=mom.substring(mom.length()/2);
	
}else {
	 fHalf=mom.substring(0,mom.length()/2);
	 sHalf=dad.substring(dad.length()/2);
	
	
}System.out.println(fHalf+sHalf);
	}

}
