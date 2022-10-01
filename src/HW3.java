import java.util.Scanner;

public class HW3 {

	public static void main(String[] args) {
		/*Using scanner class create calculator. Allow user to enter 2 numbers 
		 * and operator(+,-,*,/). Based on operator provide the result to user.
		 * Please complete this assignment in 2 ways: using if statement 
		 * and switch case.
		 */
		Scanner input= new Scanner(System.in);
		System.out.println("Please enter first number");
		double number1=input.nextDouble();
		System.out.println("Please enter second number");
		double number2=input.nextDouble();
		System.out.println("Please enter Arithmetic Operator");
		char op=input.next().charAt(0);
		double result = 0;
		
		if(op=='+') {
			result=number1+number2;
	
		}else if(op=='-') {
			result=number1-number2;
		}else if(op=='*') {
			result=number1*number2;
		}else if(op=='/') {
			result=number1/number2;
		}else {
			System.out.println("Invalid");
		}
		System.out.println(result);
		
		
		switch(op) {
		case '+':
			result=number1+number2;
			break;
		case '-':
			result=number1-number2;
		case '*':
			result=number1*number2;
			break;
		case '/':
			result=number1/number2;
			break;	
		}
		System.out.println(result);
	}

}
