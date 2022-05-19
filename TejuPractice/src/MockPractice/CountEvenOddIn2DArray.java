package MockPractice;
import java.util.*;
public class CountEvenOddIn2DArray {
private static Scanner sc;
	public static void main(String[] args) {
		int arr[][]=new int[2][3];
		int count=0, oddCount=0;
		sc=new Scanner(System.in);
		System.out.println("Elements");
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[0].length;j++) {
				arr[i][j]=sc.nextInt();
			}
		}
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[0].length;j++) {
				if(arr[i][j]%2==0)
					count++; 
				else
					oddCount++;
			}
		}
		System.out.println("The no of even nos is "+count);
		System.out.println("The no of odd nos is "+oddCount);
		
	}

}
