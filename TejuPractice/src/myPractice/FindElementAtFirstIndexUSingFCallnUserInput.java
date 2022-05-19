package myPractice;
import java.util.*;
public class FindElementAtFirstIndexUSingFCallnUserInput {
private static Scanner sc;
public static int firstIndex(int arr[],int n) {
	int pos=-1;
	for(int i=0;i<arr.length;i++) {
		if(arr[i]==n) {
			pos=i;
			break;
		}
	} 
	return pos; 
} 
	public static void main(String[] args) {
		sc=new Scanner(System.in);
		
		int arr[]=new int[4];
		System.out.println("Enter Elements");
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("Enter target");
		int n=sc.nextInt();
     System.out.println(firstIndex(arr,n));
	}

}  
