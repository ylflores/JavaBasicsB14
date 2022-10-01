package com.syntax.class06;

import java.util.Scanner;

public class EncCode {

	public static void main(String[] args) {
Scanner scanner= new Scanner(System.in);
System.out.println("What time is it?");
int hour=scanner.nextInt();
String timeOftheDay;
if(hour>=1 && hour<=11) {
	timeOftheDay="Morning";
}else if(hour>=12 && hour<=15) {
	timeOftheDay="Afternon";
}else if(hour>=16 && hour<=20) {
timeOftheDay="Evening";
	}else if(hour>=21 && hour<=24) {
		timeOftheDay="Night";
	}else {
		System.out.println("Wrong number");
		timeOftheDay="Invalid";
	}
System.out.println("");
	}
}
