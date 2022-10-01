package com.syntax.class06;

import java.util.Scanner;

public class HW1 {

	public static void main(String[] args) {
		/* Ask user to enter their country and capture it. 
		 * Once values are captured print 
		 * which language user speaks.
		 */
Scanner input=new Scanner(System.in);
System.out.println("Please enter your country?");
String country=input.nextLine();
String language;
switch(country) {
case "France":
language="French";
break;
case "Ukraine":
	language="Ukrainian";
	break;
case "Brazil":
	language="Portuguese";
	break;
case "Australia":
	language="English";
	break;
case "South Korea":
	language="Korean";
	break;
	default:
		language="Unknown";
		break;

}
System.out.println("If you are from "+country+" then you must speak "+language );
	}

}
