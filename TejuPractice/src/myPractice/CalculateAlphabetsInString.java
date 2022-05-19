package myPractice;
import java.util.*;
public class CalculateAlphabetsInString {
private static Scanner sc;
	public static void main(String[] args) {
		sc=new Scanner(System.in);
		System.out.println("Enter string");
		String CalcAlpha=sc.nextLine();
		char arr[]=CalcAlpha.toCharArray();
		int count=0;
		for(int i=0;i<arr.length;i++)
		{ 
			if(Character.isLetter(CalcAlpha.charAt(i))) {
			count++;	 
			}
		}
		System.out.println(count+"  are the no of alphabets");
	}
 
}
