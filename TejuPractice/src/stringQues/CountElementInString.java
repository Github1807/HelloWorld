package stringQues;
import java.util.*;
public class CountElementInString {
private static Scanner sc;
	public static void main(String[] args) {
		sc=new Scanner(System.in);
		System.out.println("Enter string");
		String str=sc.nextLine();
		int count=0;
		char ch[]=str.toCharArray();
		for(int i=0;i<ch.length;i++) {
			if(str.charAt(i)!=0 ) {
				count++;
			}
		}
		System.out.println("There are "+count+" elements in string");
	}

}
