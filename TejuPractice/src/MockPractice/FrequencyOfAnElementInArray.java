package MockPractice;
import java.util.*;
public class FrequencyOfAnElementInArray {
	private static Scanner sc;
	public static void main(String[] args) {
		sc=new Scanner(System.in);
		System.out.println("Enter Size Of array");
		int n=sc.nextInt();
		int arr[]=new int[n];
		System.out.println("elements");
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		
		System.out.println("Enter Target");
		int target=sc.nextInt();
		int freq=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==target) {
				freq++;
			} 
		}
		
		if(freq>0) 
			System.out.println(" the target is repeated "+freq+" times");
		else
			System.out.println("element is not present in array");

	}

}
