package myPractice;
import java.util.*;
public class SearchAnElementin2DArray {
private static Scanner sc;
	public static void main(String[] args) {
		sc=new Scanner(System.in);
		int arr[][]=new int[2][2];
		System.out.println("Enter elements");
		
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
		System.out.println("enter the element to be searched");
		int n=sc.nextInt();
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[0].length;j++) {
				if(arr[i][j]==n) {				
					System.out.println("element is present in array");
					break;
				}
				
				}
			}
		}   
		}
 

