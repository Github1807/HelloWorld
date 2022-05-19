package myPractice;
import java.util.*;
public class GreatestAmongThreeUsingFunctionCallNDoWhile {
	private static Scanner sc;
	public static int greatest(int a, int b, int c)
	{
		if(a>b)
		{
			if(a>c)
				return a;
			else
				return c;
		}
		else if(b>c) 
			return b;
		else
			return c;
	}
	public static void main(String[] args) {
	int i=1;
	sc=new Scanner(System.in);
	do
	{
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		System.out.println(greatest(a,b,c));
		System.out.println("if want to continue press 1");
		i=sc.nextInt();
	}
	while(i==1);
	}

}
