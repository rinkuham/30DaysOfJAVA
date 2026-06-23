package intro;
import java.util.Scanner;
public class typecast {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number you want to cast:");
		double num=sc.nextDouble();
		int newNum=(int) num;
		System.out.println("before casting:"+num);
		System.out.println("after casting:"+newNum);
		sc.close();
	}
}
