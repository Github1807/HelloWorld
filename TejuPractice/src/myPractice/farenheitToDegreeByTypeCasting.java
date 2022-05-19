package myPractice;
import java.util.Scanner;
public class farenheitToDegreeByTypeCasting {
	private static Scanner sc;
	public static void main(String[] args) {
		sc=new Scanner(System.in);
		
		System.out.println("Temperature in Farenheit");
		int F=sc.nextInt();
		double D=(Double)((F-32)/1.8);
		System.out.println("Temperature in degrees is " + D);
	}

}
