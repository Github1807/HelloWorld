package myPractice;
import java.util.Scanner;
public class ArrayPopulation {
	private static Scanner sc;
	public static void main(String[] args) {
		sc=new Scanner(System.in);
		System.out.println("Enter the Size of array");
		int n=sc.nextInt();
		int arr[]=new int[n];
		System.out.println("Enter the elements of array");
		for(int i=0;i<=n;i++)
		{
			 arr[i]=sc.nextInt();
			 System.out.print(arr[i]+" ");
		}
	}

}
