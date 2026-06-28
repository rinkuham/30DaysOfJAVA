package intro;
import java.util.Scanner;
public class MiniATM {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		float balance=50000;
		System.out.println("Hello.Welcome to our mini ATM.");
		System.out.println("1. Check balance.");
		System.out.println("2.Withdraw.");
		System.out.println("3.Deposit.");
		System.out.println("4.Exit.");
		System.out.println("Choose an option:");
		int choice=sc.nextInt();
		switch(choice) {
		case 1:
			System.out.println(balance);
			break;
		case 2:
			System.out.println("Enter amount to be withdrawn:");
			float amount=sc.nextFloat();
			if(amount<=balance) {
			float currentbalance=balance-amount;
			System.out.println("Your current balance:"+currentbalance);
			}
			else {
				System.out.println("Insufficient balance");
			}
			break;
		case 3:
			System.out.println("Enter amount to be deposited:");
			float deposit=sc.nextFloat();
			balance=balance+deposit;
			System.out.println("Current balance: "+balance);
			break;
		case 4:
			System.out.println("Thank you for using our ATM!");
			break;
			default:
				System.out.println("invalid choice.");
		}
			sc.close();

	}

}
