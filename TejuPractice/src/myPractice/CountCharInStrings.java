package myPractice;
import java.util.Scanner;
public class CountCharInStrings {
	private static Scanner sc;
	public static int countChar(String a) {
		int count=0;
		for(int i=0;i<a.length();i++) {
			if(a.charAt(i)!=0) {
				count++;
			}
		} 
		return count; 
	}
	public static void main(String[] args) {
	sc=new Scanner(System.in);
	String a=sc.nextLine();
	System.out.println(countChar(a));

	}

}
