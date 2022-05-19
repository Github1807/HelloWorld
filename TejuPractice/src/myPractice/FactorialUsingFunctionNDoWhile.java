package myPractice;
import java.util.*;
public class FactorialUsingFunctionNDoWhile {
	private static Scanner sc;
	
	public static void main(String[] args) {
	    sc=new Scanner(System.in);
		int ch;
		do
		{
			int n=sc.nextInt();
			System.out.println(getFact(n));
			System.out.println("If u want to continue press 1");
		    ch=sc.nextInt();
		}
		while(ch==1);
	}
	public static int getFact(int n)
	{
		int  res=1;
		
		for(int i=0;i<=n;i++) {
			res=res*i;}
			return res;
		}
	}
	

