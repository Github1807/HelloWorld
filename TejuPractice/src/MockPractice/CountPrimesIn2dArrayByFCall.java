package MockPractice;
import java.util.*;
public class CountPrimesIn2dArrayByFCall {
private static Scanner sc;

public static boolean countPrimes(int n) {

	boolean isPrime=false;
	for(int i=2;i<n/2;i++) {
		if(n%2==0) {
			isPrime=true;
		}
		
	}
	return isPrime;
	
	
}
	public static void main(String[] args) {
	int arr[][]=new int[2][3];
	int count=0;
	sc=new Scanner(System.in);
	System.out.println("Enter the Elements");
	for(int i=0;i<arr.length;i++) {
		for(int j=0;j<arr[0].length;j++) {
			arr[i][j]=sc.nextInt();
		}
	}
	for(int i=0;i<arr.length;i++) {
		for(int j=0;j<arr[0].length;j++) {
			if(countPrimes(arr[i][j])) {
				count++;
			}
		}
	}
	System.out.println(count);

	}

}
