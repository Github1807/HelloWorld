package myPractice;
import java.util.Scanner;

public class FindingGreatestAmongThreeByNestedIfElse {
	private static Scanner sc;
		public static void main(String[] args) {
			sc=new Scanner(System.in);
			int a=sc.nextInt();
			sc=new Scanner(System.in);
			int b=sc.nextInt();
			sc=new Scanner(System.in);
			int c=sc.nextInt();
			if(a>b)
			{
				if(a>c) {
					System.out.println("The"+a+"is greatest");
				}
				else
				{
					System.out.println("The"+c+"is greatest");
				}
			}
			else
			{
				if(b>a)
				{
					System.out.println("The" +b+ "is greatest");
				}
				else
				{
					System.out.println("The"+c+"is greatest");
				}
			}
		}
	}
		