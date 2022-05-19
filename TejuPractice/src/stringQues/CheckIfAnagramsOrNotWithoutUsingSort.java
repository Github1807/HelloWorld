package stringQues;
import java.util.*;
public class CheckIfAnagramsOrNotWithoutUsingSort {
private static Scanner sc;
	public static void main(String[] args) {
		sc=new Scanner(System.in);
		System.out.println("enter string 1");
		String str1=sc.nextLine();
		System.out.println("enter string 2");
		String str2=sc.nextLine();
		boolean status=true;
		int arr[]=new int[26];
		if(str1.length()!=str2.length())
			status=false;
		for(int i=0;i<str1.length();i++)
			arr[Character.valueOf(str1.charAt(i))-Character.valueOf('a')]+=1;
		for(int i=0;i<str2.length();i++)
			arr[Character.valueOf(str2.charAt(i))-Character.valueOf('a')]-=1;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]!=0) {
				status=false;
			}
		}
		System.out.println(status);

}}
