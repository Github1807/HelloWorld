package myPractice;
import java.util.Scanner;
public class FrequencyOfDigitInNumUsingDoWhileNFunction {
	private static Scanner sc;
	public static int frequency(int n, int num) {
		int count=0;
		while(num>0)
		{
			int a=num%10;
			num=num/10;
			if(n==a)
			{
				count++;
			} 
		}
		return count;
	}
	public static void main(String[] args) {
		sc=new Scanner(System.in);
		int ch;
		do
		{
			int n=sc.nextInt();
			int d=sc.nextInt();
			if(frequency(d,n)>0)
			{
				System.out.println(frequency(d,n));
			}
			else
			{
				System.out.println("No is not present");
			}
				System.out.println("press 1 to continue");
				ch=sc.nextInt();
			}
			while(ch==1);
		}
		

	}



