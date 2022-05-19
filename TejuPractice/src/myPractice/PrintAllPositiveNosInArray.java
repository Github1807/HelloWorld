package myPractice;
import java.util.Scanner;
public class PrintAllPositiveNosInArray
{
private static Scanner sc;
public static void main(String[] args)
	{
		sc=new Scanner(System.in);
		System.out.println("Size");
		int n=sc.nextInt();
		int arr[]=new int[n];
		System.out.println("Elements");
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		for(int j=0;j<n;j++)
		{
			if(arr[j]>=0) 
			{
				System.out.print(arr[j]+" ");
			}
		}

	}

} 
