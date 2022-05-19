package myPractice;
import java.util.*;
public class CheckIfMatricesAreIdenticalOrNot {
private static Scanner sc;
	public static void main(String[] args) {
		int r=2;
		int c=3;
		int j=0;
		int i=0; 
	sc=new Scanner(System.in);
	int arr[][]=new int[r][c];
	System.out.println("enter first matrix");
	for(i=0;i<arr.length;i++) { 
		for( j=0;j<arr[0].length;j++) {
			arr[i][j]=sc.nextInt();
		}
	}
//	for(i=0;i<arr.length;i++) {
//		for( j=0;j<arr[0].length;j++) {
//			System.out.print(arr[i][j]+" ");
//		}
//		System.out.println(" ");
//	}
	int arr1[][]=new int[r][c];
	System.out.println("enter Second matrix");
	for( i=0;i<arr1.length;i++) {
		for( j=0;j<arr1[0].length;j++) {
			arr1[i][j]=sc.nextInt();
		}
	}
//	for( i=0;i<arr1.length;i++) {
//		for(j=0;j<arr1[0].length;j++) {
//			System.out.print(arr1[i][j]+" "); 
//		}
//		System.out.println(" ");
//	}
	boolean isIdentical=false;
	for( i=0;i<arr.length;i++) {
		for(j=0;j<arr[0].length;j++) {
	       if(arr[i][j]==arr1[i][j]) {
	    	   isIdentical=true;
	
	}   
	       
		} 
	}
	if(isIdentical)
    {
 	   System.out.println("are identical");
    }
    else {
 	   System.out.println("are not identical");
    }
 
}}
