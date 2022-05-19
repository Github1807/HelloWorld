package stringQues;
import java.util.*;
public class CountSpecialCharacter {
private static Scanner sc;
	public static void main(String[] args) {
		sc=new Scanner(System.in);
		System.out.println("Enter String");
		String str=sc.nextLine();
		int count=0;
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			if(ch>=65 && ch<91 || ch>=97 && ch<123 || ch>=48 && ch<=57) {
				continue;
			}
			else 
				count++;
				
		}
		System.out.println(count);
	}

}
