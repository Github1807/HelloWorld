package myPractice;
import java.util.*;
public class DoubleArrayUsingFunctionCallNDoWhile {
private static Scanner sc;
	public static int[] doubleAr(int arr[])
	{ 
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=arr[i]*2;
			
		}
		return arr;
	}
	public static void main(String[] args) {
	int ch=1;
	sc=new Scanner(System.in);
	do
	{
		System.out.println("size of array");
		int n=sc.nextInt();
		int arr[]=new int[n];
		System.out.println("elements");
		for(int j=0;j<n;j++)
		{
			arr[j]=sc.nextInt();
		}
//		int result[]=new int[n];
//		result=doubleAr(arr);
		System.out.println(doubleAr(arr));
	System.out.println("press 1 to continue");
	ch=sc.nextInt();
	}while(ch==1);

	} 

}
