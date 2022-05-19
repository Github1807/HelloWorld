package myPractice;
import java.util.Scanner;

public class SwappingTwo {
	private static Scanner sc;
		public static void main(String args[]) {
			sc=new Scanner(System.in);
			int n=sc.nextInt();
			sc=new Scanner(System.in);
			int m=sc.nextInt();
			int temp=0;
			temp=n;
			n=m;
			m=temp;
			System.out.print(n+" "+m);
		}
}
