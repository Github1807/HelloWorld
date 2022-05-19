package stringQues;
import java.util.*;
public class CalculateAlphabetsinString {
private static Scanner sc;
	public static void main(String[] args) {
		sc=new Scanner(System.in);
		System.out.println("Enter string");
		String str=sc.nextLine();
		char ch[]=str.toCharArray();
		int count=0;
		for(int i=0;i<str.length();i++) { 
			if(Character.isLetter(str.charAt(i))) {
				count++;
			} 
		}
		System.out.println("the alphabets in strings are "+count);
	}

}
