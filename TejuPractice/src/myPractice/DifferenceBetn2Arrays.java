package myPractice;
import java.util.Arrays;
import java.util.Scanner;
public class DifferenceBetn2Arrays {
	private static Scanner sc;
	public static void main(String[] args) {
		sc=new Scanner(System.in);
		System.out.println("Enter the size Of first array");
		int n=sc.nextInt();
		System.out.println("Enter the size Of Second array");
		int m=sc.nextInt();
		int arr[]=new int[n];
		int arr1[]=new int[m];
		int arrDiff[]=new int[n];
		if(n!=m) {
			System.out.println("Addition cannot be done");
		} 
		else{
			System.out.println("Enter the Elements of First array");
			for(int i=0;i<n;i++) {
				arr[i]=sc.nextInt();
			}
			System.out.println("Enter the Elements of Second array");
			for(int i=0;i<n;i++) {
				arr1[i]=sc.nextInt();
			}
			for(int i=0;i<n;i++) {
				arrDiff[i]=arr[i]-arr1[i];
			}
		}
		System.out.println("The Difference between arrays is"+" "+ Arrays.toString(arrDiff));

	}

}
