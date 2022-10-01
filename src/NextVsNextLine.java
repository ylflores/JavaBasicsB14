import java.util.Scanner;

public class NextVsNextLine {

	public static void main(String[] args) {
	Scanner scanner=new Scanner(System.in);
	System.out.println("Do you have credit card? Answer true or false");
	boolean result=scanner.nextBoolean();
	if(result) {
		System.out.println("What is the balance on you card?");
	    int balance=scanner.nextInt();
	    if(balance>1000) {
	    	System.out.println("You need to pay");
	    	
	    } else {
	    	System.out.println("You can spend more");
	    }

	} else {
		System.out.println("We have a great offer");
	}
	}

}
