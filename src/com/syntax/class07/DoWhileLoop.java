package com.syntax.class07;

import java.util.Scanner;

public class DoWhileLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
String answer;
do {
    System.out.println("Did you get a job");
    answer=sc.nextLine();
}while(!answer.equals("Yes"));
	System.out.println("Congrats");
	}

}
