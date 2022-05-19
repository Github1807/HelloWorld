package myPractice;
import java.util.Scanner;
public class LastIndexAtWhichTheElementPresentInArray
{
	private static Scanner sc;
	public static void main(String[] args)
	{
		sc=new Scanner(System.in);
		System.out.println("Enter the size of array");
		int n=sc.nextInt();
		int arr[]=new int[n];
		System.out.println("Enter the values to fill array");
		for(int i=0;i<n;i++) 
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("Enter the element to be searched");
		int a=sc.nextInt();
		boolean is_Present=false;
		int index=0;
		for(int j=0;j<n;j++)
		{
			if(a==arr[j])
			{
				is_Present=true;
				index=j;
			}
		}
		if(is_Present)
		{
			System.out.println("The Element is Present at "+index);
		}
		else
		{
			System.out.println("The Element is not Present ");
		}
	}

}

