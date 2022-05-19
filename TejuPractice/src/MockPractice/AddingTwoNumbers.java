package MockPractice;
import java.util.*;

public class AddingTwoNumbers {
	private static Scanner sc;
	public static void main(String[] args) {
		sc=new Scanner(System.in);
		System.out.println("Enter numbers to be added");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=a+b; 
		System.out.println("The sum of two numbers is "+c);

	}

}
