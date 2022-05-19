package myPractice;
import java.util.*;
public class TwoDArrayDemo {
	private static Scanner sc;
	public static void main(String[] args) {
		sc=new Scanner(System.in);
		int arr[][]=new int[3][3];
		System.out.println("Fill the array");
		
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[0].length;j++) {
				int val=sc.nextInt();
				arr[i][j]=val;
			}
		} 
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[0].length;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println(" ");
		}


	}

}
 