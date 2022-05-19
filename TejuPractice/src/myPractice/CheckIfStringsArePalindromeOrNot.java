package myPractice;
import java.util.Scanner;
import java.util.Arrays;
public class CheckIfStringsArePalindromeOrNot {
	private static Scanner sc;
	public static void main(String args[]) {
		sc=new Scanner(System.in);
		System.out.println("Enter the String");
		String str=sc.nextLine();
		char arr[]=str.toCharArray();
		System.out.println(Arrays.toString(arr));
		boolean flag=true;
		for(int i=0,j=arr.length-1;i<j;i++,j--)
		{ 
			if(arr[i]!=arr[j]) {
				flag=false;
				break; 
			} 
			
		}  
		
		System.out.println("The given string is palindrome is "+flag);
		
	}
	
	
}	
	
	
	 
	
	
	
	
	
	
	
	
	

//	private static Scanner sc;
//		public static void main(String args[]) {
//			 sc=new Scanner(System.in);
//			System.out.println("Enter the string to be converted in char array & to be checked if it is palindrome or not");
//			System.out.println("Assumin upper & Lower case");
//			String a=sc.nextLine();
//			char arr[]=a.toCharArray();
//			System.out.println(Arrays.toString(arr));
//			boolean flag= true;
//			for(int i = 0, j = arr.length-1; i<j; i++, j--) {
//				if(arr[i] != arr[j]) {
//					flag=false;
//					break;
//				}
//			}
//			System.out.println("ans for array is"+flag);

	
