package myPractice;
import java.util.Scanner;
public class SmllrGrtrThan10n5 {
	private static Scanner sc;
			public static boolean lessThan10(int n) {
				boolean small=false;
				if(n<=10)
					small=true;
				return small;
		}
			public static boolean lessThan5(int n) {
				boolean small=false;
				if(n<=5)
					small=true;
				return small;
		}
			public static void main(String args[])
			{
				int ch;
				sc=new Scanner(System.in);
				do
				{
					int n=sc.nextInt();
					if(lessThan10(n)) {
						if(lessThan5(n)) {
							System.out.println("No is smaller than 10 & also sammler tham 5");
						}
						else {
							System.out.println("No is smaller than 10 & but not sammler tham 5");
						}
					}
					else
					{
						System.out.println("No is greator than 10");	
					}
					
					System.out.println("press 1 to continue");
					ch=sc.nextInt();
					
				}while(ch==1);
			}
	}



