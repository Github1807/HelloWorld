package MockPractice;
import java.util.*;
public class ElementIsPresentInArrayVdIndex {
private static Scanner sc;
	public static void main(String[] args) {
		int arr[]= {2,3,4,5,6,7};
		sc=new Scanner(System.in);
		System.out.println("No whose index is to be found");
		int n=sc.nextInt();
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==n) {
				System.out.println("Element is present at index "+i);
			}
		}

	}

}
