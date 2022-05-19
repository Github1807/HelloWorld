package MockPractice;
import java.util.*;
public class CheckIfSumOfTwoElementsIsTarget {
	private static Scanner sc;
	public static void main(String[] args) {
		sc=new Scanner(System.in);
		System.out.println("target");
		int n=sc.nextInt();
		int arr[]= {3,5,3,1,5,7,8,3,2,8,5,9};
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
			if(arr[i]+arr[j]==n) {
				System.out.println(arr[i]+" "+arr[j]);
				break; 
			}
		}

	}

}
}
