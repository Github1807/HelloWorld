package myPractice;
import java.util.Scanner;
public class StringConcatenation {
private static Scanner sc;
	public static void main(String[] args) {
		sc=new Scanner(System.in);
		System.out.println("enter first string");
		String str1=sc.nextLine();
		System.out.println("enter second String");
		String str2=sc.nextLine();
		System.out.println(str1.concat(str2));

	}

}
