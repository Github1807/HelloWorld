package myPractice;
import java.util.Scanner;
public class AverageOfElementsPresentInArray {
	private static Scanner sc;
	public static void main(String[] args) {
		sc=new Scanner(System.in);
		System.out.println("Enter the Size of array");
		int n=sc.nextInt();
		int arr[]=new int[n];
		System.out.println("Enter the elements of array");
		float sum=0;
		for(int i=0;i<n;i++) 
		{
			 arr[i]=sc.nextInt();
		}
		for(int j=0;j<n;j++) 
		{
			sum+=arr[j];
		}
		double avg=sum/n;
		System.out.println("The avg is"+avg);
	}

}

