package myPractice;
import java.util.*;
public class EvenAtEVenindexOddAtOdd {
private static Scanner sc;
	public static void main(String[] args) {
		sc=new Scanner(System.in);
		int arr[]=new int[8];
		System.out.println("Elements");
		int evenIndex=0;
		int oddIndex=1;
		int i=0; 
		for(i=0;i<arr.length;i++) {
			int n=sc.nextInt();  
			if(n%2==0) { 
				arr[evenIndex]=n;
				evenIndex+=2; 
			}
			else 
			{ 
				arr[oddIndex]=n;
				oddIndex+=2; 
			}
		}
		for(i=0;i<arr.length;i++) {
		System.out.print(arr[i]+" ");
		}
	}
	}


