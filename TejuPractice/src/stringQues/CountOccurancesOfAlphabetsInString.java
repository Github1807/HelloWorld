package stringQues;
import java.util.*;
public class CountOccurancesOfAlphabetsInString {
private static Scanner sc;
	public static void main(String[] args) {
		sc=new Scanner(System.in);
		System.out.println("Enter String");
		String str=sc.nextLine();
		char target='b'; int count=0;
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)==target) {
				count++;
			}
		} 
		System.out.println(count);
	}
 
}
