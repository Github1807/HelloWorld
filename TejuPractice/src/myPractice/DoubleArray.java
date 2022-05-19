package myPractice;
import java.util.*;
public class DoubleArray {
    private static Scanner sc;
	public static void main(String[] args) {
		sc=new Scanner(System.in);
		System.out.println("Enter size");
		int size=sc.nextInt();
		double balance[]=new double[size];
		System.out.println("enter Bank balance");
		for(int i=0;i<balance.length;i++) {
			balance[i]=sc.nextDouble();
		}
		for(int i=0;i<balance.length;i++) {
			   System.out.print(balance[i]);
		}

	}

}
