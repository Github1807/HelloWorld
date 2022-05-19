package stringQues;
import java.util.*;
public class ReversingString {
private static Scanner sc;
	public static void main(String[] args) {
		sc=new Scanner(System.in);
		System.out.println("Enter string to be reversed");
		String str=sc.nextLine();
		String str1=""; char ch;
		//char ch[]=str.toCharArray();
		for(int i=0;i<str.length();i++)
		{
			ch=str.charAt(i);
			str1=ch+str1;
		}
		System.out.println(str1);
		}
		 
	}

 
