package com.syntax.class04;

import java.util.Scanner;

public class InputKeyboard {

	public static void main(String[] args) {
Scanner scanner=new Scanner(System.in);
System.out.println("Did you solve Repl Assignments");
boolean solvedAnyRepls=scanner.nextBoolean();
if(solvedAnyRepls) {
	System.out.println("How many you soved?");
	int noOfReplsSolved=scanner.nextInt();
	if(noOfReplsSolved>=17) {
		System.out.println("You are doing great");
	} else if(noOfReplsSolved>10) {
		System.out.println("You are doing ok. Please complete them ASAP");
	} else {
		System.out.println("You should solve more");
	}
}else {
	System.out.println("They are very important");
}

	}

}
