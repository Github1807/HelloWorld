package myPractice;
import java.util.Scanner;
public class CheckIfNoPOsitiveORNegativeByFcallnDW {

			private static Scanner sc;
				public static String positiveNegative(int n) {
					String a;
					if(n>0)
						a="is positive no";
					else
						a="is negative no";
				return a;
			}
				public static void main(String args[])
				{
					int ch;
					sc=new Scanner(System.in);
					do
					{
						int n=sc.nextInt();
						System.out.println(positiveNegative(n));
						System.out.println("press 1 to continue");
						ch=sc.nextInt();
						
					}while(ch==1);
				}
		

	}


