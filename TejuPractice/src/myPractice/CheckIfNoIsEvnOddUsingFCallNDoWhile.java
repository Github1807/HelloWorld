package myPractice;
import java.util.Scanner;
public class CheckIfNoIsEvnOddUsingFCallNDoWhile {
	private static Scanner sc;
		public static String odd_even(int n) {
			String a;
			if(n%2==0)
				a="is even no";
			else
				a="is odd no";
		return a;
	}
		public static void main(String args[])
		{
			int ch;
			sc=new Scanner(System.in);
			do
			{
				int n=sc.nextInt();
				System.out.println(odd_even(n));
				System.out.println("press 1 to continue");
				ch=sc.nextInt();
				
			}while(ch==1);
		}
}
