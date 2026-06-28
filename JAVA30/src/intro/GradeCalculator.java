package intro;
import java.util.Scanner;
public class GradeCalculator {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your marks.");
		System.out.println("Maths:");
		int maths=sc.nextInt();
		System.out.println("science:");
		int sci=sc.nextInt();
		System.out.println("social:");
		int soc=sc.nextInt();
		System.out.println("english:");
		int eng=sc.nextInt();
		int avg=(maths+sci+soc+eng)/4;
		System.out.println("Your average grade is:"+avg);
		if(avg>=90) {
			System.out.println("A");
		}
		else if(avg>=80) {
			System.out.println("B");
		}
		else if(avg>=65) {
			System.out.println("C");
		}
		else if(avg>=45){
			System.out.println("D");
		}
		else {
			System.out.println("Fail");
		}
		sc.close();
}

}
