package myPractice;

import java.util.Scanner;

public class ElementPresentOrNotWithLastIndex {
	private static Scanner sc;
	public static void main(String[] args) {
		sc=new Scanner(System.in);
		System.out.println("Enter the Size Of array");
		int n=sc.nextInt();
		int arr[]=new int[n];
		System.out.println("Enter the elements for array");
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("Enter the Element to be searched");
		int a=sc.nextInt();
		boolean isPresent=false;
		int pos=-1;
		for(int j=0;j<arr.length;j++)
		{
			if(arr[j]==a)
			{
				isPresent=true;
				pos=j;
			}
		}
		if(isPresent)
		{
			System.out.println("Element is Present at index"+" "+pos);
		}
		else
		{
			System.out.println("Element is not Present");
		}
	}

}

