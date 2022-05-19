package myPractice;
import java.util.Scanner;

public class ElementPresentOrNot {
	private static Scanner sc;
	public static void main(String[] args) {
		sc=new Scanner(System.in);
		System.out.println("Enter the Size of array");
		int n=sc.nextInt();
		int arr[]=new int[n];
		System.out.println("Enter the Elements of array");
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("Enter the element to be searched");
		int a=sc.nextInt();
		Boolean isPresent=false;
		
		
		for(int j=0;j<arr.length;j++)
		{
			if(arr[j]==a)
			{
				isPresent=true;
				
				break;
			}
		}
		if(isPresent)
		{
			System.out.println("Element is Present");
		}
		else
		{
			System.out.println("Element is not present");
		}
	}
}