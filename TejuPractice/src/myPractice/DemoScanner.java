package myPractice;
import java.util.Scanner;

public class DemoScanner {
	private static Scanner sc;
	public static void main(String[] args) {
		sc=new Scanner(System.in);
		System.out.println("Enter your Name :");
		System.out.println("your Name is :"+sc.nextLine());

	}

}
