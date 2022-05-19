package myPractice;
import java.util.Scanner;

public class Table {
	 
	private static Scanner sc;

	public static void main(String[] args) {
		int result=0;
		sc= new Scanner(System.in);
		int n=sc.nextInt();
		for( int i=1;i<=10;i++) {
			result=n*i;
			System.out.println(result);
		}
	
	}

}
