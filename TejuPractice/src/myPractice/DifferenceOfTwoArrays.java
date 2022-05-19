package myPractice;

import java.util.Arrays;
import java.util.Scanner;

public class DifferenceOfTwoArrays {
	private static Scanner sc;
		
		public static void main(String[] args) {
			sc=new Scanner(System.in);
			System.out.println("Enter size of first array");
			int n=sc.nextInt(); 
			System.out.println("Enter size of Second array");
			
			int m=sc.nextInt();
			int arr[]=new int[n]; 
		
			int arr1[]=new int[m];
			int arrSum[]=new int[n];
			
			if(n==m) {
				System.out.println("Enter the elements of first array");
			for(int i=0;i<n;i++)
			{
				arr[i]=sc.nextInt();
			}
			System.out.println("Enter the elements of second array");
			for(int i=0;i<m;i++)
			{
				arr1[i]=sc.nextInt();
			}
			for(int i=0;i<n;i++) 
			{
				
				arrSum[i]= arr[i] - arr1[i];
			} 
			
			System.out.println("Difference Of arrays is"+Arrays.toString(arrSum));
			}
			else
			{
			System.out.println("Difference Of arrays cannot be done");	
			}
			}

	}





