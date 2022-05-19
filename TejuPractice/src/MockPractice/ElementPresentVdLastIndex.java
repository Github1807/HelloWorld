package MockPractice;
import java.util.*;
public class ElementPresentVdLastIndex {
private static Scanner sc;
	public static void main(String[] args) {
		int arr[]=new int[5];
		sc=new Scanner(System.in);
		
		System.out.println("Elements");
		
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("target");
		int target=sc.nextInt();
		boolean isPresent=false;
		int i=0;
		int pos=0;
		for(i=0;i<arr.length;i++) {
			if(arr[i]==target) {
				isPresent=true;
				pos=i;
			}
		} 
		if(isPresent) {
			System.out.println("Last index is "+pos);
		}
		else {
			System.out.println("Not present");
		}
		

	}

}
