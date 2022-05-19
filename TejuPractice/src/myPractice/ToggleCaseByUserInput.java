package myPractice;
import java.util.Scanner;
public class ToggleCaseByUserInput {
	private static Scanner sc;
		public static void main(String[] args)
		{
		sc=new Scanner(System.in);
		char ch=sc.nextLine().charAt(0);
		
		if(ch>=97 && ch<=122)
			{
				char uc=(char)(ch-'a'+'A');
				System.out.println(uc); 
			}
		else if(ch>=65 && ch<=90)
			{  
				char lc=(char)(ch-'A'+'a');
				System.out.println(lc);
			}
		else {
			System.out.println("Invalid Input");
		}

	}

}
