package myPractice;
import java.util.Scanner;
public class FractionSum{
	private static Scanner sc;
		public static void main(String args[]) {
			sc=new Scanner(System.in);
			int n=sc.nextInt();
			float sum=0f;
			for(float i=1;i<=n;i++) {
				sum=i+1/i;
			}
			System.out.println(sum);	
		}
}