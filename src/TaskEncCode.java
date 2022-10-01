import java.util.Scanner;

public class TaskEncCode {

	public static void main(String[] args) {
Scanner scanner=new Scanner(System.in);
System.out.println("Please enter your quiz score");
int quiz=scanner.nextInt();
System.out.println("Please enter your mid term score");
int midTerm=scanner.nextInt();
System.out.println("Please enter your finals score");
int finals=scanner.nextInt();
 double average;
 average=(quiz+midTerm+finals)/3;
String grade;
if (average>=90 && average<=100) {
	grade="A";	
	}else if(average>=70 && average<=90) {
	grade="B";
	}else if(average>=50 && average<=70) {
		grade="C";
	}else {
		grade="Invalid";
	}
System.out.println("Your grade is "+grade);
	}

}
