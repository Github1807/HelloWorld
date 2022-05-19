package myPractice;
import java.util.Scanner;

public class Factorial {
	private static Scanner sc;
	public static void main(String[] args) {
		sc=new Scanner(System.in);
		int n=sc.nextInt();
		int fact=1;
		while(n!=0)
		{
			fact=fact*n;
			n--;
		}
			System.out.println("The Factorial of given number is"+" "+fact);
	}

}
 