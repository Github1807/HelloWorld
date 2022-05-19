package myPractice;
import java.util.*;
public class EvenOddCheckUsingTernaryOperator {
	private static Scanner sc;
	public static void main(String[] args) {
		sc=new Scanner(System.in);
		System.out.println("Enter no to be checked");
		int n=sc.nextInt();
		String result=(n%2==0)?("even"):("odd");
		System.out.println(result);
		}

}
