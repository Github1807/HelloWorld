package myPractice;
import java.util.Scanner;
public class FrequencyOfAnElementUsingUserInput {
private static Scanner sc;
	public static void main(String[] args) {
		sc=new Scanner(System.in);
		System.out.println("Enter the size of array");
		int n=sc.nextInt();
		int arr[]=new int[n];
		System.out.println("Enter the Elements Of array");
		for(int i=0;i<n;i++) {
		arr[i]=sc.nextInt();
		}
		System.out.println("Enter the target");
		int target=sc.nextInt();
		int count=0;
		for(int j=0;j<n;j++) {  
			if(arr[j]==target) 
			{
				count=count+1;
			}
		}
		if(count>0) {
		System.out.println("The frequency Of Element is"+" "+count);
	}
		else
		{
			System.out.println("The Element is not Present");	
		}
		}

}
