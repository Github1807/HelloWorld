package myPractice;
import java.util.Scanner;
	public class PrintingFirstAndSecondDigit{
		private static Scanner sc;
		public static void main(String[] args){
				sc=new Scanner(System.in);
				int n=sc.nextInt();
				while(n!=0)
				{
					int temp=n;
					int count=0;
					while(n!=0)
					{
						n=n/10;
						count++;
					}
					System.out.println(temp/((int) (Math.pow(10, count))/100));
				}
			}
	}
	