package MockPractice;
import java.util.*;
public class AdditionNDffrnceOf2DArray {
private static Scanner sc;
	public static void main(String[] args) {
		
		int arr[][]=new int[2][3];
		int arr1[][]=new int[2][3];
		int arrSum[][]=new int[2][3];
		sc=new Scanner(System.in);
		
		System.out.println("Enter Elments For first Matrices");
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[0].length;j++) {
				arr[i][j]=sc.nextInt();
			}
		}
		System.out.println("Enter Elements for Second matrix");
		for(int i=0;i<arr1.length;i++) {
			for(int j=0;j<arr1[0].length;j++) {
				arr1[i][j]=sc.nextInt();
			}
		}
		for(int i=0;i<arrSum.length;i++) {
			for(int j=0;j<arrSum[0].length;j++) {
				arrSum[i][j]=arr[i][j]-arr1[i][j];
				System.out.print(arrSum[i][j]+" ");
				
				 
			}
			System.out.println(" ");
		}
	
	}

}
