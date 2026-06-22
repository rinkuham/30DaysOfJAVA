package intro;
import java.util.Scanner;
public class UserInput {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter your age:");
		//taking input from user
		int age=sc.nextInt();
		//check age condition
		if(age>=18) {
			System.out.println("You are eligible to enter.");
		}
		else {
			System.out.println("You are not eligible to enter.");
		}
		sc.close();
	}

}
