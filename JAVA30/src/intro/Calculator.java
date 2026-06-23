package intro;
import java.util.Scanner;
public class Calculator {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter first number:");
		double num1=sc.nextDouble();
		System.out.println("Enter second number:");
		double num2=sc.nextDouble();
		System.out.println("which operation do you want to perform?(+,-,*,/,%)");
		char op=sc.next().charAt(0);
		if(op=='+') {
			System.out.println(num1+num2);
		}
		else if(op=='-') {
			System.out.println(num1-num2);
		}
		else if(op=='*') {
			System.out.println(num1*num2);
		}
		else if(op=='/') {
			System.out.println(num1/num2);
		}
		else if(op=='%') {
			System.out.println(num1%num2);
		}
		else {
			System.out.println("invalid operation");
		}
		sc.close();
	}

}
