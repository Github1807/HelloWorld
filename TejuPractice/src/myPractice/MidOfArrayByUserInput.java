package myPractice;
import java.util.Scanner;
//import java.util.Arrays;
public class MidOfArrayByUserInput {
	private static Scanner sc;
	public static void main(String[] args) {
		sc=new Scanner(System.in);
		System.out.println("Enter the SIze Of Array");
		int n=sc.nextInt();
		System.out.println("Enter the Elements Of array");
		int arr[]=new int[n];
		int firstIndex=0;
		int lastIndex=arr.length-1;
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		int mid=(firstIndex+lastIndex)/2;
		System.out.println("The mid Of array is"+" "+arr[mid]);
	}

}
