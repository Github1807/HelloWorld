package MockPractice;
import java.util.*;
public class FirstIndexatWhichElementIsPresent {
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
		int pos=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==target) {
				isPresent=true;
				pos=i;
				break;
			}
		}
		if(isPresent) 
			System.out.println("The target is present at vch is first index "+pos);
		else
			System.out.println("Not Present");
	}

}
