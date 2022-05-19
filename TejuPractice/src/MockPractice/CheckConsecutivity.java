package MockPractice;
import java.util.Scanner;
public class CheckConsecutivity {
private static Scanner sc;
	public static void main(String[] args) {
		int arr[]=new int [4];
		sc=new Scanner(System.in);
		System.out.println("Enter the Elements");
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("Enter the nos whose consecutivity is to be checked");
		int m=sc.nextInt();
		int n=sc.nextInt();
		boolean isConsecutive=false;
		for(int i=0;i<arr.length;i++) {
			if(m==arr[i] && (n==arr[i-1] || n==arr[i+1]) ){
				isConsecutive=true;
				 
			} 
			
		}
		if(isConsecutive)
			System.out.println("Consecutive");
		else
			System.out.println("NonConsecutive");
		
		
	}

}
