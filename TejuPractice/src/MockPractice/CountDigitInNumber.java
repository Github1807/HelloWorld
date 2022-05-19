package MockPractice;
import java.util.*;
public class CountDigitInNumber {
private static Scanner sc;
	public static void main(String[] args) {
		sc=new Scanner(System.in);
		System.out.println("Enter the number whose digits to be calculated");
		String number=sc.nextLine();
		int count=0;
		for(int i=0;i<number.length();i++) { 
			count++; 
		}
		System.out.println(count);
	}

}
