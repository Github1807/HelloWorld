package MockPractice;
import java.util.*;
public class ElementIsPresentOrNot {
private static Scanner sc;
	public static void main(String[] args) {
	int arr[]= {2,3,4,5,5,6};
	sc=new Scanner(System.in);
	System.out.println("Enter No to be searched");
	int n=sc.nextInt();
	boolean isPresent=false;
	for(int i=0;i<arr.length;i++) {
		if(arr[i]==n) 
		isPresent=true;
	}
	if(isPresent)
		System.out.println("Present");
	else 
		System.out.println("Not present");
	}

}
