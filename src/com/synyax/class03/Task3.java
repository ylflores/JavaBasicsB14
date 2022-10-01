package com.synyax.class03;

public class Task3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int month=5;
		if(month==1) {
			System.out.println("January");
		} else if(month==2) {
			System.out.println("February");
		} else if(month==3) {
			System.out.println("March");
		} else if(month==4) {
			System.out.println("April");
		} else if(month==5){
			System.out.println("May");
		} else if(month==6) {
			System.out.println("June");
			}else {
				System.out.println("Invalid Month");
			}
		String name;
		switch(month) {
		case 1:
			name="January";
			break;
		case 2:
			name="February";
			break;
		case 3:
			name="March";
			break;
		case 4:
			name="April";
			break;
			default:
				name="Invalid";
				break;
		
		}
	}

}
