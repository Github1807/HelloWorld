package MockPractice;
import java.util.*;
public class ArrayIsPalindromeOrNot {
private static Scanner sc;
	public static void main(String[] args) {
		sc=new Scanner(System.in);
		System.out.println("Size");
		int n=sc.nextInt();
		int arr[]=new int[n];
		System.out.println("Elements");
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		boolean isPalindrome=false;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==arr[(n-1)-i]){
				isPalindrome=true;
			} 
			
		}
		if(isPalindrome) {
			System.out.println("is Palindrome");
		}
		else
			System.out.println("Not Palindrome");

	}

}
