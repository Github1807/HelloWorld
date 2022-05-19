package MockPractice;
import java.util.*;
public class IdenticalOrNot {
private static Scanner sc;

	public static void main(String[] args) {
		int m=3;
		int n=3;
		int i=0; 
		int j=0;
		sc=new Scanner(System.in);
	int arr[][]=new int[3][3];
	int arr1[][]=new int[3][3];
	System.out.println("enter first matrix");
	boolean isIdentical=false;
	if(m==n) {
	for(i=0;i<arr.length;i++) {
		for(j=0;j<arr[0].length;j++) {
			arr[i][j]=sc.nextInt();
		}
	}
	System.out.println("enter second matrix");
	for( i=0;i<arr1.length;i++) {
		for( j=0;j<arr1[0].length;j++) {
			arr1[i][j]=sc.nextInt();
		} 
	}
	for( i=0;i<arr1.length;i++) {
		for( j=0;j<arr1[0].length;j++) {
			if(arr[i][j]==arr1[i][j]) {
				
				isIdentical=true;
			} 
		}
		}
	 
		if(isIdentical) {
			System.out.println("Is identical");
		}
		else
			System.out.println("Is not identical");
		}
	
	}
 
}
