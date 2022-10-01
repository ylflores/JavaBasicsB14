import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {
Scanner scan=new Scanner(System.in);
int day=0;
if(day>=1 && day<=5) {
	System.out.println("Its weekend");
}else if(day>=6 && day<=7) {
	System.out.println("Its weekday");
}else {
	System.out.println("Invalid");
}

	}

}
