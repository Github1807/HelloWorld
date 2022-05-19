package myPractice;
import java.util.Scanner;
public class TripletInArraySumsToValueEntered {
	private static Scanner sc;
	public static void main(String[] args) {
		sc=new Scanner(System.in);
		int arr[]= {1,2,3,4,5,56,45};
		System.out.println("Enter value to be checked");
		int a=sc.nextInt();
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				for(int k=j+1;k<arr.length;k++)
				{
					if(arr[i]+arr[j]+arr[k]==a)
					{
						System.out.println("Yes a is sum of triplet");
						
					}
				}
			}
		}
		

	}

}
