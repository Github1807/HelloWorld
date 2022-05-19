package stringQues;
import java.util.*;
public class StringsArePalindromeOrNot {
private static Scanner sc;
	public static void main(String[] args) {
		sc=new Scanner(System.in);
		System.out.println("enter String to be Checked");
		String str=sc.nextLine();
		char ch[]=str.toCharArray();
//		System.out.println(Arrays.toString(ch));
		int i=0,j=ch.length-1;
		boolean isPalindrome=true;
		while(i<=j) {
			if(ch[i]!=ch[j]) {
				isPalindrome=false;
				break;
			} 
			i++;
			j--;
		}
		if(isPalindrome)
			System.out.println("is Palindrome");
		else
			System.out.println("Not palindrome");

	}

}
