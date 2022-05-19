package myPractice;
import java.util.Scanner;
public class MinMaxDemo {
	private static Scanner sc;
	public static void main(String[] args) {
		int arr[]=new int[5];
		sc=new Scanner(System.in);
		System.out.println("Enter the Elements of array");
		int min=Integer.MAX_VALUE;
		int max=Integer.MIN_VALUE;
////		int min=arr[0];
//		int max=arr[0];
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt(); 
			if(min>arr[i])
			{
				min=arr[i];
			}
			if(max<arr[i])
			{ 
				max=arr[i];
			}
		}
		System.out.println("The Smallest Element in array is"+min);
		System.out.println("The greatest Element in array is"+max);
	}

}
