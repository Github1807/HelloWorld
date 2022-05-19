package myPractice;
import java.util.Scanner;
public class CheckIfArrayIsPalindromeOrNot {
	private static Scanner sc;
		public static void main(String[] args) {
		int arr[]=new int[5];
		sc=new Scanner(System.in);
		for(int i=0;i<5;i++) 
			{
				arr[i]=sc.nextInt();
			}
		boolean isPalindrome=true;
		for(int j=0;j<=5/2;j++)
		{ 
			if(arr[j]!=arr[5-j-1])
			{
				isPalindrome=false;
			}
		}
		if(isPalindrome) 
		{
			System.out.println("The array is Palindrome");
		}
		else
		{
			System.out.println("The array is not palindrome");
		}
		
	}

}


