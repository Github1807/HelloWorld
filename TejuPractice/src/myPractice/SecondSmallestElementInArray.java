package myPractice;
import java.util.Scanner;
public class SecondSmallestElementInArray {
	private static Scanner sc;
		public static void main(String[] args) {
		sc=new Scanner(System.in);
		System.out.println("Enter the Size of array");
		int n=sc.nextInt();
		int arr[]=new int[n];
		System.out.println("Enter the elements of array");
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		int Sec_min=Integer.MAX_VALUE;
		int min=Sec_min-1;
		int temp=0;
		for(int j=0;j<n;j++)
		{
			if(min>arr[j])
			{
				temp=min;
				min=arr[j];
				Sec_min=temp;
			}
		}
		System.out.println(Sec_min);
	}

}
