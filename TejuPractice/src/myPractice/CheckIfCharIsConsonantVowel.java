package myPractice;
import java.util.Scanner;

public class CheckIfCharIsConsonantVowel {
	private static Scanner sc;
	public static void main(String[] args) {
		sc=new Scanner(System.in);
		char n=sc.next().charAt(0);
		if(n=='a'||n=='e'||n=='i'||n=='o'||n=='u'||n=='A'||n=='E'||n=='I'||n=='O'||n=='U')
		{
			System.out.println("The letter is vowel");
		}
		else{
			System.out.println("The letter is consonant");
		}
	}

}
