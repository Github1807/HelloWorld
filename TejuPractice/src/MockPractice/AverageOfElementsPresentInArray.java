package MockPractice;
import java.util.*;
public class AverageOfElementsPresentInArray {
	private static Scanner sc;
	public static void main(String[] args) {
		int arr[]=new int[5];
		int sum=0;
		sc=new Scanner (System.in);
		System.out.println("enter elements");
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<arr.length;i++) {
			
			sum=sum+arr[i];
		}
		System.out.println(sum/arr.length);
		
	}

}
