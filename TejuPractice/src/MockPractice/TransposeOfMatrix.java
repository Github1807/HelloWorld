package MockPractice;
import java.util.*;
public class TransposeOfMatrix {
private static Scanner sc;
	public static void main(String[] args) {
	int arr[][]=new int[3][4];
	sc=new Scanner (System.in);
	System.out.println("Enter elements");
	for(int i=0;i<arr.length;i++) { 
		for(int j=0;j<arr[0].length;j++) {
			arr[i][j]=sc.nextInt();
		} 
		
	} 
	for(int i=0;i<arr[0].length;i++) {
		for(int j=0;j<arr.length;j++) {
			System.out.print(arr[j][i]+" ");
		}
		System.out.println(" ");
	} 
	
	}

}
