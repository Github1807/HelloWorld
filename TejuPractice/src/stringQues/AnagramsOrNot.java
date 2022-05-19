package stringQues;
import java.util.*;
public class AnagramsOrNot {
private static Scanner sc;
	public static void main(String[] args) {
		sc=new Scanner(System.in);
		System.out.println("Enter first String");
		String str1=sc.nextLine(); 
		System.out.println("Enter second string");
		String str2=sc.nextLine();
		boolean status=false;
		if(str1.length()==str2.length()) {
			status =true;
			char ch1[]=str1.toCharArray();
			char ch2[]=str2.toCharArray();
			Arrays.sort(ch1);
			Arrays.sort(ch2);
			status=Arrays.equals(ch1, ch2);
		}
		if(status) {
			System.out.println("Are ANagrams");
		}
		else
			System.out.println("are not anagrams");
		
	}

}
