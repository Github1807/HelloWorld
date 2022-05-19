package myPractice;
import java.util.*;
public class StringToCharArrayUsingFunction {
	private static Scanner sc;
	public static void main(String[] args) {
		sc=new Scanner(System.in);
		
		System.out.println("Enter the string which is to be converted");
		String Str=sc.nextLine();
		int l=Str.length();
		char arr[]=new char[l];
		for(int i=0;i<arr.length;i++) {
			arr=Str.toCharArray();
		}
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}

	}

}
