package com.syntax.class06;

import java.util.Scanner;

public class EncHW {

	public static void main(String[] args) {
Scanner scanner=new Scanner(System.in); 
System.out.println("Please enter your birth moth");
String birthMonth=scanner.next();
String season = null;
if(birthMonth.equals("March") || birthMonth.equals("April") || birthMonth.equals("May") ) {
	season="Spring";
}else if(birthMonth.equals("June") || birthMonth.equals("July") || birthMonth.equals("August")) {
	season="Summer";
} else if(birthMonth.equals("September") || birthMonth.equals("October") || birthMonth.equals("November") ) {
	season="Fall";
}else {
	season="Invalid Month";
}
	System.out.println("You were born in "+season);
	}

}
