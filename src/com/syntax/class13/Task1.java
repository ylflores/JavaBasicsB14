package com.syntax.class13;

public class Task1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String str="Java is love";
int length=str.length();
if(!str.isEmpty()&&length%2!=0&&str.length()>=3) {
	int middle=length/2;
	System.out.println(str.charAt(middle));
}
	}

}
