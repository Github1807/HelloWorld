package myPractice;

import java.util.Scanner;

public class CountOddNosInArray {
	private static Scanner sc;
	public static void main(String[] args) {
		int count=0;
		sc=new Scanner(System.in);
		System.out.println("Enter size");
		int size=sc.nextInt();
		double balance[]=new double[size];
		System.out.println("enter elements");
		for(int i=0;i<balance.length;i++) {
			balance[i]=sc.nextDouble();
		}
		for(int i=0;i<balance.length;i++) {
			  if(balance[i]%2!=0)
			  {
				  count++;
			  }
		}
		System.out.println(count);

	}

}

