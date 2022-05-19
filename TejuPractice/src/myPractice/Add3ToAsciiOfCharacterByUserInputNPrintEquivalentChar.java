package myPractice;
import java.util.Scanner;
public class Add3ToAsciiOfCharacterByUserInputNPrintEquivalentChar {
	private static Scanner sc;
	public static void main(String[] args) {
		sc=new Scanner(System.in);
		char x=sc.nextLine().charAt(0);
		int d=3;
		char y=(char)(x+d);
		System.out.println(y);

	}

} 
