package myPractice;
import java.util.*;
public class VowelsInString {
private static Scanner sc;
	public static void main(String[] args) {
		sc=new Scanner(System.in);
		System.out.println("Enter String");
		String str=sc.nextLine();
		char arr[]=str.toCharArray();
		int count=0;
		for(int i=0;i<arr.length;i++) 
		{
			if(arr[i]=='a'||arr[i]=='e'||arr[i]=='i'||arr[i]=='o'||arr[i]=='u')
			{ 
				count++;
			}
		}
		System.out.println(count +" are the no of vowels");
	}

}
